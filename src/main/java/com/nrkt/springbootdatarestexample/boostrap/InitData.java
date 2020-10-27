package com.nrkt.springbootdatarestexample.boostrap;

import com.nrkt.springbootdatarestexample.model.Product;
import com.nrkt.springbootdatarestexample.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class InitData implements CommandLineRunner {
    ProductRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        var person = new Product();
        person.setName("Test");
        person.setPrice(20D);
        person.setStatus(true);

        personRepository.save(person);
    }
}
