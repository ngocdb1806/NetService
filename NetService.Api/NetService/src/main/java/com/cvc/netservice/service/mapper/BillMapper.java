package com.cvc.netservice.service.mapper;
import com.cvc.netservice.domain.Bill;
import com.cvc.netservice.service.dto.BillDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface BillMapper {

    BillDTO toBillDTO(Bill entity);

    Bill toEntity(BillDTO dto);
}
