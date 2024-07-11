package Anotation;

import java.lang.annotation.Annotation;

@DeviceInformation(model="Galaxy Book Pro")
public class Device {
    Device() {
    }

    private DeviceInformation getDeviceInformation() {
        Annotation[] annotations = this.getClass().getAnnotations();
        for(Annotation annotation : annotations) {
            if (annotation instanceof DeviceInformation) {
                return  (DeviceInformation) annotation;
            }
        }
        throw new UnsupportedOperationException("No Device Information");
    }

    public String getType() {
        try {
            return this.getDeviceInformation().type();
        }
        catch(Exception e) {
            return "unknown";
        }
    }

    public String getModel() {
        try {
            return  this.getDeviceInformation().model();
        }
        catch(Exception e) {
            return "unknown";
        }
    }
}
//리플랙션 -> 클래스 타입을 강제 로딩..어노테이션도 만들자
