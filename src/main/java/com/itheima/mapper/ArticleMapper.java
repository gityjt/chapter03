package com.itheima.mapper;

import com.itheima.domain.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {
    public Article selectArticle(Integer id);
    public int updateArticle(Article article);
}
