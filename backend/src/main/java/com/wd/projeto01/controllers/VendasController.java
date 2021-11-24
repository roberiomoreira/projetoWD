package com.wd.projeto01.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wd.projeto01.dto.VendasDto;
import com.wd.projeto01.services.VendasService;

@RestController
@RequestMapping(value="/vendas")
public class VendasController {
	@Autowired
	private VendasService vendasService;
	/*
	@GetMapping
	public ResponseEntity<List<VendasDto>> listarVendas(){
		List<VendasDto> listaVendas = vendasService
				.findAll()
				.stream()
				.map(x -> new VendasDto(x.getId(), x.getVisitas(), x.getQtdVendas(), x.getVendedor().getNome())).collect(Collectors.toList());
		return ResponseEntity.ok(listaVendas);
	}
	*/
	
	@GetMapping
	public ResponseEntity<Page<VendasDto>> buscarTodasVendasPaginadas(Pageable pageable){
		Page<VendasDto>listaVendas = vendasService.findAllPage(pageable);
		return ResponseEntity.ok(listaVendas);
	}
}
