package com.cvc.netservice.service.mapper;

import com.cvc.netservice.domain.Goods;
import com.cvc.netservice.domain.Product;
import com.cvc.netservice.service.dto.GoodsDTO;
import com.cvc.netservice.service.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ProductMapper {

    ProductDTO toProductDTO(Product entity);

    ProductDTO toEntity(Product dto);
}
