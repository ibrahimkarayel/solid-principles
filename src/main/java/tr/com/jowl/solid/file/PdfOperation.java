package tr.com.jowl.solid.file;

import org.springframework.stereotype.Component;

@Component("pdfOperation")
public class PdfOperation implements FileOperation {

    @Override
    public void execute() {
        System.out.println("PDF operations");

    }
}
