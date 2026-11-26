
package clases;

public class Polo extends Prenda{

    public Polo(String codigo, String nombre, String telaPrincipal, double consumoS, double consumoM, double consumoL, double consumoXL, double tiempoConfeccion, double precioVenta, String estado, double costoMetroTela, double costoCostura) {
        super(codigo, nombre, telaPrincipal, consumoS, consumoM, consumoL, consumoXL, tiempoConfeccion, precioVenta, estado, costoMetroTela, costoCostura);
    }

    @Override
    public double calcularCostoProduccion(String talla) {
        double costoTela = obtenerConsumo(talla) * costoMetroTela;
        
        return costoTela + costoCostura;
    }
    
    
    
}
