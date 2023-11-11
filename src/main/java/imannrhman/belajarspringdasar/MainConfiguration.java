package imannrhman.belajarspringdasar;


import imannrhman.belajarspringdasar.configuration.BarConfiguration;
import imannrhman.belajarspringdasar.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
