package com.shack.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shack.app.model.Leads;

public interface LeadsRepository extends JpaRepository<Leads, Long> {

}
