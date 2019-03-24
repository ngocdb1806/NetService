package com.cvc.netservice.web.rest.inventory.impl;

import com.cvc.netservice.service.InventoryService;
import com.cvc.netservice.service.ProductService;
import com.cvc.netservice.service.dto.GoodsDTO;
import com.cvc.netservice.service.dto.ProductDTO;
import com.cvc.netservice.web.model.UpdateData;
import com.cvc.netservice.web.rest.inventory.InventoryApi;
import com.cvc.netservice.web.rest.inventory.ProductApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ProductController implements ProductApi {

    @Autowired
    private ProductService productService;

    @Override
    public ResponseEntity<List<ProductDTO>> findAllProducts() {
        List<ProductDTO> goodsDTOS = productService.findAllProducts();
        return ResponseEntity.ok(goodsDTOS);
    }
}
