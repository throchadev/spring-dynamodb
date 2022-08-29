package br.com.throchadev.springdynamodb.repository;

import br.com.throchadev.springdynamodb.model.Fruit;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface FruitRepository extends CrudRepository<Fruit, String> {
}
