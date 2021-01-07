package com.xup.example;

import com.xup.example.dao.OrderDao;
import com.xup.example.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ReplicaTest {

    @Autowired
    OrderDao orderDao;

    @Test
    public void testSelect(){
        List<Order> lst = orderDao.selectAll();
        System.out.println("hello" + lst.size());
    }


    @Test
    public void insert(){
        Order order = new Order();
        order.setOrderId(21L);
        order.setUserId(12);
        order.setStatus("sharding test");
        orderDao.insert(order);
    }
}
