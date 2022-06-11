package com.jsan.assistencia.goldcard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsan.assistencia.goldcard.domain.Customers;
import com.jsan.assistencia.goldcard.repository.CustomerRepository;


@Transactional
@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customers> recuperarCliente() { 
		  return customerRepository.recuperarClientes(); 
	}

}
