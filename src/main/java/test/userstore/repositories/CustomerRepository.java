package test.userstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.userstore.entity.Customer;

import java.util.Collection;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
