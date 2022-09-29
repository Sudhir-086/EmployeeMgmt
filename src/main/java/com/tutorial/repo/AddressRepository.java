package com.tutorial.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
