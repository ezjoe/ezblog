package org.eu.qiao.myspringboot.service;

import org.eu.qiao.myspringboot.dao.ArticleDao;
import org.eu.qiao.myspringboot.entity.Article;
import org.eu.qiao.myspringboot.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @ClassNamg ArticleService
 * @Description todo
 * Author BOB
 * @Date 2019/4/1 17:26
 * @Version 1.0
 **/
@Service
public class ArticleService {


    @Autowired
    private ArticleDao articleDao;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");


    public List<Article> list(){
        List<Article> articles = articleDao.findAll();
        return articles;
    }

    /**
     * save article
     * @param article
     */
    public void save(Article article){
        articleDao.save(article);
    }

    /***
     * delete article
     * @param id
     */
    public void delete(String id){
        articleDao.deleteById(id);
    }

    /***
     * get article by id
     * @param id
     * @return
     */
    public Article getById(String id){
        return articleDao.getOne(id);
    }

    /***
     * get articles by category name
     * @param categoryName
     * @return
     */
    public List<Article> getArticleByCategoryName(String categoryName){
        return articleDao.findAllByCategory_Name(categoryName);
    }

    /***
     * search by keyword
     * @param keyWord
     * @return
     */
    public List<Article> search(String keyWord){
        return articleDao.findByTitleLike(keyWord);
    }

}
