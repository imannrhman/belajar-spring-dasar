package imannrhman.belajarspringdasar;

import imannrhman.belajarspringdasar.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean(value = "sd")
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Create new foo 1");
        return foo;
    }

}
