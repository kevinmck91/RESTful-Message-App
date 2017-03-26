package com.kevin.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.kevin.messenger.database.DatabaseClass;
import com.kevin.messenger.model.Message;

//set of operations on the a message(s)
public class MessageService {
	

	//access the messages in database
	private static Map<Long, Message> messages = DatabaseClass.getMessages();
	
	//Add new hardcoded message to the database
	public MessageService(){
		messages.put(1L, new Message(1, "Hello World", "kevin"));
		messages.put(2L, new Message(2, "Hello Jersey", "kevin"));
	}
	
	
	//Returns all the messages from the database
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	//Returns a single method
	public static Message getMessage(long id) {
		return messages.get(id);
	}
	
	//Adds a message to the hash table / database
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	//Delete a message
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
	


}
