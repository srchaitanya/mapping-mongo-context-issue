package com.src;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class ServiceClass implements InitializingBean{

	@Autowired
	MongoMappingContext mongoMappingContext;
	
	public ServiceClass() {
		System.out.println("Service class instatiated !!!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Is mongoMappingContext null?"+mongoMappingContext==null);
		Assert.notNull(mongoMappingContext, "MongoMappingContext not injected");		
	}
}
