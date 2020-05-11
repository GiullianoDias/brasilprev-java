package com.bp.apirestbrprev.repository;

import com.bp.apirestbrprev.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findById(long id);
}
