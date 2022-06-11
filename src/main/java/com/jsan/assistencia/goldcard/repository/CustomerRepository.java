package com.jsan.assistencia.goldcard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jsan.assistencia.goldcard.domain.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {

	@Query("select c from Customers c")
	public List<Customers> recuperarClientes();
}
