package tr.com.jowl.solid.file;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tr.com.jowl.SpringConfiguration;

public class FileApp {

    public static void main(String[] args) {
        /*In this way, the problem is the “output” is coupled tightly to JsonOperation, every change of output generator may involve code change.*/
        FileOperation fileOperation = new JsonOperation();
        fileOperation.execute();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(SpringConfiguration.class);
        ctx.refresh();
        FileHelper fileHelper = ctx.getBean(FileHelper.class);
        fileHelper.executeFileOperation();
    }

}




