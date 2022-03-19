package ec.edu.uce.paralelo.hilos;

import java.util.List;

public class Cajero {
	
	private String nombre;
	private List<Integer> clientes;
	
	
	public Cajero(String nombre, List<Integer> clientes) {
		// TODO Auto-generated constructor stub
		super();
		this.nombre = nombre;
		this.clientes = clientes;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Integer> getClientes() {
		return clientes;
	}
	public void setClientes(List<Integer> clientes) {
		this.clientes = clientes;
	}
	

}
