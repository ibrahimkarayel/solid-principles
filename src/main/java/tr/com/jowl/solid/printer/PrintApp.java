package tr.com.jowl.solid.printer;

public class PrintApp {

    public static void main(String[] args) {
        Printer p=new PrinterHtml();
        new PrinterDemo().printD(p);
        p=new PrinterPDF();
        new PrinterDemo().printD(p);
    }
}
