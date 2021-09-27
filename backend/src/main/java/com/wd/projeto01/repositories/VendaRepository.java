package com.wd.projeto01.repositories;

//essa interface vai lidar com o banco de dados

import org.springframework.data.jpa.repository.JpaRepository;

import com.wd.projeto01.entities.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{

}
