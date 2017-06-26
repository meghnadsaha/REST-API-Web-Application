package com.top;

import java.util.ArrayList;
import java.util.List;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement
public class Message {
	
	private String id;
	private List<Long> comments = new ArrayList<>();

	 public Message() {
	    	
	    }
	    
	    public Message(String id) {
	    	this.id = id;
	    }
	    
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<Long> getComments() {
			return comments;
		}

		public void setComments(List<Long> comments) {
			this.comments = comments;
		}

	    

		}
