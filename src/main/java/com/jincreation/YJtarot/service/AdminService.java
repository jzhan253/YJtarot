package com.jincreation.YJtarot.service;

import com.jincreation.YJtarot.model.AdminUser;

public interface AdminService {
    String login(String username, String password);
    AdminUser getUserDetailsById(Long id);
    Boolean updatePassword(Long id, String oldPassword, String newPassword);
    Boolean updateName(Long id, String username, String nickname);
    Boolean logout(Long id);
}
