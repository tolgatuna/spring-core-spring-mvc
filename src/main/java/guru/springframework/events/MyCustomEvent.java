package guru.springframework.events;

import org.springframework.context.ApplicationEvent;

public class MyCustomEvent extends ApplicationEvent {

    public MyCustomEvent(Object source) {
        super(source);
    }
}
