package org.eu.qiao.myspringboot.dao;

import org.eu.qiao.myspringboot.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public interface CategoryDao extends JpaRepository<Category, String> {

    public Category findByName(String name);

}
