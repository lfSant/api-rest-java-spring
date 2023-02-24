package edu.septimo.factura.factura.controller;

import edu.septimo.factura.factura.infraestructura.repositorio.PersonaRepositorio;
import edu.septimo.factura.factura.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    PersonaRepositorio personaRepositorio;

    @GetMapping("/personas")
    @ResponseStatus(HttpStatus.OK)
    public List<Persona> getPersonas()
    {
        return personaRepositorio.findAll();
    }

    //generate a post method to save a new person
    @PostMapping("/guardarpersona")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona savePersona(@RequestBody Persona persona){
        return personaRepositorio.save(persona);
    }

    //generate a put method to update a person
    @PutMapping("/actualizarpersona")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona updatePersona(@RequestBody Persona persona)
    {
        return personaRepositorio.save(persona);
    }

    //generate a delete method to delete a person
    @DeleteMapping("/eliminarpersona/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePersona(@PathVariable int id)
    {
        personaRepositorio.deleteById(id);
    }

}
