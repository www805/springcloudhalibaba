package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: zhuang
 * @Date: 2020/3/21 0021 17:33
 * @Description:
 */
public interface PaymentService {


    //添加
    CommonResult create(CommonResult result, Payment payment);

    //查询
    CommonResult getPaymentById(CommonResult result, @Param("id") Long id);



}
