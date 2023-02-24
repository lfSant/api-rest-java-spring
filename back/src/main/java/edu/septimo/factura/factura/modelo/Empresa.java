package edu.septimo.factura.factura.modelo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "empresa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String razon;
    private String ruc;
    private String email;
    private String telefono;
    private String direccion;
    private String representante;
}
