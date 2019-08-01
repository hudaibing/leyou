package com.leyou.item.service;

import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, Boolean desc, String keyWord);
}
