
package clases.gestion;

import clases.Casaca;
import clases.Jean;
import clases.Prenda;

public class GestionPrendas {
    private Prenda[] prendas;
    private int cantidad;
    
    public GestionPrendas(int capacidad) {
        prendas = new Prenda[capacidad];
        cantidad = 0;
    }
    
    public boolean registrarPrenda(Prenda nueva){
        if (cantidad == prendas.length){
            return false;
        }
        
        for (int i = 0; i < cantidad; i++){
            if (prendas[i].getCodigo().equals(nueva.getCodigo())){
                return false;
            }
        }
        
        prendas[cantidad] = nueva;
        cantidad++;
        
        return true;
    }
    
    public Prenda buscarPrenda(String codigo){
        for (int i = 0; i < cantidad; i++) {
            if(prendas[i].getCodigo().equals(codigo)){
                return prendas[i];
            }
        }
        return null;
    }
    
    public boolean modificarPrenda(String codigo, Prenda actualizada){
        Prenda prenda = buscarPrenda(codigo);
        
        if (prenda == null){
            return false;
        }
        
        if (prenda.getClass() != actualizada.getClass()){
            return false;
        }
        
        for (int i = 0; i < cantidad; i++){
            if (prendas[i] != prenda){
                if (prendas[i].getCodigo().equals(actualizada.getCodigo())){
                    return false;
                }
            }
        }
        
        prenda.setCodigo(actualizada.getCodigo());
        prenda.setNombre(actualizada.getNombre());
        prenda.setTelaPrincipal(actualizada.getTelaPrincipal());
        prenda.setConsumoS(actualizada.getConsumoS());
        prenda.setConsumoM(actualizada.getConsumoM());
        prenda.setConsumoL(actualizada.getConsumoL());
        prenda.setConsumoXL(actualizada.getConsumoXL());
        prenda.setTiempoConfeccion(actualizada.getTiempoConfeccion());
        prenda.setPrecioVenta(actualizada.getPrecioVenta());
        prenda.setEstado(actualizada.getEstado());
        prenda.setCostoMetroTela(actualizada.getCostoMetroTela());
        prenda.setCostoCostura(actualizada.getCostoCostura());
        
        if (prenda instanceof Jean){
            Jean original = (Jean) prenda;
            Jean nuevo = (Jean) actualizada;

            original.setCostoLavado(nuevo.getCostoLavado());
        }else if(prenda instanceof Casaca){
            Casaca original = (Casaca) prenda;
            Casaca nuevo = (Casaca) actualizada;
            
            original.setCostoForro(nuevo.getCostoForro());
            original.setCostoAvisos(nuevo.getCostoAvisos());
        }
        
        return true;
    }
    
    public boolean eliminarPrenda(String codigo){
        for (int i = 0; i < cantidad; i++){
            if (prendas[i].getCodigo().equals(codigo)){
                prendas[i] = prendas[cantidad - 1];
                prendas[cantidad - 1] = null;
                cantidad--;

                return true;
            }
        }
        
        return false;
    }
    
    public void listarPrendas(){
        for (int i = 0; i < cantidad; i++){
            
            System.out.println("Codigo: " + prendas[i].getCodigo());
            System.out.println("Nombre: " + prendas[i].getNombre());
            System.out.println("Tela: " + prendas[i].getTelaPrincipal());
            System.out.println("Estado: " + prendas[i].getEstado());

            System.out.println("---------------------------");
        }
    }
    
}
