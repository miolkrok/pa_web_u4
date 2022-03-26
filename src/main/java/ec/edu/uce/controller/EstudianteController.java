package ec.edu.uce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.service.IEstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	@Autowired
	private IEstudianteService estuServ;
	
	@GetMapping("/buscar/{idEstudiante}")
//	@RequestMapping(path ="/buscar/{idEstudiante}", method = RequestMethod.GET)
//	@RequestMapping("/buscar/{idEstudiante}")
	public String obtenerUsuario(@PathVariable("idEstudiante")Integer idEstudiante, Model modelo) {
		
		Estudiante estu = this.estuServ.buscar(idEstudiante);
//		Estudiante estu = new Estudiante();
//		estu.setId(idEstudiante);
//		estu.setNombre("Edison");
//		estu.setApellido("Cayambe");
		
		modelo.addAttribute("estu", estu);//nombre entre parentesis es el que se hace referencia al html
		return "estudiante";
		
	}
	
	@GetMapping("/buscar/todos")
	public String buscarTodos(Model modelo) {
		
		List<Estudiante> listaEstudiantes = this.estuServ.buscarTodos();
		modelo.addAttribute("estudiantes", listaEstudiantes);
		return "lista";
	}
	@GetMapping("/estudianteNuevo")
	public String obtenerPaginaIngresoDatos(Estudiante estudiante) {
		
		return "estudianteNuevo";
	}
	@PostMapping("/insertar")
	public String insertarEstudiante(Estudiante estudiante, BindingResult result, Model modelo) {
		this.estuServ.insertar(estudiante);		
		return "lista";
		
	}

}
