package imannrhman.belajarspringdasar;


import imannrhman.belajarspringdasar.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({
        "imannrhman.belajarspringdasar.service",
        "imannrhman.belajarspringdasar.repository",
        "imannrhman.belajarspringdasar.configuration"
})
@Import({
        MultiFoo.class
})
public class ComponentConfiguration {
}
