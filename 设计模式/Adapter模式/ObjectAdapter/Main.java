package ObjectAdapter;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printfWeak();
        p.printStrong();
    }
}
