package com.example.blogenboot.service;

import com.example.blogenboot.dao.CategoryDao;
import com.example.blogenboot.dao.PostDao;
import com.example.blogenboot.dao.UserDao;
import com.example.blogenboot.ds.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogenService {
    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private PostDao postDao;
    @Autowired
    private UserDao userDao;


    public void saveCategory(Category category) {
        categoryDao.save(category);
    }

    public List<Category> findAllCategories() {
        return categoryDao.findAll();
    }
}
