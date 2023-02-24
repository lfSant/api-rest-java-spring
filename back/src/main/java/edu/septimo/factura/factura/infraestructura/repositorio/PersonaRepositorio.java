package edu.septimo.factura.factura.infraestructura.repositorio;

import edu.septimo.factura.factura.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {
}
