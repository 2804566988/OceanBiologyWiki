package com.pzl.obwiki.service;

import com.pzl.obwiki.entity.Ebook;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pzl.obwiki.req.EbookQueryReq;
import com.pzl.obwiki.req.EbookSaveReq;
import com.pzl.obwiki.resp.EbookQueryResp;
import com.pzl.obwiki.resp.PageResp;

/**
 * <p>
 * 电子书 服务类
 * </p>
 *
 * @author cr
 * @since 2023-11-08
 */
public interface IEbookService extends IService<Ebook> {

    PageResp<EbookQueryResp> listByname(EbookQueryReq req);

    void save(EbookSaveReq req);

    void delete(Long id);

}
