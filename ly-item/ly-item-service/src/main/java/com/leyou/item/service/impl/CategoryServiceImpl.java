package com.leyou.item.service.impl;

import com.leyou.item.dao.CategoryDao;
import com.leyou.item.service.CategoryService;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> queryCategoryByParentId(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
        List<Category> list = categoryDao.select(category);
        return list;
    }
}
