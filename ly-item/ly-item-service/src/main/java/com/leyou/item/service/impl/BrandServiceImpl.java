package com.leyou.item.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.leyou.common.vo.PageResult;
import com.leyou.item.dao.BrandDao;
import com.leyou.item.pojo.Brand;
import com.leyou.item.service.BrandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;

    @Override
    public List<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, Boolean desc, String keyWord) {
        //PageHelper.startPage(page, rows);
        Example example = new Example(Brand.class);
        if (StringUtils.isNotBlank(keyWord)) {
            example.createCriteria().andLike("name", "%" + keyWord + "%").orEqualTo("letter", keyWord);
        }
        if (StringUtils.isNotBlank(sortBy)) {
            String orderClause = sortBy + (desc ? " DESC" : " ASC");
            example.setOrderByClause(orderClause);
        }
        //Page<Brand> result = (Page<Brand>) brandDao.selectByExample(example);
        List<Brand> list = brandDao.selectAll();
        //return new PageResult<>(result.getTotal(), result);
        return list;
    }
}
