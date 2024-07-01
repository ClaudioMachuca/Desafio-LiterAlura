package com.alura.literatura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String fechaDeNacimiento;
    private String fechaDeFallecimiento;
    @ManyToOne
    private Libro libro;

    public Autor(){}

    public Autor(DatosAutor autor) {
        this.nombre = autor.nombre();
        this.fechaDeNacimiento = autor.fechaDeNacimiento();
        this.fechaDeFallecimiento = autor.fechaDeFallecimiento();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getFechaDeFallecimiento() {
        return fechaDeFallecimiento;
    }

    public void setFechadeMuerte(String fechadeMuerte) {
        this.fechaDeFallecimiento = fechadeMuerte;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", fechadeMuerte='" + fechaDeFallecimiento + '\'' +
                ", libroDd=" + libro;
    }
}

