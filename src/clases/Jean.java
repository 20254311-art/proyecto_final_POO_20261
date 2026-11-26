
package clases;

public class Jean extends Prenda{
    protected double costoLavado;

    public Jean(double costoLavado, String codigo, String nombre, String telaPrincipal, double consumoS, double consumoM, double consumoL, double consumoXL, double tiempoConfeccion, double precioVenta, String estado, double costoMetroTela, double costoCostura) {
        super(codigo, nombre, telaPrincipal, consumoS, consumoM, consumoL, consumoXL, tiempoConfeccion, precioVenta, estado, costoMetroTela, costoCostura);
        this.costoLavado = costoLavado;
    }

    public double getCostoLavado() {
        return costoLavado;
    }

    public void setCostoLavado(double costoLavado) {
        this.costoLavado = costoLavado;
    }
    
    @Override
    public double calcularCostoProduccion(String talla) {
        double costoTela = obtenerConsumo(talla) * costoMetroTela;
        
        return costoTela + costoCostura + costoLavado;
    }
    
    
}
