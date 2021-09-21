package com.jincreation.YJtarot.service.implementation;

import com.jincreation.YJtarot.common.ServiceResponseEnum;
import com.jincreation.YJtarot.dao.AdminMapper;
import com.jincreation.YJtarot.dao.AdminTokenMapper;
import com.jincreation.YJtarot.model.AdminUser;
import com.jincreation.YJtarot.model.AdminUserToken;
import com.jincreation.YJtarot.service.AdminService;
import com.jincreation.YJtarot.util.NumberUtil;
import com.jincreation.YJtarot.util.SystemUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Resource
    private AdminTokenMapper adminTokenMapper;

    @Override
    public String login(String username, String password) {
        AdminUser loginAdmin = adminMapper.login(username, password);
        if(loginAdmin != null){
            String token = getNewToken(System.currentTimeMillis() + "", loginAdmin.getAdminId());
            AdminUserToken adminUserToken = adminTokenMapper.selectByPrimaryKey(loginAdmin.getAdminId());
            Date now = new Date();
            Date expires = new Date(now.getTime() + 2*24*3600*1000);
            if(adminUserToken == null){
                adminUserToken = new AdminUserToken();
                adminUserToken.setAdminId(loginAdmin.getAdminId());
                adminUserToken.setToken(token);
                adminUserToken.setUpdateDate(now);
                adminUserToken.setExpiryDate(expires);
                if(adminTokenMapper.insertSelective(adminUserToken) > 0) return token;
            } else{
                adminUserToken.setToken(token);
                adminUserToken.setUpdateDate(now);
                adminUserToken.setExpiryDate(expires);
                if(adminTokenMapper.updateByPrimaryKeySelective(adminUserToken) > 0) return token;
            }
        }
        return ServiceResponseEnum.LOGIN_ERROR.getResult();
    }

    private String getNewToken(String timeStr, Long userId){
        String src = timeStr + userId + NumberUtil.genRandomNum(6);
        return SystemUtil.genToken(src);
    }

    @Override
    public AdminUser getUserDetailsById(Long id) {
        return null;
    }

    @Override
    public Boolean updatePassword(Long id, String oldPassword, String newPassword) {
        return null;
    }

    @Override
    public Boolean updateName(Long id, String username, String nickname) {
        return null;
    }

    @Override
    public Boolean logout(Long id) {
        return null;
    }
}
