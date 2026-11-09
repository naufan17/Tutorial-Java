package com.fruit.fruit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fruit.fruit.entity.Fruit;
import com.fruit.fruit.services.FruitService;


@Controller
// @RequestMapping()
public class FruitController {
  
  @Autowired
  private FruitService fruitService;

  @GetMapping("/fruits")
  public String getAllFruits(Model model) {
    model.addAttribute("fruits", fruitService.getAllFruits());
    return "fruit-list";
  }

  @GetMapping("/fruits/new")
  public String createFruit(Model model) {
    model.addAttribute("fruit", new Fruit());
    return "fruit-form";
  }

  @PostMapping("/fruits")
  public String saveFruit(@ModelAttribute Fruit fruit) {
    fruitService.createFruit(fruit);
    return "redirect:/fruits";
  }

  @GetMapping("/fruits/edit/{id}")
  public String editFruit(@PathVariable Long id, Model model) {
    model.addAttribute("fruit", fruitService.getFruitById(id));
    return "fruit-form";
  }

  @PostMapping("/fruits/update/{id}")
  public String updateFruit(@PathVariable Long id, @ModelAttribute Fruit fruit) {
    fruitService.updateFruit(id, fruit);
    return "redirect:/fruits";
  }

  @GetMapping("/fruits/delete/{id}")
  public String deleteFruit(@PathVariable Long id) {
    fruitService.deleteFruit(id);
    return "redirect:/fruits";
  }
}
