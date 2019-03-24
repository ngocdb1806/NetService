package com.cvc.netservice.repository;

import com.cvc.netservice.domain.Bill;
import com.cvc.netservice.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@SuppressWarnings("unused")
@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

    Order findFirstByOrderByIdDesc();

   @Query("SELECT o FROM Order o where o.orderDate like ?1")
    List<Bill> findByOrderDateContains(LocalDateTime localDateTime);

    List<Bill> findByOrderDateBetween(LocalDateTime from, LocalDateTime to);

//    @Query("select case when (count(e) > 0) then true else false end from Entity e where e.dateTime = :date")
//    public boolean check(@Param("date") LocalDate date);
}
