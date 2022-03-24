package com.juaracoding.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pertanyaan")
public class PertanyaanModel {
	@Id
	@Column(columnDefinition = "char(10)", nullable = false)
	private String idPertanyaan;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idSoal", referencedColumnName = "idSoal")
	private SoalModel idSoal;
	
	@Column(columnDefinition = "text", nullable = false)
	private String pertanyaan;
	@Column(columnDefinition = "text", nullable = false)
	private String jawaban1;
	@Column(columnDefinition = "text", nullable = false)
	private String jawaban2;
	@Column(columnDefinition = "text", nullable = false)
	private String jawaban3;
	@Column(columnDefinition = "text", nullable = false)
	private String jawaban4;
	@Column(columnDefinition = "text", nullable = false)
	private String jawabanBenar;
	@Column(length = 1, nullable = true)
	private int statusGambar;

}
