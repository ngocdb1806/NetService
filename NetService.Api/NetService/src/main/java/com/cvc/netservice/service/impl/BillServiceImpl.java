package com.cvc.netservice.service.impl;

import com.cvc.netservice.repository.BillRepository;
import com.cvc.netservice.service.BillService;
import com.cvc.netservice.service.dto.*;
import com.cvc.netservice.service.mapper.BillMapper;
import com.cvc.netservice.service.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class BillServiceImpl implements BillService {

    private final OrderMapper orderMapper;

    private final BillRepository orderRepository;

    public BillServiceImpl(OrderMapper orderMapper, BillRepository orderRepository) {
        this.orderMapper = orderMapper;
        this.orderRepository = orderRepository;
    }

    @Override
    public Long createBill(BillDTO orderDTO) throws Exception {
        return null;
    }
}
