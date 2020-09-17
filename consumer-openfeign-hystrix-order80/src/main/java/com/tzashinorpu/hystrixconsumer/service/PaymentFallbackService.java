package com.tzashinorpu.hystrixconsumer.service;

import org.springframework.stereotype.Component;

@Component
// 绑定在接口的方法上  覆盖 OrderHystirxController 类中 @HystrixCommand(fallbackMethod = "xxx" ...) 定义的服务降级处理方法
// 不需要在 controller 的实现方法上标注 @HystrixCommand 注解
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
