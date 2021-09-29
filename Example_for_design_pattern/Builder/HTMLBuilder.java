import java.io.FileWriter;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {

    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println(title);
        writer.println("</title>");
        writer.println("</head>");

        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
