package com.juaracoding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "admin")
public class AdminModel {
	
	@Id
	@Column(length = 25, nullable = false)
	private String username;
	
	@Column(length = 25, nullable = false)
	private String password;
	
	

}
