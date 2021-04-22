package org.example.spring.service;

import org.example.spring.FooLibrary;
import org.example.spring.domain.FooProduct;
import org.example.spring.repository.FooProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooLibraryService implements FooLibrary {
    @Autowired
    private FooProductRepository fooProductRepository;
    @Override
    public double calculateProducts() {
        return fooProductRepository.getProducts().stream().mapToDouble((FooProduct product) -> product.getPrice()).sum();
    }
}
