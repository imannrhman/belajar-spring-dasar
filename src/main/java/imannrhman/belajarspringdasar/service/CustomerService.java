package imannrhman.belajarspringdasar.service;

import imannrhman.belajarspringdasar.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Component
public class CustomerService {

    private final CustomerRepository normalCustomerRepository;

    private final CustomerRepository premiumCustomerRepository;

    public CustomerService(@Qualifier("premiumCustomerRepository") CustomerRepository premiumCustomerRepository, @Qualifier("normalCustomerRepository") CustomerRepository normalCustomerRepository) {
        this.premiumCustomerRepository = premiumCustomerRepository;
        this.normalCustomerRepository = normalCustomerRepository;
    }
}
