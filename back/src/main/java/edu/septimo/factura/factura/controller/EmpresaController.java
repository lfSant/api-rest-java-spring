package edu.septimo.factura.factura.controller;

import edu.septimo.factura.factura.infraestructura.repositorio.EmpresaRepositorio;
import edu.septimo.factura.factura.modelo.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class EmpresaController {

    @Autowired
    EmpresaRepositorio empresaRepositorio;

    @GetMapping("/empresas")
    @ResponseStatus(HttpStatus.OK)
    public List<Empresa> getEmpresa()
    {
        return empresaRepositorio.findAll();
    }


}
