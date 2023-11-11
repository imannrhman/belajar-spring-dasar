package imannrhman.belajarspringdasar;

import imannrhman.belajarspringdasar.data.Bar;
import imannrhman.belajarspringdasar.data.Foo;
import imannrhman.belajarspringdasar.scope.DoubleScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope("prototype")
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }


    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubleScope());
        return configurer;
    }


    @Bean
    @Scope("doubleton")
    public Bar bar() {
        log.info("Create New Bar");
        return new Bar();
    }

}
