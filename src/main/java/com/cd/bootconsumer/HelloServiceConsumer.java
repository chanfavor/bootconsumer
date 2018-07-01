package com.cd.bootconsumer;

import api.HelloServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "boot-client", fallback = HelloServiceApiFallBack.class)
public interface HelloServiceConsumer extends HelloServiceApi {
}
