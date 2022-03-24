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
@Table(name = "plotmatakuliah")
public class PlotMataKuliahModel {
	
	@Id
	@Column(columnDefinition = "char(10)", nullable = false)
	private String idPlotMK;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idMataKuliah", referencedColumnName = "idMataKuliah")
	private MataKuliahModel idMataKuliah;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idDosen", referencedColumnName = "idDosen")
	private DosenModel idDosen;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "nim", referencedColumnName = "nim")
	private MahasiswaModel nim;

}
