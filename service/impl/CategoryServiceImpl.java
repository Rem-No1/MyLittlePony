package com.xq.tmall.service.impl;

import com.xq.tmall.dao.CategoryMapper;
import com.xq.tmall.entity.Category;
import com.xq.tmall.service.CategoryService;
import com.xq.tmall.util.PageUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryMapper categoryMapper;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean add(Category category) {
        return categoryMapper.insertOne(category) > 0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean update(Category category) {
        return categoryMapper.updateOne(category) > 0;
    }

    @Override
    public List<Category> getList(String category_name, PageUtil pageUtil) {
        return categoryMapper.selectCategoryList(category_name, pageUtil);
    }

    @Override
    public Category get(Integer category_id) {
        return categoryMapper.selectOne(category_id);
    }

    @Override
    public Integer getTotal(String category_name) {
        return categoryMapper.selectTotal(category_name);
    }
}
