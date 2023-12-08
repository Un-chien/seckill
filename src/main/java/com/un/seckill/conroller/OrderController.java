package com.un.seckill.conroller;

import com.un.seckill.pojo.User;
import com.un.seckill.service.IOrderService;
import com.un.seckill.vo.DetailVo;
import com.un.seckill.vo.OrderDetailVo;
import com.un.seckill.vo.RespBean;
import com.un.seckill.vo.RespBeanEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/detail")
    @ResponseBody
    public RespBean orderDetail(User user, Long orderId){
        if (user == null) {
            return RespBean.error(RespBeanEnum.SESSION_ERROR);
        }
        OrderDetailVo detail = orderService.detail(orderId);
        return RespBean.success(detail);
    }
}
