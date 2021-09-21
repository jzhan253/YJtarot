package com.jincreation.YJtarot.dao;

import com.jincreation.YJtarot.model.AdminUser;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    int insert(AdminUser user);
    int insertSelective(AdminUser user);
    AdminUser login(@Param("username") String username, @Param("password") String password);
    AdminUser selectByPrimaryKey(Long adminUserId);
    int updateByPrimaryKeySelective(AdminUser record);
    int updateByPrimaryKey(AdminUser record);
}
