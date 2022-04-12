package test.userstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.userstore.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

