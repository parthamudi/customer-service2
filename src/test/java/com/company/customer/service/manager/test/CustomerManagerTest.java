package com.company.customer.service.manager.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.doNothing;

import static org.mockito.Mockito.when;

import com.company.customer.service.manager.CustomerManager;
import com.company.customer.service.mapper.CustomerMapper;
import com.company.customer.service.model.Customer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerManagerTest {

	private long ssn=11112;
	@Mock
	CustomerMapper customerMapper;
	
	@InjectMocks
	CustomerManager itsCustomerManager;
	
	@Test
	public void testFindAll() {
		List<Customer> customerList=new ArrayList<>();
		when(customerMapper.findAll()).thenReturn(customerList);
		 customerList=itsCustomerManager.findAll();
	}
	
	@Test
	public void testGetCustomerBySSN() {
		Customer customer=new Customer();
		when(customerMapper.getCustomerBySSN(ssn)).thenReturn(customer);
		itsCustomerManager.getCustomerBySSN(ssn);
	}
	
	@Test
	public void testUpdateBySSN() {
		Customer customer=new Customer();
		when(customerMapper.updateBySSN(customer)).thenReturn(1);
		itsCustomerManager.updateBySSN(customer);
	}
	
	@Test
	public void testDeleteBySSN() {
		when(customerMapper.deleteBySSN(ssn)).thenReturn(1);
		itsCustomerManager.deleteBySSN(ssn);
	}
	
	@Test
	public void testInsert() {
		Customer customer=new Customer();
		doNothing().when(customerMapper).insert(customer);
	}
}
