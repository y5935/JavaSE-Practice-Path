# JavaSE 
> JavaSE 学习与实践总结

<!-- MarkdownTOC -->

- [0. 学习路径](#0-%E5%AD%A6%E4%B9%A0%E8%B7%AF%E5%BE%84)
    - [0.1 The Path to Study and Practise](#01-the-path-to-study-and-practise)
        - [0.1.1 Requirement](#011-requirement)
        - [0.1.2 Path to learn](#012-path-to-learn)
        - [0.1.3 Reference](#013-reference)
        - [0.1.4 Record \(学习记录\)](#014-record-%E5%AD%A6%E4%B9%A0%E8%AE%B0%E5%BD%95)
- [1. Project Practice](#1-project-practice)

<!-- /MarkdownTOC -->


<a name="0-%E5%AD%A6%E4%B9%A0%E8%B7%AF%E5%BE%84"></a>
## 0. 学习路径

<a name="01-the-path-to-study-and-practise"></a>
### 0.1 The Path to Study and Practise

<a name="011-requirement"></a>
#### 0.1.1 Requirement

纵观 Java 后端开发技术点, JavaSE 是核心业务处理的基础, 应当:  

- 熟练掌握基础语法, 运用 Java 完成功能需求;  
- 了解设计思想 / JDK 源码, 具备分析问题 / 解决问题的能力;
- 为后期 Java 开发进阶(JVM 调优, 高性能...), 打下基础;  

<a name="012-path-to-learn"></a>
#### 0.1.2 Path to learn
> 根据 [尚学堂.高淇老师: Java 300 集]() 教学内容, 指定学习路径;

|                                                                                       Core Technologies                                                                                        |                                                              Simple Intro                                                              |
|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------------------------------------------------------------:|
|                 [1. Java History, Present and Future](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/1.%20Java%20History%2C%20Present%20and%20Future.md)                 |   1995 年 Sun 公司正式公布 Java 语言, 时至今日已经近 24 年历史; Sun 公司已经被年轻一代遗忘, 但是 Java 仍然在 Web 开发领域簌簌作响; Java 的前世今生, 充满了传奇色彩, 也是每一位 Java 开发者必须要了解的历史.   |
|              [2. DataType, Operator and Control Flow](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/2.%20DataType%2C%20Operator%20and%20Control%20Flow.md)              |                                                           数据类型 / 运算符 / 控制流程                                                            |
|                                [3. Oriented-Object(OOA/OOD/OOP)](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/3.%20Oriented-Object.md)                                 |                                            面向对象, 是 90 年代软件开发的产物, 时至今日仍在使用, 也是 Java 编程的精髓所在.                                            |
|                                   [4. Utility Classes (工具类)](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/4.%20Utility%20Classes.md)                                   |                                                     Java 提供了常用的工具类, 可以简化 / 加快日常开发                                                      |
|                               [5. Exception Handling (异常处理)](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/5.%20Exception%20Handling.md)                                |                                                                  异常处理                                                                  |
|                [6. Array & Java Collection Framework](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/6.%20Array%20%26%20Java%20Collection%20Framework.md)                |            从 Array (数组) 到 Java 集合, 主要就是为了解决数据在程序运行时(内存中)存储的问题, 如何用最合适的数据结构存储数据, 如何通过最优的算法处理数据, 这就是 Array 和 Java 集合主要的目的所在.             |
|                              [7. Generic Programming (泛型编程)](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/7.%20Generic%20Programming.md)                               |                                                                  泛型编程                                                                  |
|                                             [8. Java I/O](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/8.%20Java%20IO.md)                                              |                                                          Java Stream (Java 流)                                                          |
|                                                                                     [9. Java Multi-thread                                                                                      |             Java 多线程编程](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/9.%20Java%20Multi-thread.md)              |
|                                 [10. Network Programming](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/10.%20Network%20Programming.md)                                 |                                                               Java 网络编程                                                                |
|                                [11. Be Familiar to JVM](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/11.%20Be%20Familiar%20to%20JVM.md)                                |                                                                 走进 JVM                                                                 |
|                               [12. Design Pattern (GOF) (设计模式)](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/12.%20Design%20Pattern.md)                                |                                                             GOF 的 23 种设计模式                                                             |
|                              [13. Regular Expression (正则表达式)](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/13.%20Regular%20Expression.md)                              |                                                                 正则表达式                                                                  |
|                                                 [14. JDBC](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/14.%20JDBC.md)                                                 |                                                              Java JDBC 编程                                                              |
|   [15. DataStructure & The commonly used Algorithms](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/15.%20DataStructure%20%26%20The%20commonly%20used%20Algorithms.md)   |                                                               数据结构与常用的算法                                                               |
|                                   [16. The future (缘起, 奋斗)](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/16.%20The%20future.md) ...                                    |                                                热爱开发, 立志做一名对社会有价值的软件工程师   -- Forrest Lyu                                                |

<a name="013-reference"></a>
#### 0.1.3 Reference

1. ["尚学堂.高淇老师: Java 300 集"](http://www.bjsxt.com/download.html), 导学;

2. ["Core Java (Java 核心技术卷)"](https://pan.baidu.com/s/1o7ZnJrO#list/path=%2F), 书籍参考;

3. ["Think in Java (Java 编程思想)"](https://pan.baidu.com/s/1o7ZnJrO#list/path=%2F), 书籍参考;

4. ["算法导论"](https://book.douban.com/subject/20432061/), 前三部分基础知识;

<a name="014-record-%E5%AD%A6%E4%B9%A0%E8%AE%B0%E5%BD%95"></a>
#### 0.1.4 Record (学习记录)

- [x] ["1. Java History, Present and Future.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/1.%20Java%20History%2C%20Present%20and%20Future.md)
- [x] ["2. DataType, Operator and Control Flow.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/2.%20DataType%2C%20Operator%20and%20Control%20Flow.md)
- [ ] ["3. Oriented-Object.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/3.%20Oriented-Object.md)
- [ ] ["4. Utility Classes.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/4.%20Utility%20Classes.md)
- [x] ["5. Exception Handling.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/5.%20Exception%20Handling.md)
- [ ] ["6. Array & Java Collection Framework.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/6.%20Array%20%26%20Java%20Collection%20Framework.md)
- [ ] ["7. Generic Programming.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/7.%20Generic%20Programming.md)
- [ ] ["8. Java IO.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/8.%20Java%20IO.md)
- [ ] ["9. Java Multi-thread.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/9.%20Java%20Multi-thread.md)
- [ ] ["10. Network Programming.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/10.%20Network%20Programming.md)
- [ ] ["11. Be Familiar to JVM.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/11.%20Be%20Familiar%20to%20JVM.md)
- [ ] ["12. Design Pattern.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/12.%20Design%20Pattern.md)
- [ ] ["13. Regular Expression.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/13.%20Regular%20Expression.md)
- [ ] ["14. JDBC.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/14.%20JDBC.md)
- [ ] ["15. DataStructure & The commonly used Algorithm.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/15.%20DataStructure%20%26%20The%20commonly%20used%20Algorithms.md)
- [ ] ["16. The future.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/16.%20The%20future.md)
- [ ] ["17. 基于 Eclipse 运用 Git 通过 GitHub 进行团队项目协同开发.md"](https://github.com/ForrestLyu/JavaSE-Practice-Path/blob/master/Notes/17.%20%E5%9F%BA%E4%BA%8E%20Eclipse%20%E8%BF%90%E7%94%A8%20Git%20%E9%80%9A%E8%BF%87%20GitHub%20%E8%BF%9B%E8%A1%8C%E5%9B%A2%E9%98%9F%E9%A1%B9%E7%9B%AE%E5%8D%8F%E5%90%8C%E5%BC%80%E5%8F%91.md)

<a name="1-project-practice"></a>
## 1. Project Practice
> "当你开始自己的第一个项目的时候, 才是自己真正学习编程的开始"  -- 某某

todo... ... 
