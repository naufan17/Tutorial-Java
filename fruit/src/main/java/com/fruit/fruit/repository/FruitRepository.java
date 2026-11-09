package com.fruit.fruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fruit.fruit.entity.Fruit;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {}
