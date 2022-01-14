package com.pck.userinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	
	@Autowired
	private UserService userserv;
	
	
	@RequestMapping(method = RequestMethod.GET , value = "/ListUsers")
	public List<Userdata> getUsers()
	{
		return userserv.getUser();
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/isUserExists/{id}")
	public Userdata getTopicById(@PathVariable String id ){
		return userserv.getUserByEmailId(id);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/UpsertUser")
	public void addTopic(@RequestBody  Userdata t)
	{
		userserv.addTopic(t);
	}


}
