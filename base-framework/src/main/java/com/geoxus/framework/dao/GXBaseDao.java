package com.geoxus.framework.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

public class GXBaseDao<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {
}
