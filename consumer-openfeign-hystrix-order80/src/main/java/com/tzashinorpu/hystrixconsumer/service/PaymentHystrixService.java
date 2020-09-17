package com.tzashinorpu.hystrixconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//这个接口中暴露的方法是这个 consumer 可以调用的所有 provider 中提供的方法
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {
    // consumer 的 controller 中调用 paymentInfo_OK 方法，通过 @FeignClient 注解的配置再去调用 CLOUD-PROVIDER-HYSTRIX-PAYMENT
    // 服务中和 /payment/hystrix/ok/{id} 路径匹配的 provider 中的方法
    @GetMapping("/payment/hystrix/ok/{id}")
    String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
