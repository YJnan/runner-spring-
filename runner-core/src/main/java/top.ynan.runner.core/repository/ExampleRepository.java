package top.ynan.runner.core.repository;

import top.ynan.runner.core.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Example数据访问接口
 */
public interface ExampleRepository extends JpaRepository<Example, Long>{
}
