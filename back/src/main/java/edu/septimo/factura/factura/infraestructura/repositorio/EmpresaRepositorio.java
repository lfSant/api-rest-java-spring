package edu.septimo.factura.factura.infraestructura.repositorio;

import edu.septimo.factura.factura.modelo.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepositorio extends JpaRepository<Empresa, Integer> {
}
