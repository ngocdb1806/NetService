package com.cvc.netservice.web.rest.inventory;

import com.cvc.netservice.service.dto.GoodsDTO;
import com.cvc.netservice.service.dto.ProductDTO;
import com.cvc.netservice.web.model.UpdateData;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:8383")
@RequestMapping("/product")
public interface ProductApi {

    @ApiOperation(value = "Check Inventory Products", notes = "", response = ProductDTO.class, tags = {"INVENTORY",})
    @GetMapping("/findAllProducts")
    ResponseEntity<List<ProductDTO>> findAllProducts();


}
