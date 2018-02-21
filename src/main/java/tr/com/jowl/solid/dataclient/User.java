package tr.com.jowl.solid.dataclient;

public class User implements UserDataOperation<Doc> {

    public void read(Doc doc) {
        System.out.println(" User read " + doc.getDocName());
    }

    public void write(Doc doc) {
        System.out.println(" User write " + doc.getDocName());
    }


}
