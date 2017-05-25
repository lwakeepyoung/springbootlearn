package com.lwa.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by lwa on 2017/5/25.
 */
public interface CommonMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
