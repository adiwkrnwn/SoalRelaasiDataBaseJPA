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
@Table(name = "mahasiswa")
public class MahasiswaModel {
	
	@Id
	@Column(columnDefinition = "char(8)", nullable = false)
	private String nim;
	
	@Column(length = 25, nullable = false)
	private String namaMahasiswa;
	
	@Column(length = 10, nullable = false)
	private String jenisKelamin;
	
	@Column(length = 25, nullable = false)
	private String password;

}
