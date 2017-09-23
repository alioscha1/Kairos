package cl.kairos.spring1.controller;

import cl.kairos.spring1.model.Region;
import cl.kairos.spring1.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/kairos")
public class RegionController {

	@Autowired
	RegionRepository regionRepository;
	
	//Obtener todas las regiones
	@GetMapping("/regiones")
	public List<Region> getAllRegiones(){
		return regionRepository.findAll();
		
	}
}
