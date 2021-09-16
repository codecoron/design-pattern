public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++)
            System.out.print(decochar);
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++)
            System.out.print(decochar);
        System.out.println("");
    }

    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();//这里一定要强转，不知道为啥。
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }
}
