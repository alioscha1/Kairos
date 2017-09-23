package cl.kairos.spring1.controller;

import cl.kairos.spring1.model.Estudiante;
import cl.kairos.spring1.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/kairos")
public class EstudianteController {

	@Autowired
	EstudianteRepository estudianteRepository;
	
	//Obtener todos los estudiantes
	@GetMapping("/estudiantes")
	public List<Estudiante> getAllEstudiantes(){
		return estudianteRepository.findAll();
}
	//Obtener estudiante por id
	@GetMapping("/estudiantes/{id}")
	public ResponseEntity<Estudiante> getEstudianteById(@PathVariable(value="id") Long EstudianteId){
		Estudiante estudiante = estudianteRepository.findOne(EstudianteId);
		if (estudiante == null){
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(estudiante);
	}
	
	//Insertar un nuevo estudiante
	@PostMapping("/estudiantes")
	public Estudiante createEstudiante(@Valid @RequestBody Estudiante estudiante){
		return estudianteRepository.save(estudiante);
	}
	
	//Eliminar un estudiante
	@DeleteMapping("/estudiantes/{id}")
	public ResponseEntity<Estudiante> deleteEstudiante(@PathVariable(value="id") Long estudianteId){
	
		Estudiante estudiante = estudianteRepository.findOne(estudianteId);
		if(estudiante == null){
			return ResponseEntity.notFound().build();
		}
		
	estudianteRepository.delete(estudiante);
	return ResponseEntity.ok().build();
	}
	
}
