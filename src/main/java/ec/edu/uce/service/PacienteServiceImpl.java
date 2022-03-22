package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepository;


@Service
public class PacienteServiceImpl implements IPacienteService{
	
	@Autowired
	private IPacienteRepository paciRepo;

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.paciRepo.buscar(id);
	}

	@Override
	public List<Paciente> buscarTodos() {
		// TODO Auto-generated method stub
		return this.paciRepo.buscarTodos();
	}

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.paciRepo.insertar(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.paciRepo.actualizar(paciente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.paciRepo.eliminar(id);
	}

}
