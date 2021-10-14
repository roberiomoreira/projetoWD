package com.wd.projeto01.dto;


public class VendasDto {
	private Integer id;
	private Integer visitas;
	private Integer qtdVendas;
	
	public VendasDto() {}
	
	public VendasDto(Integer id, Integer qtdVisitas, Integer qtdVendas) {
		super();
		this.id = id;
		this.visitas = qtdVisitas;
		this.qtdVendas = qtdVendas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQtdVisitas() {
		return visitas;
	}

	public void setQtdVisitas(Integer qtdVisitas) {
		this.visitas = qtdVisitas;
	}

	public Integer getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(Integer qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
}
