package tr.com.jowl.solid.file;

import org.springframework.stereotype.Component;

@Component("jsonOperation")
public class JsonOperation implements FileOperation {

    @Override
    public void execute() {
        System.out.println("Json operations");

    }
}
