package com.pzl.obwiki.service.impl;

import com.pzl.obwiki.entity.Content;
import com.pzl.obwiki.mapper.ContentMapper;
import com.pzl.obwiki.service.IContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {

    @Override
    public String findContent(Long id) {
        Content content = this.baseMapper.selectById(id);
        if(content !=null){
            return content.getContent();
        }
        return "";
    }
}