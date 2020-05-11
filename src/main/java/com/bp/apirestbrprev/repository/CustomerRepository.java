package com.bp.apirestbrprev.repository;

import com.bp.apirestbrprev.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findById(long id);
}
