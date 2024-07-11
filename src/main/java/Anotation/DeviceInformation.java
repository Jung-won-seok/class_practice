package Anotation;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DeviceInformation {
    String type() default "device";
    String model();
}

//어댑터 팩토리 프록시 싱글톤 빌더 -> 5개정도 알면 스프링에 도움된다.
