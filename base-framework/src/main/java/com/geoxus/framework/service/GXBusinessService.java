package com.geoxus.framework.service;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Dict;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.geoxus.framework.constant.GXCommonConstant;

public interface GXBusinessService {
    /**
     * 获取分页对象信息
     *
     * @param param 参数
     * @return IPage
     */
    default <T> IPage<T> constructPageObjectFromParam(Dict param) {
        final Dict pageInfo = getPageInfoFromParam(param);
        return new Page<>(pageInfo.getInt("page"), pageInfo.getInt("pageSize"));
    }

    /**
     * 从请求参数中获取分页的信息
     *
     * @param param 参数
     * @return Dict
     */
    default Dict getPageInfoFromParam(Dict param) {
        int currentPage = GXCommonConstant.DEFAULT_CURRENT_PAGE;
        int pageSize = GXCommonConstant.DEFAULT_PAGE_SIZE;
        final Dict pagingInfo = Convert.convert(Dict.class, param.getObj("pagingInfo"));
        if (null != pagingInfo) {
            if (null != pagingInfo.getInt("page")) {
                currentPage = pagingInfo.getInt("page");
            }
            if (null != pagingInfo.getInt("pageSize")) {
                pageSize = pagingInfo.getInt("pageSize");
            }
        }
        return Dict.create().set("page", currentPage).set("pageSize", pageSize);
    }
}
