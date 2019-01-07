package com.example.demo.domain;

public class Word {
	
	private String word;
	private Role role;
	
	public Word() {
		super();
	}
	
	public Word(String word) {
		this();
		this.word = word;
	}
	
	public Word(String word, Role role) {
		this(word);
		this.role = role;
	}
	
	public static enum Role {
		subject,verb,article,adjective,noun;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
		
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getString() {
		return getWord();
	}

}
