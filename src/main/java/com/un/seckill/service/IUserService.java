package com.un.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.un.seckill.pojo.User;
import com.un.seckill.vo.LoginVo;
import com.un.seckill.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 服务类
 * @author un
 */
public interface IUserService extends IService<User> {

    RespBean doLogin(LoginVo loginVo, HttpServletRequest request , HttpServletResponse response);

    User getUserByCookie(String userTicket, HttpServletRequest request, HttpServletResponse response);

    RespBean updatePassword(String userTicket, String password, HttpServletRequest request, HttpServletResponse response);
}
