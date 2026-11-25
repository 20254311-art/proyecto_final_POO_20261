
package clases.gestion;

import clases.Empleado;

public class GestionEmpleados {
    
    private Empleado[] empleados;
    private int cantidad;

    public GestionEmpleados(int capacidad) {
        empleados = new Empleado[capacidad];
        cantidad = 0;
    }
    
    public boolean registrarEmpleado(Empleado nuevo){
        if(cantidad == empleados.length){
            return false;
        }
        
        for (int i = 0; i < cantidad; i++) {
            if (empleados[i].getDNI().equals(nuevo.getDNI())) {
                return false;
            }

            if (empleados[i].getUsuario().equals(nuevo.getUsuario())) {
                return false;
            }
        }
        
        empleados[cantidad] = nuevo;
        cantidad++;
        
        return true;
    }
    
    public Empleado buscarEmpleado(String DNI){
        for (int i = 0; i < cantidad; i++) {
            if(empleados[i].getDNI().equals(DNI)){
                return empleados[i];
            }
        }
        return null;
    }
            
    public boolean modificarEmpleados(String DNI, Empleado actualizado){
        Empleado empleado = buscarEmpleado(DNI);
        
        if (empleado == null){
            return false;
        }
        
        for (int i = 0; i < cantidad; i++) {
            if(empleados[i] != empleado){
                if (empleados[i].getDNI().equals(actualizado.getDNI())){
                    return false;
                }
                
                if (empleados[i].getUsuario().equals(actualizado.getUsuario())){
                    return false;
                }
            }
        }
        
        empleado.setDNI(actualizado.getDNI());
        empleado.setNombres(actualizado.getNombres());
        empleado.setApellidos(actualizado.getApellidos());
        empleado.setUsuario(actualizado.getUsuario());
        empleado.setClave(actualizado.getClave());
        empleado.setRol(actualizado.getRol());
        
        return true;
    }
    
    public boolean eliminarEmpleado(String DNI){
        for (int i = 0; i < cantidad; i++) {
            if(empleados[i].getDNI().equals(DNI)){
                empleados[i] = empleados[cantidad-1];
                empleados[cantidad-1] = null;
                
                cantidad--;
                
                return true;
            }
        }
        
        return true;
    }
    
    public void listarEmpleados(){
        for (int i = 0; i < cantidad; i++) {
            System.out.println("DNI: "+empleados[i].getDNI());
            System.out.println("Nombres: " + empleados[i].getNombres());
            System.out.println("Apellidos: " + empleados[i].getApellidos());
            System.out.println("Usuario: " + empleados[i].getUsuario());
            System.out.println("Rol: " + empleados[i].getRol());
            System.out.println("---------------------------");
        }
    }
    
}
