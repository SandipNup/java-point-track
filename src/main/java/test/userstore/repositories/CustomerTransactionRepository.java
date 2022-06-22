package test.userstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.userstore.entity.CustomerTransaction;

public interface CustomerTransactionRepository extends JpaRepository<CustomerTransaction, Long> {
}
