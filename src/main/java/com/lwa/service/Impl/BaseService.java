package com.lwa.service.Impl;

import com.lwa.service.IService;
import com.lwa.util.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lwa on 2017/5/27.
 */
public abstract class BaseService<T> implements IService<T>{
    @Autowired
    private CommonMapper<T> commonMapper;

    public CommonMapper<T> getCommonMapper(){
        return commonMapper;
    }

    @Override
    public T findByKey(Object key) {
        return commonMapper.selectByPrimaryKey(key);
    }

    @Override
    public int save(T entity) {
        return commonMapper.insert(entity);
    }

    @Override
    public int delete(Object key) {
        return commonMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int updateAll(T entity) {
        return commonMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int updateNotNull(T entity) {
        return commonMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return commonMapper.selectByExample(example);
    }
}
