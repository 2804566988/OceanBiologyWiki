package com.pzl.obwiki.service;

import com.pzl.obwiki.entity.Doc;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pzl.obwiki.req.DocQueryReq;
import com.pzl.obwiki.req.DocSaveReq;
import com.pzl.obwiki.resp.DocQueryResp;
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
public interface IDocService extends IService<Doc> {
    PageResp<DocQueryResp> listByname(DocQueryReq req);

    void save(DocSaveReq req);

    void delete(Long id);

    List<DocQueryResp> all();

    void delete(List<Long> ids);

    List<DocQueryResp> allbyEbookId(Long ebookId);
}
