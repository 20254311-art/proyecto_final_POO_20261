/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.gestion;

import clases.Insumo;

/**
 *
 * @author Aldo
 */
public class GestionInsumos {
    
    protected Insumo[] insumos;
    protected int cantidad;
    
    public GestionInsumos(){
        insumos=new Insumo[100];
        cantidad=0;
    }
    
    
    public boolean registrarInsumo(Insumo insumo){
        if(cantidad >= insumos.length){
            return false;
        }
        
        if(buscarInsumo(insumo.getCodigo()) != null){
           return false;
        
        }
        
        insumos[cantidad]=insumo;
        cantidad++;
        
        return true;
    }

    public Insumo buscarInsumo(String codigo) {
        for (int i = 0; i < cantidad; i++) {
            
            if(insumos[i].getCodigo().equalsIgnoreCase(codigo)){
                return insumos[i];
            
        }
    }
     return null;
    
    }
    
     public boolean modificarInsumo(String codigo,Insumo actualizado){
    
    Insumo insumo=buscarInsumo(codigo);
    
    if(insumo==null){
        return false;
    }
         for (int i = 0; i < cantidad; i++) {
             
             if(insumos[i] != insumo && insumos[i].getCodigo().equalsIgnoreCase(actualizado.getCodigo())){
                 return false;
             }
             
         }
         
         insumo.setCodigo(actualizado.getCodigo());
         insumo.setNombre(actualizado.getNombre());
         insumo.setTipo(actualizado.getTipo());
         insumo.setStock(actualizado.getStock());
         insumo.setCostoUnitario(actualizado.getCostoUnitario());
             
         
         return true;
         }
     
         public boolean eliminarInsumo(String codigo){
             for (int i = 0; i < cantidad; i++) {
                 
                 if (insumos[i].getCodigo().equalsIgnoreCase(codigo)) {
                     
                     for (int j = i; j < cantidad-1; j++) {
                         insumos[j]=insumos[j+1];
                         
                     }
                     
                     cantidad--;
                     insumos[cantidad]=null;
                     
                     return true;
                     
                 }
                 
             }
             return false;
         }
         
         public Insumo[] geInsumos(){
             return insumos;
         }
         
         public int getCantidad(){
             return cantidad;
         }
}
    

