package com.example.testApp1.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Long> {
    @Query("select (count(o) > 0) from Orders o where o.profileId = ?1")
    boolean existsByProfileId(Long profileId);

    @Transactional
    @Modifying
    @Query("delete from Orders o where o.profileId = ?1")
    int deleteByAllOrdersByProfileId(Long profileId);

}
