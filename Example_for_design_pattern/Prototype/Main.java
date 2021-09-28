import framework.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinPen upen = new UnderlinPen('*');
        MessageBox mb = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mb);

        Product p1 = manager.create("strong message");
        p1.use("Hello,world");
        Product p2 = manager.create("warning box");
        p2.use("Hello,world");
    }
}
