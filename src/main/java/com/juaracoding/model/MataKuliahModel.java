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
@Table(name = "matakuliah")
public class MataKuliahModel {
	
	@Id
	@Column(columnDefinition = "char(10)", nullable = false)
	private String idMataKuliah;
	
	@Column(length = 25, nullable = false)
	private String namaMataKuliah;

}
