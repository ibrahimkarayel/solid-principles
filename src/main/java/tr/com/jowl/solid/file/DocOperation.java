package tr.com.jowl.solid.file;

import org.springframework.stereotype.Component;

@Component("docOperation")
public class DocOperation implements FileOperation {

    @Override
    public void execute() {
        System.out.println("Doc operations");

    }
}
