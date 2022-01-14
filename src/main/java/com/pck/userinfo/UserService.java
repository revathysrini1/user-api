package com.pck.userinfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserInterface userDAO;
	
	public List<Userdata> getUser()
	{
		
		ArrayList<Userdata> arr= new ArrayList<Userdata>();
		Iterable it = userDAO.findAll();
		Iterator<Userdata> ittopic = it.iterator();
		while(ittopic.hasNext())
		{
			arr.add(ittopic.next());
		}
		return arr;
		
		
	}
	
	
	public Userdata getUserByEmailId(String id ){
		return userDAO.findById(id).get();
		
		
	}
	
	public void addTopic(Userdata t)
	{
		userDAO.save(t);
	}


}
