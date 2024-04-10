#guava-cache

##1. CacheBuilder---构建类

![](../img/cache/img_3.png)

| field | comment |
| ----- |   --    |

###1.1 方法列表

####builder 方法
![](../img/cache/img.png)

### 1.2 辅助类

#### 1.2.1 RemovalListener---接口#监听

#### Weigher---接口#权重
![](../img/cache/Weigher.png)


#### CacheStats---

#### Ticker---抽象类#心跳

>A time source; returns a time value representing the number of nanoseconds elapsed since some fixed but arbitrary point in time. Note that most users should use Stopwatch instead of interacting with this class directly


#### Equivalence ---
#### Suppliers---

#### StatsCounter---内部接口#监控
>com.google.common.cache.AbstractCache.StatsCounter

![](../img/cache/StatsCounter.png)

#### CacheLoader---接口#业务加载接口
![](../img/cache/CacheLoader.png)
***


##2. Cache---顶层接口 
![](../img/cache/Cache.png)

###2.1 LoadingCache---子接口
![](../img/cache/LoadingCache.png)

#### 2.1.1 方法
##### get

###2.2 LocalManualCache---静态内部类
>com.google.common.cache.LocalCache.LocalManualCache

![](../img/cache/img_1.png)

####2.2.1 LocalLoadingCache---内部静态子类

>com.google.common.cache.LocalCache.LocalLoadingCache

![](../img/cache/img_2.png)

##### get---获取
![](../img/cache/Snipaste_2022-11-28_15-30-12.png)


##3. LocalCache---核心类#Map
![](../img/cache/LocalCache.png)

### getOrLoad---查询
![](../img/cache/Snipaste_2022-11-29_17-16-12.png)

### get
![](../img/cache/Snipaste_2022-11-29_17-18-16.png)

### hash
![](../img/cache/Snipaste_2022-11-29_17-25-36.png)

###rehash
![](../img/cache/Snipaste_2022-11-29_17-29-46.png)

### 辅助类
#### Segment---内部静态类#段

>com.google.common.cache.LocalCache.Segment

![](../img/cache/Segment.png)

#####get---方法#获取








