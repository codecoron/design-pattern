### Singleton(单例模式)
只能生成一个实例，需要用到private和static，这个一般人都知道。但是有一点比较新颖的是，这个例子是在声明一个static对象就直接new了，而不是在getInstance的时候再new，因为考虑到了多线程的问题。