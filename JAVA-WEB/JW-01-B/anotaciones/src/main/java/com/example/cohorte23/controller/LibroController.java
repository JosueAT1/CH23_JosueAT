package com.example.cohorte23.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cohorte23.model.Libro;
import com.example.cohorte23.repositories.LibrosRepositorio;

@RestController
public class LibroController {

	@Autowired
	LibrosRepositorio libroRepo;

	@RequestMapping("/libros")
	public List<Libro> listarTodo() {
		return libroRepo.listarLibros();
	}

}
