package com.mx.ExamenCurso.ExamenMelq.Service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.ExamenCurso.ExamenMelq.Entity.Clientes;
import com.mx.ExamenCurso.ExamenMelq.Repository.ClientesRepository;
import com.mx.ExamenCurso.ExamenMelq.Service.IClientes;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor(onConstructor=@__(@Autowired))
public class ImpClientes implements IClientes{
	@Autowired
	ClientesRepository clientesRepository;
	@Override
	public List<Clientes> consultarClientes() {
		List<Clientes> listaClientes = clientesRepository.findAll();
		return listaClientes;
	}

	@Override
	public void guardar(Clientes cliente) {
		clientesRepository.save(cliente);
	}

	@Override
	public Clientes buscarClientes(Clientes cliente) {
		Clientes clienteB = clientesRepository.buscarCliente(cliente.getId());
		return clienteB;
	}

}
