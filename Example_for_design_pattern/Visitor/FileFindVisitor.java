import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor extends Visitor {

    private String filetype;
    private ArrayList<File> found = new ArrayList<>();

    public FileFindVisitor(String filetype) {
        this.filetype = filetype;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(filetype))
            found.add(file);
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
    }

}

/**
FileFindVisitor是新的Visitor，对数据进行了一个新的处理
 */
