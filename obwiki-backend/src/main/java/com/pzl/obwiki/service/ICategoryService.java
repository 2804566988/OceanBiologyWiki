package com.pzl.obwiki.service;

import com.pzl.obwiki.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pzl.obwiki.req.CategoryQueryReq;
import com.pzl.obwiki.req.CategorySaveReq;
import com.pzl.obwiki.resp.CategoryQueryResp;
import com.pzl.obwiki.resp.PageResp;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cr
 * @since 2024-11-05
 */
public interface ICategoryService extends IService<Category> {
    PageResp<CategoryQueryResp> listByname(CategoryQueryReq req);

    void save(CategorySaveReq req);

    void delete(Long id);

    List<CategoryQueryResp> all();
}
