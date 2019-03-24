package com.cvc.netservice.service;

import com.cvc.netservice.service.dto.GoodsDTO;
import com.cvc.netservice.service.dto.ProductDTO;

import java.util.List;

public interface InventoryService {

    List<GoodsDTO> findAllGoods();

    Long createGoods(GoodsDTO goodsDTO);

    GoodsDTO updateGooods(String field, Object value, Long id) throws Exception;

    GoodsDTO deleteGoods(Long id);

}
