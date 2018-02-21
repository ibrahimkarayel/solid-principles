package tr.com.jowl.solid.dataclient;

public class Manager implements ManagerDataOperation<Doc> ,UserDataOperation<Doc>{

    public void read(Doc doc) {
        System.out.println(" Manager read " + doc.getDocName());
    }

    public void write(Doc doc) {
        System.out.println(" Manager write " + doc.getDocName());
    }

    public void update(Doc doc) {
        System.out.println(" Manager update " + doc.getDocName());
    }

    public void delete(Doc doc) {
        System.out.println(" Manager delete  " + doc.getDocName());
    }
}
