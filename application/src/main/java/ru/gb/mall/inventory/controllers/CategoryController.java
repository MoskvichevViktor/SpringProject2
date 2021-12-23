package ru.gb.mall.inventory.controllers;

import jdk.jfr.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.mall.inventory.exception.ResourceNotFoundException;
import ru.gb.mall.inventory.service.CategoryService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/{id}")
    public Category getOneCategoryById(@PathVariable Long id) {
        return categoryService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category doesn't exists: " + id));
    }
}
