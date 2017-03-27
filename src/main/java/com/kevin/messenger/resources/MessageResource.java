package com.kevin.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kevin.messenger.model.Message;
import com.kevin.messenger.service.MessageService;

/*
 *  Base Class that is run from the initial URL request
 */

// indicator so URI can find the appropriate class
@Path("/messages")	
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)	
public class MessageResource {
	
	//Creates a message service (Creates the application)
	MessageService messageService = new MessageService();

	/*	This method will run if the request type is GET and the URL is /messages
	 * 	All messages will be returned
	 *  The response will be returned as XML/JSON
	 */
	@GET	
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
	
	/*	Parameter for message ID is taken in after the default path
	 * 	calls on the message service to get that message by messageId
	 * 	and return it. Jersey can do this via annotation
	 */
	@GET		
	@Path("/{messageId}")	
	public Message getMessage(@PathParam("messageId") long messageId){
		return MessageService.getMessage(messageId);
		
	}
	
	//Allows you to send JSON in the POST and
	@POST
	
	public Message addMessage(Message message){
		return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")	
	public Message updateMessage(@PathParam("messageId") long id, Message message){
		message.setId(id);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") long id){
		messageService.removeMessage(id);
	}
	
}
