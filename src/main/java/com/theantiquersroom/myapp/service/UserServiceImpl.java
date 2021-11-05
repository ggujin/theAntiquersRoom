package com.theantiquersroom.myapp.service;


import com.theantiquersroom.myapp.domain.UserVO;
import com.theantiquersroom.myapp.mapper.UserMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Log4j2

@Service
public class UserServiceImpl implements UserService, InitializingBean, DisposableBean{

    private UserMapper mapper;

    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean registerUsers(UserVO user) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean checkId(String userId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean checkNickName(String nickName) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean checkPhone(String phone) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean confirmEmail(String eCode) {
        // TODO Auto-generated method stub
        return false;
    }

} // end class