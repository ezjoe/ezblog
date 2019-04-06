package org.eu.qiao.myspringboot.dao;

import org.eu.qiao.myspringboot.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassNamg ArticleDao
 * @Description todo
 * Author BOB
 * @Date 2019/4/1 17:29
 * @Version 1.0
 **/
@Repository
public interface ArticleDao extends JpaRepository<Article, String> {

    public List<Article> findAllByCategory_Name(String name);


    @Query("from Article where title like %:title%")
    public List<Article> findByTitleLike(@Param("title") String title);


}
