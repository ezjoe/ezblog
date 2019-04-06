package org.eu.qiao.myspringboot.service;

import org.eu.qiao.myspringboot.dao.CategoryDao;
import org.eu.qiao.myspringboot.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNamg CategoryService
 * @Description todo
 * Author BOB
 * @Date 2019/4/2 16:08
 * @Version 1.0
 **/
@Service
public class CategoryService {

    @Autowired
    CategoryDao categoryDao;

    /**
     * 查询所有的类型
     *
     * @return
     */
    public List<Category> list() {
        List<Category> categories = categoryDao.findAll();
        return categories;
    }
    /**
     * 根据ID获取一个分类
     *
     * @param id
     * @return
     **/
/*    public Category get(String id) {
        return categoryDao.findById(id);
    }*/

    /**
     * 根据分类名称获取一个分类
     * @param name
     * @return
     */
    public Category fingdByName(String name) {
        return categoryDao.findByName(name);
    }
}


