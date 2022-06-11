package com.jsan.assistencia.goldcard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsan.assistencia.goldcard.domain.Customers;
import com.jsan.assistencia.goldcard.service.CustomerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/consultar-cliente")
@Api(value = "Consultar Cliente")
public class CustomerController {
	
	  @Autowired
	  private CustomerService customerService;
	
	  @ApiOperation(value = "Recuperar Clientes")
	  @GetMapping("/") 
	  public List<Customers> recuperarCliente() { 
		  List<Customers> lista = customerService.recuperarCliente();
		  
		  if (lista == null) {
			  return null;
		  }
		  
		  for (Customers customers : lista) {
			System.out.println("cliente = " + customers.getCustomerName());
		  }
		  
		  return lista;
		   
	  }
	 
}
