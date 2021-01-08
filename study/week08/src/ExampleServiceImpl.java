package week08.src;

import java.time.LocalDateTime;

public class ExampleServiceImpl implements ExampleService {

    @Override
    public void sendMessage() {
        System.out.println("ExampleService 인터페이스의 구현체");
    }

    @Override
    public void sendMessage(String text) {
        System.out.println("전송할 메시지는 ["+text+"] 입니다.");
    }


}
