/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.gestion;

import clases.Tela;

/**
 *
 * @author Aldo
 */
public class GestionTelas {
    
    protected Tela[] telas;
    protected int cantidad;

    public GestionTelas() {
        telas=new Tela[100];
        cantidad=0;
    }
    
    public boolean registrarTela(Tela tela){
        
        if(cantidad >= telas.length){
            return false;
        }
        
        if(buscarTela(tela.getCodigo()) !=null){
            return false;
        }
        telas[cantidad]=tela;
        cantidad++;
        
        return true;
        
    }

    public Tela buscarTela(String codigo) {
        
        for (int i = 0; i < cantidad; i++) {
            
            if(telas[i].getCodigo().equalsIgnoreCase(codigo)){
                return telas[i];
            }
            
        }
        
        return null;
    }
    
    public boolean modificarTela(String codigo,Tela actualizado){
        
        Tela tela=buscarTela(codigo);
        
        if(tela==null){
            return false;
        }
        for (int i = 0; i < cantidad; i++) {
            
            if(telas[i]!=tela && telas[i].getCodigo().equalsIgnoreCase(actualizado.getCodigo())){
                return false;
            }
            
        }
        
        tela.setCodigo(actualizado.getCodigo());
        tela.setTipo(actualizado.getTipo());
        tela.setColor(actualizado.getColor());
        tela.setMetrosStock(actualizado.getMetrosStock());
        tela.setCostoMetro(actualizado.getCostoMetro());
        return true;
    }
    
    public boolean eliminarTela(String codigo){
        
        for (int i = 0; i < cantidad; i++) {
            if (telas[i].getCodigo().equalsIgnoreCase(codigo)) {
                for (int j = i; j < cantidad - 1; j++) {
                    telas[j]=telas[j+1];
                    
                }
                
                cantidad--;
                telas[cantidad]=null;
                
                
                return true;
            }
            
        }
        
        return false;
    }
    
    public Tela[] getTelas(){
        return telas;
    }
    
    public int getCantidad(){
        return cantidad;
        
    }
    
    
}
