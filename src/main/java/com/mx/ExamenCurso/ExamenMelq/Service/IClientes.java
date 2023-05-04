package com.mx.ExamenCurso.ExamenMelq.Service;

import java.util.List;

import com.mx.ExamenCurso.ExamenMelq.Entity.Clientes;

public interface IClientes {
	public List<Clientes> consultarClientes();
	public void guardar(Clientes cliente);
	public Clientes buscarClientes(Clientes cliente);
}
