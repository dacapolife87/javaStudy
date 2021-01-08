package week08.src;

import java.time.LocalDateTime;

public interface ExampleService {

    public static final int serviceId = 1000;
    public abstract void sendMessage();
    public abstract void sendMessage(String text);
    default void sendMessage(String text, LocalDateTime sendTime) {
        System.out.println("전송할 메시지는 ["+text+"] 이고 전송시간은["+sendTime+"]입니다.");
    };
}
