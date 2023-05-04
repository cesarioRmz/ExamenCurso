package com.mx.ExamenCurso.ExamenMelq.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ExamenCurso.ExamenMelq.Entity.Clientes;
import com.mx.ExamenCurso.ExamenMelq.Service.Imp.ImpClientes;

@RestController
@RequestMapping("clientes")
@CrossOrigin
public class ClientesController {
	@Autowired
	ImpClientes imp;
	@GetMapping("consulta")
	public List<Clientes> consultaClientes(){
		List<Clientes> listaClientes = imp.consultarClientes();
		return listaClientes;
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Clientes cliente) {
		imp.guardar(cliente);
	}
	
	@PostMapping("buscarID")
	public Clientes buscarCliente(@RequestBody Clientes cliente) {
		Clientes clienteB = imp.buscarClientes(cliente);
		return clienteB;
	}
}
