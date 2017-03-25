package com.kevin.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kevin.messenger.model.Message;
import com.kevin.messenger.service.MessageService;


@Path("/messages")		// indicator so URI can find the appropriate class
public class MessageResource {
	
	MessageService messageService = new MessageService();

	@GET		// Method will run depending on the request type
	@Produces(MediaType.APPLICATION_XML)	//Response will be in MediaType
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
	
	
}
