package com.evan.dm.dao;

import com.evan.dm.entity.Department;
import org.springframework.stereotype.Repository;

@Repository("departmentDao")
public interface DepartmentDao {
    Department selectByAccount(String account);
}
