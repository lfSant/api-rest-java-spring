package edu.septimo.factura.factura.modelo;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "persona")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String username;
    private String email;
    private String ciudad;
    private String estado;
    private String direccion;
    private String cargo;
    private String sueldo;
    //Fecha de nacimiento
    private Date fechaNacimiento;
}
