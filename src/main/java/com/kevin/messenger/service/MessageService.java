package com.kevin.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.kevin.messenger.model.Message;

	//set of operations on the a message(s)

public class MessageService {
	
	// hardcoded a list of created messages
	
	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Hello World!", "Kevin" );
		Message m2 = new Message(2L, "Hello Jersey!", "Kevin" );
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}

}
