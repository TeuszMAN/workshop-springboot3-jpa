package com.teusz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teusz.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
