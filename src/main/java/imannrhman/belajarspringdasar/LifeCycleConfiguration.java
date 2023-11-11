package imannrhman.belajarspringdasar;


import imannrhman.belajarspringdasar.data.Connection;
import imannrhman.belajarspringdasar.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    @Bean()
    public Server server() {
        return new Server();
    }
}
