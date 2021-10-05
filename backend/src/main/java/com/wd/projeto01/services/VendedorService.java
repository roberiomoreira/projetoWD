package com.wd.projeto01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wd.projeto01.dto.VendedorNewDto;
import com.wd.projeto01.entities.Vendedor;
import com.wd.projeto01.repositories.VendedorRepository;

@Service
public class VendedorService {
	
	@Autowired
	private VendedorRepository repoVendedor;
	
	public List<Vendedor> findAll(){
		return repoVendedor.findAll();
	}

	public Vendedor findById(Integer id) {
		
		return repoVendedor.findById(id).orElse(null); 
	}

	public Vendedor fromDTO(VendedorNewDto vendedorNewDto) {
		return new Vendedor(vendedorNewDto.getId(), vendedorNewDto.getNome());
	}

	public Vendedor insert(Vendedor vendedor) {
		vendedor.setId(null);
		return repoVendedor.save(vendedor);
	}
}
