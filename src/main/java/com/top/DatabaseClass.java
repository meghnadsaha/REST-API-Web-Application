package com.top;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseClass {

	
	public static List<String> getProfiles() {
		return profiles;
	}
	public static void setProfiles(List<String> profiles) {
		DatabaseClass.profiles = profiles;
	}
	public static List<String> getMessages() {
		return messages;
	}
	public static void setMessages(List<String> messages) {
		DatabaseClass.messages = messages;
	}
	
	private static List<String> messages = new ArrayList<>();
	private static List<String> profiles = new ArrayList<>();

	
	
}
