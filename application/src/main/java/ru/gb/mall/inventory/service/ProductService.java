package ru.gb.mall.inventory.service;

import org.springframework.stereotype.Service;
import ru.gb.mall.inventory.entity.Product;
import ru.gb.mall.inventory.entity.ProductDto;
import ru.gb.mall.inventory.exception.EntityNotFoundException;
import ru.gb.mall.inventory.repository.ProductRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.StreamSupport;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return StreamSupport.stream(productRepository.findAll().spliterator(), true).toList();
    }



    public Product findById(long id) {
        try {
            return productRepository.findById(id).orElseThrow();
        } catch (NoSuchElementException e) {
            throw new EntityNotFoundException("Product entity no found by id: " + id, e);
        }
    }

    @Transactional
    public ProductDto createNewProduct(ProductDto productDto) {
        Product product = new Product();

        productRepository.save(product);
        return new ProductDto(product);
    }



    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

}
