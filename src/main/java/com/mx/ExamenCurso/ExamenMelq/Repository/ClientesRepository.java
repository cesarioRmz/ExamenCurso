package com.mx.ExamenCurso.ExamenMelq.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mx.ExamenCurso.ExamenMelq.Entity.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer>{
	@Query(value = "SELECT * FROM CLIENTES", nativeQuery=true)
	List<Clientes> getClientes();
	
@Query(value = "SELECT * FROM CLIENTES WHERE ID=?1", nativeQuery=true)
   Clientes buscarCliente(int id);
}

	
