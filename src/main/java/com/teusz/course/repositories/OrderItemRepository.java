package com.teusz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teusz.course.entities.OrderItem;
import com.teusz.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {



}
