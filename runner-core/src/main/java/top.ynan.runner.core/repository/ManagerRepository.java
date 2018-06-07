package top.ynan.runner.core.repository;

import top.ynan.runner.core.domain.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

    public Manager findByUsernameAndPassword(String username, String password);
}