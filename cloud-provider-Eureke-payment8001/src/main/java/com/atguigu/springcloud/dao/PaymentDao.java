package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: zhuang
 * @Date: 2020/3/21 0021 17:07
 * @Description:
 */
@Mapper
public interface PaymentDao {

    //添加
    int create(Payment payment);

    //查询
    Payment getPaymentById(@Param("id") Long id);



}
