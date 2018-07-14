package com.cmdi.check.service.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cmdi.check.model.Good;
import com.cmdi.check.model.User;

public interface IGoodService {
	
	public Good add(String name, int password);

}
