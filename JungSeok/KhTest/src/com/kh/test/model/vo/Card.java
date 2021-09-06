package com.kh.test.model.vo;

public class Card {

	String kind;
	int number;

	public Card(String kind,int number) {
		this.kind = kind;
		this.number = number;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	} 

}
