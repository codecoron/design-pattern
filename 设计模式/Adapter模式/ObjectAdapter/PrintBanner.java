package ObjectAdapter;

public class PrintBanner implements Print {
    private Banner banner;

    PrintBanner(String string) {
        banner = new Banner(string);
    }

    @Override
    public void printfWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }

}
