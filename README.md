# TWT Android 二面选做题

## 背景

某计算机组装公司主要销售各类组装计算机，计算机一般由CPU、内
存、主板、硬盘等组件构成。具体组件信息如下:
|组件 	组件品牌（类名） 	组件属性（成员变量）
|CPU|Intel, AMD|name, coreNum, price|
|内存|Samsung, Kingston|name, volume, price|
|硬盘|Seagate, WestDigitals|name, volume, price|
|主板|Asus, Gigabyte|name, speed, price|

---

设计组件类，每个组件类都有成员方法·`print()`，该方法可以打印（在控制台输出）`"组件名+work"`。

设计一个计算机类命名为 `Computer`，由上述四类组件组装而成，成员变量包括计算机的名称、CPU、内存、硬盘、主板以及总价格等。计算机类有成员方法`print()`，该方法可以打印出计算机名称、价格、组件信息等计算机信息。

设计一个计算机销售主类命名 `ComputerStore` ，有 Java 程序的入口方法 main，在 main 方法内实例化3个由不同组件组装在一起的计算机对象，并使用计算机对象的方法展示计算机信息（即计算机名称、价格、组件信息）。

作者：吃啥呀
链接：https://www.jianshu.com/p/529c04a415e0
来源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
