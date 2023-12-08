package com.un.seckill.exception;


import com.un.seckill.vo.RespBean;
import com.un.seckill.vo.RespBeanEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobelExceptionHandler {

    @ExceptionHandler(Exception.class)
    public RespBean ExceptionHandler(Exception e) {
        e.printStackTrace();
        if (e instanceof GlobalException) {
            return RespBean.error(((GlobalException) e).getRespBeanEnum());
        }
        return RespBean.error();
    }
}
