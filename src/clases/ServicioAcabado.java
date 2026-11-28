/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Aldo
 */
public class ServicioAcabado {
    protected String codigo;
    protected String nombre;
    protected String descripcion;
    protected double precioPorPrenda;
    protected String estado;

    public ServicioAcabado(String codigo, String nombre, String descripcion, double precioPorPrenda, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioPorPrenda = precioPorPrenda;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioPorPrenda() {
        return precioPorPrenda;
    }

    public void setPrecioPorPrenda(double precioPorPrenda) {
        this.precioPorPrenda = precioPorPrenda;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public double calcularCosto(int cantidadPrendas){
        return precioPorPrenda * cantidadPrendas;
        
    }
    
}
