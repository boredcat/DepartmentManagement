package com.evan.dm.service;

import com.evan.dm.entity.User;

public interface selfService {
    User login(String account,String password);
    void changePassword(Integer id,String password);
}
