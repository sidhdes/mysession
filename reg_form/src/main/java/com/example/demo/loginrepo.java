package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface loginrepo extends JpaRepository<login,Integer> {

	
	public login findByRemailAndRpass(String remail,String rpass);
}
