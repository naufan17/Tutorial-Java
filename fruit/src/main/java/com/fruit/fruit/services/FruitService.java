package com.fruit.fruit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fruit.fruit.entity.Fruit;
import com.fruit.fruit.repository.FruitRepository;

@Service
public class FruitService {
  
  @Autowired
  private FruitRepository fruitRepository;

  public List<Fruit> getAllFruits() {
    return fruitRepository.findAll();
  }

  public Fruit getFruitById(Long id) {
    return fruitRepository.findById(id).orElse(null);
  }

  public Fruit createFruit(Fruit fruit) {
    return fruitRepository.save(fruit);
  }

  public Fruit updateFruit(Long id, Fruit fruit) {
    Fruit existingFruit = fruitRepository.findById(id).orElse(null);
    if (existingFruit != null) {
      existingFruit.setName(fruit.getName());
      return fruitRepository.save(existingFruit);
    }
    return null;
  }

  public void deleteFruit(Long id) {
    fruitRepository.deleteById(id);
  }
}
