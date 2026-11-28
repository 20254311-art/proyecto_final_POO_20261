/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.gestion;

import clases.ServicioAcabado;

/**
 *
 * @author Aldo
 */
public class GestionServicios {
    
    protected ServicioAcabado[]servicios;
    protected int cantidad;

    public GestionServicios(){
        servicios = new ServicioAcabado[100];
        cantidad = 0;
    }
    
    public boolean registrarServicio(ServicioAcabado servicio){
        
        if(cantidad>=servicios.length){
            return false;
        }
        
        if(buscarServicio(servicio.getCodigo()) != null){
            return false;
        }
        servicios[cantidad]=servicio;
        cantidad++;
        
        return true;
    }
    
    public ServicioAcabado buscarServicio(String codigo){
        for (int i = 0; i < cantidad; i++) {
            
            if (servicios[i].getCodigo().equalsIgnoreCase(codigo)) {
                return servicios[i];
                
            }
            
        }
        
        return null;
    }
    
    public boolean modificarServicio(String codigo, ServicioAcabado actualizado){
        ServicioAcabado servicio = buscarServicio(codigo);
        
        
        if(servicio==null){
            return false;
        }
        
        for (int i = 0; i < cantidad; i++) {
            
            if(servicios[i]!=servicio && servicios[i].getCodigo().equalsIgnoreCase(actualizado.getCodigo())){
                return false;
            }
            
            
        }
        servicio.setCodigo(actualizado.getCodigo());
        servicio.setNombre(actualizado.getNombre());
        servicio.setDescripcion(actualizado.getDescripcion());
        servicio.setPrecioPorPrenda(actualizado.getPrecioPorPrenda());
        servicio.setEstado(actualizado.getEstado());
        
        return true;
    }
    
    public boolean eliminarServicio(String codigo){
        for (int i = 0; i < cantidad; i++) {
            
            if(servicios[i].getCodigo().equalsIgnoreCase(codigo)){
                
                for (int j = i; j < cantidad; j++) {
                    servicios[j]=servicios[j+1];
                    
                }
                
                cantidad--;
                servicios[cantidad]=null;
                
                return true;
            }
            
        }
        
        return false;
    }
    
    public ServicioAcabado[]getServicio(){
        return servicios;
    }
    
    public int getCantidad(){
        return cantidad;
    }
}
