package br.com.throchadev.springdynamodb.service;

import br.com.throchadev.springdynamodb.model.Fruit;
import br.com.throchadev.springdynamodb.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    public void createFruit(Fruit fruit){
        fruitRepository.save(fruit);
    }
}
