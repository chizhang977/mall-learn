package com.justin.mall.malllearn.service.impl;

import com.github.pagehelper.PageHelper;
import com.justin.mall.malllearn.mbg.mapper.PmsBrandMapper;
import com.justin.mall.malllearn.mbg.model.PmsBrand;
import com.justin.mall.malllearn.mbg.model.PmsBrandExample;
import com.justin.mall.malllearn.service.PmsBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Resource
    private PmsBrandMapper pmsBrandMapper;
    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return pmsBrandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        return pmsBrandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }
}
