package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class logindao implements loginservice {

	@Autowired
	loginrepo lp;
	@Override
	public void register(login l1) {
		lp.save(l1);
	}
	@Override
	public login checkcred(String remail, String rpass) {
		// TODO Auto-generated method stub
		return lp.findByRemailAndRpass(remail, rpass);
	}

}
