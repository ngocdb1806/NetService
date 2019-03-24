package com.cvc.netservice.service;

import com.cvc.netservice.service.dto.BillDTO;
import com.cvc.netservice.service.dto.OrderDTO;
import com.cvc.netservice.service.dto.RevenueByTypeDTO;
import com.cvc.netservice.service.dto.RevenueDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface BillService {

    Long createBill(BillDTO orderDTO) throws Exception;


}
