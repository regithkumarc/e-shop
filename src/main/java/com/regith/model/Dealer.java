package com.regith.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Dealer {
	
	@Id
	private int dealer_id;
	private String dealer_name;
	private String dealer_address;
	private String dealer_contact;
	private String dealer_email;
	
	public Dealer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dealer(int dealer_id, String dealer_name, String dealer_address, String dealer_contact,
			String dealer_email) {
		super();
		this.dealer_id = dealer_id;
		this.dealer_name = dealer_name;
		this.dealer_address = dealer_address;
		this.dealer_contact = dealer_contact;
		this.dealer_email = dealer_email;
	}

	public int getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(int dealer_id) {
		this.dealer_id = dealer_id;
	}

	public String getDealer_name() {
		return dealer_name;
	}

	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}

	public String getDealer_address() {
		return dealer_address;
	}

	public void setDealer_address(String dealer_address) {
		this.dealer_address = dealer_address;
	}

	public String getDealer_contact() {
		return dealer_contact;
	}

	public void setDealer_contact(String dealer_contact) {
		this.dealer_contact = dealer_contact;
	}

	public String getDealer_email() {
		return dealer_email;
	}

	public void setDealer_email(String dealer_email) {
		this.dealer_email = dealer_email;
	}

}
