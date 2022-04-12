package test.userstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import test.userstore.entity.Store;

public interface StoreRepository extends JpaRepository<Store, Long>{

}
