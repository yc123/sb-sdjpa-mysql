package com.yc.repository;

import com.yc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by yc on 2017/6/5.
 */

public interface UserRepository extends CrudRepository<User,Integer> {

    User findById(Long id);

    List<User> findByNameStartingWith(String name);

    User save(User user);

    //批量插入
    void save(List<User> user);

    List<User> findAll();

 //   void delete(Long id);

    //批量删除，一条一条删
   // void delete(List<User> user);

    //先findAll，再一条一条删除，最后提交事务
    void deleteAll();

    //一条sql，删除全部
   void deleteAllInBatch();

 //  User  findOne(User user);

    @Modifying
    @Query("update User set name = :name where id = :id")
    void updateNameById(@Param("name") String name,@Param("id") Long id);


}
