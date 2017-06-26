package com.top;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.top.dao.Employee;

public class MessageService {

private List<String> messages = DatabaseClass.getMessages();
	
	@SuppressWarnings("unchecked")
	public MessageService() {
	//	messages.addAll((Collection<? extends Long>) new Message("YES"));
	//	messages.addAll((Collection<? extends Long>) new Message("NO"));
		
		//.put(new Message(1));
		messages.addAll((Collection<? extends String>) new Message("Yes"));
	}
	
	public ArrayList<Message> getAllMessages() {
		return new ArrayList<Message>();
		//return new ArrayList<Message>(messages.values());
		
	}
}
