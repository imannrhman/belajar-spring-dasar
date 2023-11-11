package imannrhman.belajarspringdasar.listener;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;


@Slf4j
public class AppStartingListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(@NonNull  ApplicationStartingEvent event) {
        log.info("Application Starting");
    }
}
