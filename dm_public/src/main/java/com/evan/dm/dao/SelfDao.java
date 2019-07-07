package com.evan.dm.dao;

import com.evan.dm.entity.User;

public interface SelfDao {
    User selectByAccount(String user);
}
