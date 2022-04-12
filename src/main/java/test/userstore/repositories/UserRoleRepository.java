package test.userstore.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import test.userstore.entity.UserRole;


public interface UserRoleRepository extends JpaRepository<UserRole, Long>{

}
