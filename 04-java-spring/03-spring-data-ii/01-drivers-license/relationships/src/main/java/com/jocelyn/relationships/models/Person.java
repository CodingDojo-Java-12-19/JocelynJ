package com.jocelyn.relationships.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Person {
	//table auto generated id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//table string first name
	private String firstName;
	//table string last name
	private String lastName;
	//table created at, not updatable
	@Column(updatable=false)
	private Date createdAt;
	//table updated at
	private Date updatedAt;
	//one to one relationship  mapped to license
	@OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private License license;
 
	//empty constructor
	public Person() {
	     
	}

	//id, first and last name constructor
	public Person(Long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//get and set id
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	//get and set firstName
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//get and set lastName
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//get createdAt date
	public Date getCreatedAt() {
		return createdAt;
	}
	
	//get updatedAt date
	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	//get and set license
	public License getLicense() {
		return license;
	}
	
	public void setLicense(License license) {
		this.license = license;
	}
	
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}