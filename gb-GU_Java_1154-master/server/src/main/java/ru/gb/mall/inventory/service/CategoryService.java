package ru.gb.mall.inventory.service;

import jdk.jfr.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.mall.inventory.repository.CategoryRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    public Optional<Category> findByTitle(String title) {
        return categoryRepository.findByTitle(title);
    }
}