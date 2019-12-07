package com.shack.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shack.app.model.Sales;

public interface SalesRepository extends JpaRepository<Sales, Long> {

}
