package com.smc.file.repository;

import com.smc.file.entity.StockPriceEntity;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Integer> {
	
	@Transactional
	@Modifying()
	@Query(name = "deleteStockByCompanyCode", nativeQuery = true, value = "delete from stockprice where companycode = :companycode")
	void deleteStockByCompanyCode(String companycode);

}

