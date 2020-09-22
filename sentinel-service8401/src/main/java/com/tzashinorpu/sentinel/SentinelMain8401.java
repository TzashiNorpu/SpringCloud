package com.tzashinorpu.sentinel;

import com.alibaba.csp.sentinel.transport.config.TransportConfig;
import com.alibaba.nacos.client.utils.IPUtil;
import com.tzashinorpu.sentinel.Utils.IpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class SentinelMain8401 {
    public static void main(String[] args) {
        /*String ip = IpUtil.getOutIPV4();
        System.setProperty(TransportConfig.HEARTBEAT_CLIENT_IP,ip);
        log.info("Output ip Tzashinorpu= "+ip);*/
        SpringApplication.run(SentinelMain8401.class, args);
    }
}
