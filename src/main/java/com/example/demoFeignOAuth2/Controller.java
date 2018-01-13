package com.example.demoFeignOAuth2;

import com.example.demoFeignOAuth2.domain.Order;
import com.example.demoFeignOAuth2.domain.Person;
import com.example.demoFeignOAuth2.gateway.OrderFeignClient;
import com.example.demoFeignOAuth2.gateway.PersonFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by guilherme-lima on 2018-01-13.
 * http://github.com/guilherme-lima
 */
@RestController
@AllArgsConstructor
public class Controller {

    private PersonFeignClient personFeignClient;
    private OrderFeignClient orderFeignClient;

    @GetMapping("/person")
    public List<Person> personList() {
        return personFeignClient.personList();
    }

    @GetMapping("/order")
    public List<Order> orderList() {
        return orderFeignClient.orderList();
    }
}
