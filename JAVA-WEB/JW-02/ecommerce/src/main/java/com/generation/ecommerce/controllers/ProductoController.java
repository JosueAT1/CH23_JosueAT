package com.generation.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.models.Producto;
import com.generation.ecommerce.services.ProductoService;


@RestController //que eres un controller para soportar metodos http
@RequestMapping(path = "/miOtzo/productos/") //indica la ruta URL de nuestro endpoint para saber donde se manejan esas solicitudes HTTP

public class ProductoController {
	
	//Inyeccion de dependencia
	//Declara la instancia de la Clase ProductoService que se utiliza para acceder a los metodos definidos ahi.Se declara como final porque su valor no sera cambiado despues de inicializar, para que esta instancia no cambie durante la ejecucion del programa
	//Instancia de la clase "ProductoService"
	
	private final ProductoService productoServicio;
	
	@Autowired //Se usa para indicar a Spring que inyecte automaticamente una instancia del ProductoService en la clase ProductoController. Asi nos aseguramos que la instancia esta disponible y lista para usarse cuando se necesite en la clase.
	
	//Segunda parte de inyeccion de depedecia
	//Contructor con ese objeto como parametro
	public ProductoController (ProductoService productoServicio) {
		this.productoServicio = productoServicio;
	}
	
	//HTTP GET para todos los productos
	@GetMapping
	public List<Producto> getProducto() {
		return productoServicio.leerProductos();
		
	}
	
//	//HTTP POST
//	@PostMapping
//	public postProducto() {
//		return productoServicio.crearProducto();
//	}
//	
//	//HTTP PUT
//	@PutMapping
//	public void putProducto() {
//	
//	}
//	
//	//HTTP DELETE
//	@DeleteMapping
//	public void deleteProducto() {
//	
//	}
	
}
