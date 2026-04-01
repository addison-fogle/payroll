package com.addisonfogle.payroll.repository;

import com.addisonfogle.payroll.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}