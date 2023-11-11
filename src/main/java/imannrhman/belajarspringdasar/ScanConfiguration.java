package imannrhman.belajarspringdasar;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "imannrhman.belajarspringdasar.configuration"
})
public class ScanConfiguration {
}
