#!/bin/bash

if [ -z "$1" ]; then
  echo "开始查找Java进程......"
  pid=`ps -eo pid,%cpu,cmd --sort=-%cpu | grep java | grep -v grep | head -1 | awk 'END{print $1}'`
  if [ "$pid" = ""  ]; then
       echo "无 Java进程，退出"
       exit
  fi
else
  pid=$1
fi

curTime=$(date +%Y%m%d%H%M%S)

dumpFilePath="pid-$pid-$curTime.stack"

echo -e "CPU最高的Java进程 = "`jps | grep $pid` "\n" > $dumpFilePath
echo "CPU使用最高的Java进程 = "`jps | grep $pid`

echo "开始遍历线程....."
ps H -eo pid,tid,%cpu --sort=-%cpu | grep $pid | awk '$3>0.0 {total+=$3;printf("nid=0x%x, cpu=%s\n",$2,$3)>>"'$dumpFilePath'"}
END {printf("总和 = %s\n\n", total)>>"'$dumpFilePath'"} '

echo -e " ----------------------- 如下是原生jstack后的结果:---------------------------\n" >>$dumpFilePath
jstack -l $pid >>$dumpFilePath


echo -e " ----------------------- Thread.State 统计分析 :---------------------------\n" >>$dumpFilePath

cat $dumpFilePath | grep Thread.State: | awk -F ":" '{x[$2]++;} END {for(i in x) print( x[i]  ":"  i )>>"'$dumpFilePath'"}'

echo "Dump成功，请前往查看 :" $dumpFilePath
exit