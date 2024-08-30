package com.felipeArgolo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeArgolo.project.entities.OrderItem;
import com.felipeArgolo.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {}
