package br.com.dicasdeumdev.api3.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dicasdeumdev.api3.domain.Usuario;

@RestController
@RequestMapping(value="/user")
public class UserResource {
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Integer id) {
//		return ResponseEntity.ok().body(new User(1,"valdir","valdir@email.com","123"));
//		return ResponseEntity.ok().body(new Usuario(1,"valdir","valdir@email.com","123"));
		return ResponseEntity.ok().body(new Usuario());		
		
	}

}
