/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Aldo
 */
public class PaquetePromocional {
    protected String codigo;
    protected String nombre;
    public Prenda[] prendas;
    public ServicioAcabado[] servicios;
    public int cantidadPrendas;
    public int cantidadServicios;
    protected double precioPromocional;
    protected String estado;

    public PaquetePromocional(String codigo, String nombre, double precioPromocional, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioPromocional = precioPromocional;
        this.estado = estado;
        
        prendas=new Prenda[100];
        servicios=new ServicioAcabado[100];
        
        cantidadPrendas=0;
        cantidadServicios=0;
        
    }
    public boolean agregarPrenda(Prenda prenda){
        if(cantidadPrendas >= prendas.length){
            return false;
        }
        prendas[cantidadPrendas]=prenda;
        cantidadPrendas++;
        
        
        return true;
    }
    
    public boolean agregarServicio(ServicioAcabado servicio){
        if(cantidadServicios >= servicios.length){
            return false;
        }
        servicios[cantidadServicios]=servicio;
        cantidadServicios++;
        
        return true;
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

    public double getPrecioPromocional() {
        return precioPromocional;
    }

    public void setPrecioPromocional(double precioPromocional) {
        this.precioPromocional = precioPromocional;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Prenda[] getPrendas(){
        return prendas;
    }
    
    public ServicioAcabado[] getServicios(){
        return servicios;
    }
    
    public int getCantidadPrendas(){
        return  cantidadPrendas;
    }
    public int getCantidadServicios(){
        return cantidadServicios;
    }
    
    
    
    
}
