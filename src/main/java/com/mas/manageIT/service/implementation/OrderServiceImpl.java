package com.mas.manageIT.service.implementation;

import com.mas.manageIT.model.Order;
import com.mas.manageIT.repository.OrderRepository;
import com.mas.manageIT.service.OrderService;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public List<Order> getAll(Long customerId) {
        return null;
    }

    @Override
    public Order get(Long orderId) {
        return null;
    }

    @Override
    public void cancel(Long orderId) {

    }

    @Override
    public Order pay(Long orderId) {
        return null;
    }

}
