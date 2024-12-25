package com.sesame.backend;
// 3. Repository Interface

import com.sesame.backend.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}