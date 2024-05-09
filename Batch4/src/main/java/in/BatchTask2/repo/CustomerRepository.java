package in.BatchTask2.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.BatchTask2.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}
