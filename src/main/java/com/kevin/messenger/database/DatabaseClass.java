package com.kevin.messenger.database;

import java.util.HashMap;
import java.util.Map;
import com.kevin.messenger.model.Message;
import com.kevin.messenger.model.Profile;

public class DatabaseClass {

//Creates a mock database for message and profiles
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	
//Returns messages and profiles when called 
	public static Map<Long, Message> getMessages(){
		return messages;
		
	}
	
	public static Map<String, Profile> getProfiles(){
	return profiles;
		
	}
	
}
