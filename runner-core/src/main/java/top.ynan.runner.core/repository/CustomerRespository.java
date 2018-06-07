package top.ynan.runner.core.repository;

import top.ynan.runner.core.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRespository extends JpaRepository<Customer, Long>{

    public Customer findByUsernameAndPassword(String username, String password);

}