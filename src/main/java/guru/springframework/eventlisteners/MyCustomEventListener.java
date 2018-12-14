package guru.springframework.eventlisteners;

import guru.springframework.events.MyCustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyCustomEventListener implements ApplicationListener<MyCustomEvent> {

    @Override
    public void onApplicationEvent(MyCustomEvent myCustomEvent) {
        String source = (String) myCustomEvent.getSource();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println("### EVENT LISTENER CATCH : " + source);
        }
    }
}
