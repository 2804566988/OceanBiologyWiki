package com.pzl.obwiki.service;

import com.pzl.obwiki.entity.Content;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IContentService extends IService<Content> {
    String findContent(Long id);
}
