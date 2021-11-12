# ChainofResponsibility(责任链)
知道ChainofResponsibility是如何运作的并不难。难的是与其它一些设计模式进行对比。

ChainofResponsibility其中用到了Composite模式。(感觉有继承，有多态，就有了Composite模式)

弱化了发出请求的人和处理请求的人之间的关系 。(就是不需要知道哪个人是处理哪个问题，直接请求处理即可，但是这样的缺点是会导致延迟。总之依据实际情况选择合适的设计模式吧)

> 示例类图

名字 |说明 
-----|----
Trouble | 表示问题发生的类。它带有问题编号(number)
Support | 用来解决问题的抽象类用来解决问题的具体类(永远不处理问题)
LimitSupport | 用来解决问题的具体类(仅解决编号小于指定编号的问题)
OddSupport | 用来解决问题的具体类(仅解决奇数问题的具体类)
SpecialSupport  | 用来解决问题的具体类(仅解决指定编号问题)
Main | 制作support的责任链，制造问题，并测试程序

---
![ChainofResponsibility_concrete](/resources/ChainofResponsibility_concrete.jpg)

---

> 抽象类图

---
![ChainofResponsibility_abstract](/resources/ChainofResponsibility_abstract.jpg)
---