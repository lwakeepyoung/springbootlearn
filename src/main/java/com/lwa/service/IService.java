package com.lwa.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 通用service接口
 * Created by lwa on 2017/5/27.
 */
@Service
public interface IService<T> {

    T findByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);
}
