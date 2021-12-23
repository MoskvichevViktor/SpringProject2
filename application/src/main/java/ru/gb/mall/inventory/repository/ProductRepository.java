package ru.gb.mall.inventory.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.gb.mall.inventory.entity.Product;

import java.awt.print.Pageable;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
    Page<Product> findAllBy(Pageable pageable);

    //@Query("select p from Product p where p.title = ?1")
    //Optional<Product> findByTitle(String title);

}