package com.cvc.netservice.service.impl;

import com.cvc.netservice.domain.Goods;
import com.cvc.netservice.repository.InventoryRepository;
import com.cvc.netservice.repository.ProductRepository;
import com.cvc.netservice.service.InventoryService;
import com.cvc.netservice.service.ProductService;
import com.cvc.netservice.service.dto.GoodsDTO;
import com.cvc.netservice.service.dto.ProductDTO;
import com.cvc.netservice.service.mapper.GoodsMapper;
import com.cvc.netservice.service.mapper.ProductMapper;
import org.springframework.beans.PropertyAccessor;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductDTO> findAllProducts() {
        return productRepository.findAllProduct()
                .stream().map(productMapper::toProductDTO).collect(Collectors.toCollection(LinkedList::new));
    }
}