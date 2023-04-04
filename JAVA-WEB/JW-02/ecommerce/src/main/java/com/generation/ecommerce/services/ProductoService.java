package com.generation.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.models.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;

@Service
public class ProductoService {

	// creo el objeto de lac lase ProductoRepository
	private final ProductoRepository productoRepository;

	// Cablear con el autowired
	@Autowired

	// Uso ese objeto como parametro de mi constructor
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	//Create (Metodo para agregar un objeto del tipo Producto y guardarlo en la base de datos. Si el producto existe, no deberia actualizar la Base de datos porque seria un objeto duplicado.

	public void crearProducto(Producto prod) { // objeto del tipo producto
		Optional<Producto> productoBuscado = productoRepository.findByNombre(prod.getNombre());
		if (productoBuscado.isPresent()) {
			throw new IllegalStateException("El producto con el nombre " + "[" + prod.getNombre() + "] ya existe.");
		} else {
			productoRepository.save(prod);
		} // else //if
	}// addProducto

	// Read (Leer una lista de productos)
	public List<Producto> leerProductos() {
		return productoRepository.findAll();
	}// Toda la lista de productos

	// Read (Leer un producto con un id especifico)
	public Producto leerProducto(Long prodId) {
		return productoRepository.findById(prodId)
				.orElseThrow(() -> new IllegalStateException("El Producto " + "con el id " + prodId + " no existe."));
	}

	//Update para actualizar un producto
	public void actulizarProducto(Long prodId, String nombre, String descripcion, String URL_Imagen, double precio){
		
		//Si el producto existe entonces no modifico
		if (productoRepository.existsById(prodId)) {
			//entonces lo modifico
			Producto productoABuscar = productoRepository.getById(prodId); //ya que verifico que mi producto existe, lo traigo y lo asigno a una variable llamada productoABuscar
			if(nombre!= null) productoABuscar.setNombre(nombre);
			if (descripcion!= null) productoABuscar.setDescripcion(descripcion);
			if(precio!= 0) productoABuscar.setPrecio(precio);
			if(URL_Imagen!= null) productoABuscar.setURL_Imagen(URL_Imagen);
			//Cuando termino de editar el objeto
			productoRepository.save(productoABuscar);
		}else {
			System.out.println("El porducto con el id" + prodId + "no existe");
		}

	}
	
	
	//Delete
	public void borrarProducto(Long pordId) {
		if (productoRepository.existsById(pordId)) {
			productoRepository.deleteById(pordId);
		}
		
	}
}
