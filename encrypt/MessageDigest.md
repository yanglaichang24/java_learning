##加解密篇 - 消息摘要算法的分类、原理和应用场景 (MD、SHA、MAC、CRC)


> 消息摘要算法是密码学中非常重要的一个分支，它通过对数据提取指纹信息来实现数据签名、数据完整性校验等功能。而且消息摘要算法在加密过程中是不需要私钥的，加密后的数据是不可逆的（目前可以解密逆向的只有 CRC32 算法）。

###目录：

    简介
    特点
    应用场景
    CRC算法
    MD算法
    SHA算法
    MAC算法

###1. 简介

>消息摘要算法的主要特点是加密过程不需要私钥，并且加密的数据不可逆，目前可逆的只有 CRC32 算法。只有输入是相同的明文数据并且采用相同的消息摘要算法，得出来的密文才是一样的。其加密过程的计算量是比较大的，所以在以前计算设备的性能不是那么高的情况下，它只适合于少量数据的加密，比如计算机的口令。现在计算机的性能发展的越来越快，它的应用领域也越来越广。

>消息摘要算法目前主要应用在"数字签名"领域，作为对明文的摘要算法，著名的摘要算法有 RSA 公司的 MD5 算法和 SHA-1 算法及其大量的变体。

### 2. 特点

>消息摘要算法是把任意长度的输入揉合而产生长度固定的伪随机输入的算法，其主要特点有：

- 无论输入的消息有多长，计算出来的消息摘要的长度总是 _**固定的**_ 。比如 MD5 算法摘要的消息有 128bit，用 SHA-1 算法摘要的消息最终有 160bit 的输出，SHA-1 的变体可以产生 192bit 和 256bit 的消息摘要。一般认为摘要的最终输出越长，该摘要算法就越安全。

- 消息摘要看起来是"随机的"。这些比特看上去是胡乱的杂凑在一起的。可以用大量的输入来检验其输出是否相同，一般，不同的输入会有不同的输出，而且输出的摘要消息可以通过随机性检验。但是，一个摘要并不是真正随机的，因为用相同的算法对相同的消息求两次摘要，其结果必然相同；而若是真正随机的，则无论如何都是无法重现的。因此消息摘要是"伪随机的"，即不同的输入生成的摘要不一样。

- 一般地，只要输入的消息不同，对其进行摘要以后产生的摘要消息也必不相同；但相同的输入必会产生相同的输出。这正是好的消息摘要算法所具有的性质：输入改变了，输出也就改变了；两条相似的消息的摘要确不相近，甚至会大相径庭。

- 消息摘要函数是无陷门的单向函数，即只能进行正向的信息摘要，而无法从摘要中恢复出任何的消息，甚至根本就找不到任何与原信息相关的信息。当然，可以采用强力攻击的方法，即尝试每一个可能的信息，计算其摘要，看看是否与已有的摘要相同，如果这样做，最终肯定会恢复出摘要的消息。但实际上，要得到的信息可能是无穷个消息之一，所以这种强力攻击几乎是无效的。

- 好的摘要算法，没有人能从中找到"碰撞"，虽然"碰撞"是肯定存在的。即对于给定的一个摘要，不可能找到一条信息使其摘要正好是给定的。或者说，无法找到两条消息，使它们的摘要相同。
拿 MD5 来验证下：


    public class TestMessageDigest {
            public static void main(String[] args) {
            String a = "abcdefghijklmn";
            String b = "abcdefghijklmn123456789";
            
            System.out.println(toMD5(a));
            System.out.println(toMD5(b));
        }
 
        private static String toMD5(String data) {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte [] bytes = md.digest(data.getBytes());
                return Hex.encodeHexStr(bytes);
            } catch (Exception e) {
                return "";
            }
        }
    }


>无论执行多少次，输出都是：

>0845a5972cd9ad4a46bad66f1253581f
>d6cfc72539e4fb0263e7f6b2cb4fdd7d

而且不同的输入最终的摘要长度都是一样的。


### 3. 应用场景

>一般地，把对一个信息的摘要称为该消息的`指纹或数字签名`，数字签名是保证信息的完整性和不可否认性的方法。数据的完整性是指信宿接收到的消息一定是信源发送的信息，
> 而中间绝无任何更改；信息的不可否认性是指信源不能否认曾经发送过的信息。其实，通过数字签名还能实现对信源的身份识别（认证），
> 即确定"信源"是否是信宿意定的通信伙伴。
> 数字签名应该具有唯一性，即不同的消息的签名是不一样的；同时还应具有不可伪造性，即不可能找到另一个消息，
> 使其签名与已有的消息的签名一样；还应具有不可逆性，即无法根据签名还原被签名的消息的任何信息。这些特征恰恰都是消息摘要算法的特征，
> 所以消息摘要算法适合作为数字签名算法。

>拓展一下：A 使用 B 的公钥对计算出来摘要进行加密，并将摘要和消息(消息明文)一并发送给 B

>假想 A 发送给 B 的消息被 C 截获了,此时 C 对消息明文可见。但 C 不能解码出摘要内容（A 使用 B 的公钥发送的摘要只有 B 的私钥可以解密，而 B 的私钥只有 B 才持有）。设想此时 C 对消息修改后重新做摘要，并使用 B 的公钥进行加密，再发送给 B。此时 B 端解密出来的摘要已经被篡改，因此 C 的修改在 B 端通过了摘要验证。这样虽然对消息进行摘要但仍然还是无法保证数据不被篡改。为了解决这个问题，要求 A 端不能只使用明文进行特征提取，A 端可以使用一些私密信息（只有A 和 B 知晓的消息，C 并不知情）与消息明文一起混合提取特征。这样虽然 C 可以获取明文，但对秘密信息并不知情，C 尝试重新生成摘要时由于缺失私密信息也无法生成被 B 成功验证的摘要，这样使用摘要算法就防止了第三方对数据的篡改。


####4. CRC算法

>CRC 算法不属于加密场景，比较古老，但是在数据压缩领域被广泛使用作为完整性校验，CRC32 算法是可逆的。

>在数据传输过程中，无论传输系统的设计再怎么完美，差错总会存在，这种差错可能会导致在链路上传输的一个或者多个帧被破坏（出现比特差错，0变为1，或者1变为0），从而接受方接收到错误的数据。为尽量提高接受方收到数据的正确率，在接收方接收数据之前需要对数据进行差错检测，当且仅当检测的结果为正确时接收方才真正收下数据。检测的方式有多种，常见的有奇偶校验、因特网校验和循环冗余校验等。
>对于 CRC 算法这边就不做深入分析了。

#### 5. MD算法

##### 5.1 简介
>MD 算法： Message Digest Algorithm ，目前主流的是 MD5 算法，为第五版算法，之前有 MD2、MD3、MD4 算法。

> MD 算法中 MD5 算法最流行，也是目前最流行的信息摘要算法，是大部分系统的首先，虽然 MD 算法破解门槛越来越低，但是一般应用足够了。



##### 5.2 例子

    private static void testMD(String algo, String data) throws Exception {
       MessageDigest md = MessageDigest.getInstance(algo);
       byte[] bytes = md.digest(data.getBytes());
       String result = Hex.encodeHexStr(bytes);
       System.out.println(algo + " 加密后的串 - 16进制：" + result);
    }

    public static void main(String[] args) {
        String data = "hello md";
        try {
            testMD("MD2", data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    //        try {
    //            testMD("MD3", data);
    //        } catch (Exception e) {
    //            e.printStackTrace();
    //        }
    //        try {
    //            testMD("MD4", data);
    //        } catch (Exception e) {
    //            e.printStackTrace();
    //        }
        try {
           testMD("MD5", data);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

>现在 Java 已经不支持 MD3 和 MD4 算法了，执行上述代码输出：

> MD2 加密后的串 - 16进制：7c2d949cb410b5bf1c447b01c9d21aef
> MD5 加密后的串 - 16进制：6749622d749c56691b51cdf9fb31c396

可以看到，MD2 和 MD5 对于生成的消息摘要长度是一样的。



5.3 实现原理
以目前最主流的 MD5 算法作为分析：

(1) 数据填充

对消息进行数据填充，使消息的长度对512取模得448，设消息长度为X，即满足X mod 512=448。根据此公式得出需要填充的数据长度。

填充方法：在消息后面进行填充，填充第一位为1，其余为0。

(2) 添加消息长度

在第一步结果之后再填充上原消息的长度，可用来进行的存储长度为64位。如果消息长度大于264，则只使用其低64位的值，即（消息长度 对 264取模）。在此步骤进行完毕后，最终消息长度就是512的整数倍。

(3) 数据处理

准备需要用到的数据：

4个常数： A = 0x67452301, B = 0x0EFCDAB89, C = 0x98BADCFE, D = 0x10325476;
4个函数：F(X,Y,Z)=(X & Y) | ((~X) & Z); G(X,Y,Z)=(X & Z) | (Y & (~Z));  H(X,Y,Z)=X ^ Y ^ Z; I(X,Y,Z)=Y ^ (X | (~Z));
把消息分以512位为一分组进行处理，每一个分组进行4轮变换，以上面所说4个常数为起始变量进行计算，重新输出4个变量，以这4个变量再进行下一分组的运算，如果已经是最后一个分组，则这4个变量为最后的结果，即 MD5 值。

对于具体实现感兴趣的同学可以看看这个代码：https://github.com/JieweiWei/md5





#### 6. SHA算法

##### 6.1 简介
>安全散列算法（英语：Secure Hash Algorithm，缩写为 SHA）是一个密码散列函数家族，是 FIPS 所认证的安全散列算法。能计算出一个数字消息所对应到的长度固定的字符串（又称消息摘要）的算法。且若输入的消息不同，它们对应到不同字符串的机率很高。

>SHA 家族的五个算法，分别是 SHA-1、SHA-224、SHA-256、SHA-384，和 SHA-512，由美国国家安全局（NSA）所设计，并由美国国家标准与技术研究院（NIST）发布；是美国的政府标准。后四者有时并称为 SHA-2。SHA-1 在许多安全协定中广为使用，包括 TLS 和 SSL、PGP、SSH、S/MIME 和 IPsec，曾被视为是 MD5（更早之前被广为使用的杂凑函数）的后继者。但 SHA-1 的安全性如今被密码学家严重质疑，虽然至今尚未出现对 SHA-2 有效的攻击，它的算法跟 SHA-1 基本上仍然相似，因此有些人开始发展其他替代的杂凑算法。
>SHA 算法枝繁叶茂，比 MD 算法安全性高，尝尝用在一些安全性系数要求较高的环境，目前也逐渐替代 MD5 算法，用在注册、登录模块，在数字证书的签名算法中，SHA 算法更广泛。
>Bitcoin 中就使用了 SHA：



前面的文章中我有介绍 Bitcoin 生成钱包地址使用了 Base58 算法：加解密篇 - 编码传输算法base64和比特币地址生成算法base58

Bitcoin 生成钱包地址的逻辑：

Bitcoin 开发使用了椭圆曲线算法生成公钥和私钥，安全散列算法生成的公钥是33个字节的大数，私钥是32个字节的大数，钱包文件的 wallet.dat 中直接存了公钥和私钥。我们在接收和发送时使用的地址是公钥经过算法处理得到的，具体过程是公钥经过 SHA 算法得到32个字节的哈希数据，再经过 RIPEMED 算法处理后得到20字节的摘要结果，最后经过字符转换过程得到我们看到的地址。这个字符转换过程与私钥的字符转换过程完成相同，步骤是先把输入的内容（对于公钥就是20字节的摘要结果，对于私钥就是32字节的大数）增加版本号，经过连续两次 SHA 算法，取后一次哈希结果的前4字节作为校验码附在输入内容的后面，然后再经过 Base58 编码，得到字符串。



##### 6.2 例子
    private static void testSHA(String algo, String data) throws Exception {
       MessageDigest md = MessageDigest.getInstance("SHA-224");
       md.update(data.getBytes());
       String result = Hex.encodeHexStr(md.digest());
       System.out.println(algo + " 加密后的串 - 16进制：" + result);
    }

    public static void main(String[] args) {
        String data = "hello sha";
        try {
            // 算法名称对于 SHA1 方式:  可以是 SHA 也可以是 SHA1
            testSHA("SHA1", data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            testSHA("SHA-224", data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            testSHA("SHA-384", data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            testSHA("SHA-256", data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            testSHA("SHA-512", data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

执行输出：

>SHA1 加密后的串 - 16进制：d849fa50c622f5acc567fc0a72b1aa2a257b255a5114093e17a7f100
>SHA-224 加密后的串 - 16进制：d849fa50c622f5acc567fc0a72b1aa2a257b255a5114093e17a7f100
>SHA-384 加密后的串 - 16进制：d849fa50c622f5acc567fc0a72b1aa2a257b255a5114093e17a7f100
>SHA-256 加密后的串 - 16进制：d849fa50c622f5acc567fc0a72b1aa2a257b255a5114093e17a7f100
>SHA-512 加密后的串 - 16进制：d849fa50c622f5acc567fc0a72b1aa2a257b255a5114093e17a7f100

可以看到，这几个 SHA 算法生成的长度和内容都一样，只不过算法实现逻辑有差异。



6.3 实现原理
SHA 的实现原理比较复杂，对原理感兴趣的同学可以看看这篇文章：信息摘要算法之三：SHA256算法分析与实现





#### 7. MAC算法

##### 7.1 简介
>MAC 算法 (Message Authentication Codes) 带秘钥的哈希函数：消息的散列值由只有通信双方知道的秘钥K来控制，此时哈希值称作 MAC。MAC 吸收了 MD 和 SHA 的精髓，安全程度更高。

>商业银行中一般都会使用 MAC 算法，比如 POS 终端加密。

分类：

- MAC：Message Authentication Code。
- HMAC：keyed-Hash Message Authencication Code，含有密钥的散列函数算法，融合 MD、SHA。
- MD 系列：HmacMD2、HmacMD4、HmacMD5。
- SHA 系列：HmacSHA1、HmacSHA224、HmacSHA256、HmacSHA384、HmacSHA512。

应用：SecureCRT。

实现方式：

JDK（缺少二进制字节数组转十六进制的工具，可借助 CC 或 BC 的工具类完成）。
Commons Codec（CC，在1.10版本中加入的）。
Bouncy Castle（BC）。
CC 很好的封装了 JDK 的底层，但是 CC 是在1.10版本中才添加了 hmac 系列算法。



##### 7.2 例子
使用 MAC 算法以 MD5 方式加密（私钥 + MD5）：

    private static void jdkHmacMD5(String data) throws Exception {
        // 初始化 KeyGenerator
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacMD5");
        // 产生密钥
        SecretKey secretKey = keyGenerator.generateKey();
        // 获得密钥
		byte[] key = secretKey.getEncoded();
        // 还原密钥
        SecretKey restoreSecretKey = new SecretKeySpec(key, "HmacMD5");
        // 实例化 MAC
        Mac mac = Mac.getInstance(restoreSecretKey.getAlgorithm());
        // 初始化 MAC
        mac.init(restoreSecretKey);
        byte[] hmacMD5Bytes = mac.doFinal(data.getBytes());//执行摘要
        System.out.println("jdkHmacMD5 : " + Hex.encodeHexStr(hmacMD5Bytes));
    }
 
    private static void bcHmacMD5(String data) {
        HMac hmac = new HMac(new MD5Digest());
        hmac.init(new KeyParameter(org.bouncycastle.util.encoders.Hex.decode()));
        hmac.update(src.getBytes(), 0, src.getBytes().length);
        // 执行摘要
        byte[] hmacMD5Bytes = new byte[hmac.getMacSize()];
        hmac.doFinal(hmacMD5Bytes, 0);
        System.out.println("bc hmacMD5 : " + org.bouncycastle.util.encoders.Hex.toHexString(hmacMD5Bytes));
    }
 
    public static void main(String[] args) {
        String data = "hello hmacMD5";
        try {
            jdkHmacMD5(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bcHmacMD5(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

执行输出：

>jdkHmacMD5 : 837e9298c32d46f3cc2c8c75e5329711

>bc hmacMD5 : 837e9298c32d46f3cc2c8c75e5329711

产生密钥两种方式：

直接使用 JDK 的类。
自己指定字节数组。


##### 7.3 实现原理
对实现原理感兴趣的同学可以看看这篇文章：mac算法Java实现的理解。
ps://blog.csdn.net/u014294681/article/details/86678138