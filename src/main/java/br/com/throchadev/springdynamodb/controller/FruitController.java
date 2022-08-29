package br.com.throchadev.springdynamodb.controller;

import br.com.throchadev.springdynamodb.model.Fruit;
import br.com.throchadev.springdynamodb.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @PostMapping
    public void save(@RequestBody Fruit fruit){
        fruitService.createFruit(fruit);
    }
}
