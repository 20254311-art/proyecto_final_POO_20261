
package clases;

public class Casaca extends Prenda{
    protected double costoForro;
    protected double costoAvisos;

    public Casaca(double costoForro, double costoAvisos, String codigo, String nombre, String telaPrincipal, double consumoS, double consumoM, double consumoL, double consumoXL, double tiempoConfeccion, double precioVenta, String estado, double costoMetroTela, double costoCostura) {
        super(codigo, nombre, telaPrincipal, consumoS, consumoM, consumoL, consumoXL, tiempoConfeccion, precioVenta, estado, costoMetroTela, costoCostura);
        this.costoForro = costoForro;
        this.costoAvisos = costoAvisos;
    }

    public double getCostoForro() {
        return costoForro;
    }

    public void setCostoForro(double costoForro) {
        this.costoForro = costoForro;
    }

    public double getCostoAvisos() {
        return costoAvisos;
    }

    public void setCostoAvisos(double costoAvisos) {
        this.costoAvisos = costoAvisos;
    }
    
    @Override
    public double calcularCostoProduccion(String talla) {
        double costoTela = obtenerConsumo(talla) * costoMetroTela;
        
        return costoTela + costoCostura + costoForro + costoAvisos;
    }
    
    
}
