package com.jincreation.YJtarot.dao;

import com.jincreation.YJtarot.model.AdminUserToken;

public interface AdminTokenMapper {
    int deleteByPrimaryKey(Long userId);
    int insert(AdminUserToken record);
    int insertSelective(AdminUserToken record);
    AdminUserToken selectByPrimaryKey(Long userId);
    AdminUserToken selectByToken(String token);
    int updateByPrimaryKeySelective(AdminUserToken record);
    int updateByPrimaryKey(AdminUserToken record);
}
