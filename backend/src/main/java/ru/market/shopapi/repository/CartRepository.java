package ru.market.shopapi.repository;

import ru.market.shopapi.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CartRepository extends JpaRepository<Cart, Integer> {
}
