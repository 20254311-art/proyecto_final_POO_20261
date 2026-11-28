/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.gestion;

import clases.PaquetePromocional;

/**
 *
 * @author Aldo
 */
public class GestionPaquetes {
    
    protected PaquetePromocional[] paquetes;
    protected  int cantidad;

    public GestionPaquetes(PaquetePromocional[] paquetes, int cantidad) {
        paquetes = new PaquetePromocional[100];
        cantidad = 0;
    }
    
    public boolean registrarPaquetes(PaquetePromocional paquete){
        if(cantidad >= paquetes.length){
            return false;
        }
        
        if(buscarPaquete(paquete.getCodigo()) !=null){
            return false;
            
        }
        
        paquetes[cantidad]=paquete;
        cantidad++;
        
        return true;
    }
    
    public PaquetePromocional buscarPaquete(String codigo){
        
        for (int i = 0; i < cantidad; i++) {
            
            if(paquetes[i].getCodigo().equalsIgnoreCase(codigo)){
                return paquetes[i];
            }
            
        }
        
        return null;
    }
    
    
    public boolean modificarPaquete(String codigo, PaquetePromocional actualizado){
        
        PaquetePromocional paquete =buscarPaquete(codigo);
        
        if(paquete ==null){
            return false;
        }
        for (int i = 0; i < cantidad; i++) {
            
            if (paquetes[i] != paquete && paquetes[i].getCodigo().equalsIgnoreCase(actualizado.getCodigo())) {
                return false;
                
            }
            
        }
        
        paquete.setCodigo(actualizado.getCodigo());
        paquete.setNombre(actualizado.getNombre());
        paquete.setPrecioPromocional(actualizado.getPrecioPromocional());
        paquete.setEstado(actualizado.getEstado());
        
        paquete.prendas=actualizado.prendas;
        paquete.servicios=actualizado.servicios;
        
        
        paquete.cantidadPrendas=actualizado.cantidadPrendas;
        paquete.cantidadServicios=actualizado.cantidadServicios;
        
        
        return true;
    }
    
    
    public boolean eliminarPaquete(String codigo){
        
        for (int i = 0; i < cantidad; i++) {
            
            if (paquetes[i].getCodigo().equalsIgnoreCase(codigo)) {
                
                for (int j = i; j < cantidad-1; j++) {
                    paquetes[i]=paquetes[j+1];
                    
                }
                cantidad--;
                paquetes[cantidad]=null;
                
                return true;
                
            }
            
        }
        return false;
    }
    
    public PaquetePromocional[]getPaquete(){
        return paquetes;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    
    
}
