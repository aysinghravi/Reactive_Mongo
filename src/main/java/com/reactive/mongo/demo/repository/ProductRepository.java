package com.reactive.mongo.demo.repository;


import com.reactive.mongo.demo.dto.ProductDto;
import com.reactive.mongo.demo.entity.Product;
import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product,String> {

    Flux<ProductDto> findByPriceBetween(Range<Double> priceRange);
}
