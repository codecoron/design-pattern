public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2)
            System.out.println("obj1与obj2是相同的实例");
        else
            System.out.println("obj1与obj2是不同的实例");
        System.out.println("End");
    }
}
/* 
输出
start
生成一个实例
obj1与obj2是相同的实例
End
*/