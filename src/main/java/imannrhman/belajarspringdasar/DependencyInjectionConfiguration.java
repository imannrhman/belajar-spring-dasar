package imannrhman.belajarspringdasar;

import imannrhman.belajarspringdasar.data.Bar;
import imannrhman.belajarspringdasar.data.Foo;
import imannrhman.belajarspringdasar.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class DependencyInjectionConfiguration {


    @Bean(value = "fooFirst")
    public Foo fooFirst() {
        return new Foo();
    }

    @Bean(value = "fooSecond")
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar) {
        return new FooBar(foo,bar);
    }
}
