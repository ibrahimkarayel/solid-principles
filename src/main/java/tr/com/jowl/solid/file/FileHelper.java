package tr.com.jowl.solid.file;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class FileHelper {

    @Autowired
    @Qualifier("jsonOperation")
    FileOperation fileOperation;

    public FileHelper() {
        //fileOperation=new PdfOperation();
    }

    public void executeFileOperation() {
        fileOperation.execute();
    }
}