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
@Table(name = "niali")
public class NilaiModel {
	
	@Id
	@Column(columnDefinition = "char(10)")
	private String idSoal;
	
	@Column(length = 3, nullable = true)
	private int nilai;

}
