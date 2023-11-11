package imannrhman.belajarspringdasar.application;


import imannrhman.belajarspringdasar.data.Bar;
import imannrhman.belajarspringdasar.data.Foo;
import imannrhman.belajarspringdasar.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.util.List;

@SpringBootApplication
@Import(Bar.class)
public class FooApplication {

    @Bean
    public Foo foo(Bar bar) {
        return new Foo();
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FooApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setListeners(List.of( new AppStartingListener()));
        ApplicationContext applicationContext = application.run(args);
        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }
}
