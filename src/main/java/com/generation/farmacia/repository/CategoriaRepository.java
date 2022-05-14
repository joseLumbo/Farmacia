package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	//PESQUISAR DENTRO DA CATEGORIA TODOS OS NOMES MINUSCULO OU MAIUSCULA
	public List <Categoria> findAllByNomeContainingIgnoreCase(@Param("tipo") String nome);

}
