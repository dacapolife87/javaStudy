package week08.src;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        ExampleService exampleService = new ExampleServiceImpl();

        exampleService.sendMessage();
        exampleService.sendMessage("JavaStudy");
        exampleService.sendMessage("Interface", LocalDateTime.now());

        Collection list = new ArrayList();
    }
}
