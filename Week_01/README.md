# 学习笔记
## 第一周作业

### 1.  自定义一个 Classloader
  * #### java00 为springboot项目
  * #### 执行main, 路径如下：
      
	  1. java00\src\main\java\com\geek\jvm\HelloClassLoader.java
	
	     
### 2.  展示 Xmx、Xms、Xmn、Meta、DirectMemory、Xss 这些内存参数的关系
  * #### 内存参数含义说明：

        1. -Xmx 堆最大内存
        2. -Xms 堆初始内存
        3. -Xmn: 年轻代大小（eden区+2 survivor）
        4. -Xss：每个线程的堆栈大小，默认1M
        5. -metaspace(堆内) JDK8使用metaspace来替代了permsize:永久代大小
        6. -XX:MaxDirectMemorySize 设置最大堆外内存，默认是-xmx-survivor，也就是基本上和-xmx大小相等
        7. DirectMemory ： 直接内存（Direct Memory）并不是虚拟机运行时数据区的一部分，也不是Java虚拟机规范中定义的内存区域,也可能导致OutOfMemoryError 异常出现
  * #### 内存参数关系图
  * #### 参考文献
      
        1. https://www.cnblogs.com/straybirds/p/8496150.html
        2. https://www.cnblogs.com/duanxz/p/6089421.html
