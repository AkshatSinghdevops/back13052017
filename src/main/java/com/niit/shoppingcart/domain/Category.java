package com.niit.shoppingcart.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="Category")  //if the class name and table name is different
@Component
public class Category {
	
	
	
	//add simple properties - same as Category table
		//generate getter/setter methods
		
		@Id
		private String ID;
		
		@Column(name="name")  //if the field name and property name is different
		private String NAME;
		
		public String getID() {
			return ID;
		}

		public void setID(String iD) {
			ID = iD;
		}

		public String getNAME() {
			return NAME;
		}

		public void setNAME(String nAME) {
			NAME = nAME;
		}

		public String getDescription() {
			return Description;
		}

		public void setDescription(String description) {
			Description = description;
		}

		private String Description;

	
		
		

}
