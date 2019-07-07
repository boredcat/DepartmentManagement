package com.evan.dm.dao;

import com.evan.dm.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public interface UserDao {
    void insert(User staff);
    void delete(Integer id);
    void update(User staff);
    User selectById(Integer id);
    List<User> selectAll();
}
