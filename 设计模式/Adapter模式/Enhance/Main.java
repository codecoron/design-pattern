package Enhance;

public class Main {
    public static void main(String[] args) {
        FileIO f = new Fileproperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("newfile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
