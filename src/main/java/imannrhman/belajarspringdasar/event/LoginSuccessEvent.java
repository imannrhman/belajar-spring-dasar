package imannrhman.belajarspringdasar.event;

import imannrhman.belajarspringdasar.data.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


@Getter
public class LoginSuccessEvent extends ApplicationEvent {

    private final User user;

    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }
}
