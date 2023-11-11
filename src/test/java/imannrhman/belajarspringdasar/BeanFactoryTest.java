package imannrhman.belajarspringdasar;

import imannrhman.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeanFactoryTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testBean() {
       ObjectProvider<Foo>  fooObjectProvider = applicationContext.getBeanProvider(Foo.class);


       List<Foo> fooList = fooObjectProvider.stream().toList();

        System.out.println(fooList);


        Map<String, Foo> beans = applicationContext.getBeansOfType(Foo.class);

        System.out.println(beans);


    }
}
