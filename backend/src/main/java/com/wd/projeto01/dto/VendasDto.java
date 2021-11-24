package com.wd.projeto01.dto;

import com.wd.projeto01.entities.Vendas;

public class VendasDto {
	private Integer id;
	private Integer visitas;
	private Integer qtdVendas;
	private String nomeVendedor;
	
	public VendasDto() {}
	
	public VendasDto(Integer id, Integer visitas, Integer qtdVendas, String nomeVendedor) {
		super();
		this.id = id;
		this.visitas = visitas;
		this.qtdVendas = qtdVendas;
		this.nomeVendedor = nomeVendedor;
	}
	
	public VendasDto(Vendas vendas) {
		super();
		this.id = vendas.getId();
		this.visitas = vendas.getVisitas();
		this.qtdVendas = vendas.getQtdVendas();	
		this.nomeVendedor = vendas.getVendedor().getNome();
	}
	
	public Integer getVisitas() {
		return visitas;
	}

	public void setVisitas(Integer visitas) {
		this.visitas = visitas;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(Integer qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
	
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
}
