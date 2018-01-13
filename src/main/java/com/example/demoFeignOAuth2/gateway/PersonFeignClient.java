package com.example.demoFeignOAuth2.gateway;

import com.example.demoFeignOAuth2.domain.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by guilherme-lima on 2018-01-13.
 * http://github.com/guilherme-lima
 */
@FeignClient(name = "personFeignClient", url = "http://localhost:8090")
public interface PersonFeignClient {

    @GetMapping("/person")
    List<Person> personList();
}
