package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: zhuang
 * @Date: 2020/3/21 0021 17:37
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public CommonResult create(CommonResult result, Payment payment) {

        int i = paymentDao.create(payment);
        if (i > 0) {
            result.toSuccess(i);
        }else{
            result.setMessage("添加失败!");
        }
        return result;
    }

    public CommonResult getPaymentById(CommonResult result,Long id) {
        Payment paymentEntity = paymentDao.getPaymentById(id);
        result.toSuccess(paymentEntity);
        return result;
    }
}
