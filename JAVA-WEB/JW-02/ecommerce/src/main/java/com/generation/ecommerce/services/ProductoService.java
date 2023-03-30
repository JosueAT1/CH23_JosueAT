package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.models.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;

@Service
public class ProductoService {
	
	//creo el objeto de lac lase ProductoRepository
	private final ProductoRepository productoRepository;
	
	//Cablear con el autowired
	@Autowired
	
	//Uso ese objeto como parametro de mi constructor
	public ProductoService (ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	
	
	//Create (Metodo para crear un objeto del tipo producto y guardarlo en la base de datos)
	public void crearProducto() {
			

	}
	
	
	//Read (Leer una lista de productos)
	public List<Producto> leerProductos() {
		return productoRepository.findAll();
	}//Toda la lista de productos
	
	//Read (Leer un producto con un id especifico)
	public Producto traerProducto(Long prodId) {
		return productoRepository.findById(prodId).
                orElseThrow(()-> new IllegalStateException("El Producto "
                        + "con el id " + prodId + " no existe.") );
	}
	
	//Update
//	public void actulizarProducto() {
//		
//
//	}
//	
//	
//	//Delete
//	public void borrarProducto() {
//		
//	}
}
