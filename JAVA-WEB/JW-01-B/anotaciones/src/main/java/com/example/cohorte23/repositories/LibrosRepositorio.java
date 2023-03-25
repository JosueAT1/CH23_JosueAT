package com.example.cohorte23.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.cohorte23.model.Libro;

@Repository
public class LibrosRepositorio {
	public List<Libro> listarLibros(){
		List<Libro> lista = new ArrayList<Libro>();
		lista.add(new Libro("SpringBoot", "Luis", "1"));
		lista.add(new Libro("Java", "Pedro", "2"));
		lista.add(new Libro("C", "Richard", "3"));
		return lista;
	}
}
