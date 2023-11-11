package imannrhman.belajarspringdasar;

import imannrhman.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class DependsOnTest {

    private ApplicationContext applicationContext;


    @BeforeEach
    void setup(){
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDependsOn() {

        applicationContext.getBean(Foo.class);

    }
}
