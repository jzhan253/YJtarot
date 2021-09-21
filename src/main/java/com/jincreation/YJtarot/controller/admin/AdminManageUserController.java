package com.jincreation.YJtarot.controller.admin;

import com.jincreation.YJtarot.common.Constants;
import com.jincreation.YJtarot.controller.admin.param.AdminLoginParam;
import com.jincreation.YJtarot.service.AdminService;
import com.jincreation.YJtarot.util.Response;
import com.jincreation.YJtarot.util.ResponseMaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController(value = "/manage/v0")
public class AdminManageUserController {

    @Resource
    private AdminService adminService;
    private static final Logger logger = LoggerFactory.getLogger(AdminManageUserController.class);

    @PostMapping("/adminUser/login")
    public Response<String> login(@RequestBody AdminLoginParam adminLoginParam){
        if(adminLoginParam == null || adminLoginParam.getUsername() == null || adminLoginParam.getUsername().length() == 0 || adminLoginParam.getEncryptedPassword().length() == 0){
            return ResponseMaker.getFailedResponse("Non empty username or password allowed");
        }
        String login = adminService.login(adminLoginParam.getUsername(), adminLoginParam.getEncryptedPassword());
        logger.info("manage login controller, adminName={}, loginResult={}", adminLoginParam.getUsername(), login);
        if(login != null || login.length() == Constants.TOKEN_LENGTH){
            Response r = ResponseMaker.getSuccessResponse();
            r.setData(login);
            return r;
        }
        return ResponseMaker.getFailedResponse(login);
    }

}
