package com.company.customer.service.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.company.customer.service.model.Customer;

import java.util.List;

@Mapper
public interface CustomerMapper {

  //  @Select("select * from customer")
    public List<Customer> findAll();
    public Customer getCustomerBySSN(@Param("ssn") long ssn);
    public int updateBySSN(@Param("customer") Customer customer);
    public int deleteBySSN(@Param("ssn") long ssn);
    void insert(@Param("customer") Customer customer);
    /*@Insert("insert into customer(ssn,first_name,last_name,dob,gender) values(#{ssn},#{first_name},#{last_name},#{dob},#{gender})")
    @SelectKey(statement = "SELECT ssn from customer where ssn=#{ssn}", keyProperty = "ssn",before = false, resultType = Integer.class)
    void insert(Customer customer);
    
    @Select("SELECT * FROM customer WHERE ssn = #{ssn}")
	public Customer getCustomerBySSN(long ssn);

	@Delete("DELETE FROM customer WHERE ssn = #{ssn}")
	public int deleteBySSN(long ssn);
	
	@Delete("UPDATE customer SET first_name=#{first_name},last_name=#{last_name},dob=#{dob},gender=#{gender} WHERE ssn = #{ssn}")
	public int updateBySSN(Customer customer);*/
}
