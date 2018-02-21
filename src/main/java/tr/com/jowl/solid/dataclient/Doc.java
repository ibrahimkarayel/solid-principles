package tr.com.jowl.solid.dataclient;

public class Doc {
    private  String docName;
    private  String text;

    public Doc(String docName) {
        this.docName = docName;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
