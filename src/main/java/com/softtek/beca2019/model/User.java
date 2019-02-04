package com.softtek.beca2019.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	//@UniqueLogin
	
	private String id;
	
	@NotNull
	@Size(min=2, message="Name should have atleast 2 characters")
	private String name;	
	
    private String login;
    
    @NotNull
	@Size(min=7, message="NumberDocument should have atleast 7 characters")
    private String numberDocument;
    
    private String typeDocument;
    
    
    public User() {        
    }
    
    
//    public User(String id, 
//    		@NotNull @Size(min = 2, message = "Name should have atleast 2 characters") String name,			 
//			String login, @NotNull @Size(min = 7, message = "Passport should have atleast 2 characters") String numbeDocument, 
//			String typeDocument) {
//    	
//		super();
//		this.id = id;
//		this.name = name;		
//		this.login = login;
//		this.numberDocument = numbeDocument;
//		this.typeDocument = typeDocument;
//	}



	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getNumberDocument() {
		return numberDocument;
	}


	public void setNumberDocument(String numberDocument) {
		this.numberDocument = numberDocument;
	}


	public String getTypeDocument() {
		return typeDocument;
	}


	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}

    
    
    
}
