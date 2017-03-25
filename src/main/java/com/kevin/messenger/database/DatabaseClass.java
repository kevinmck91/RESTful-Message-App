package com.kevin.messenger.database;

import java.util.HashMap;
import java.util.Map;
import com.kevin.messenger.model.Message;
import com.kevin.messenger.model.Profile;

public class DatabaseClass {

//Creates a mock database for message and profiles
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();

	
//Returns messages and profiles when called 
	public static Map<Long, Message> getMessages(){
		return messages;
		
	}
	
	public static Map<Long, Profile> getprofiles(){
	return profiles;
		
	}
	
}
