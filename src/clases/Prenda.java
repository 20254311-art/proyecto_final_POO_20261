/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USER
 */
public abstract class Prenda {
    protected String codigo;
    protected String nombre;
    protected String telaPrincipal;
    
    protected double consumoS;
    protected double consumoM;
    protected double consumoL;
    protected double consumoXL;
    
    protected double tiempoConfeccion;
    protected double precioVenta;
    protected String estado;
    
    protected double costoMetroTela;
    protected double costoCostura;

    public Prenda(String codigo, String nombre, String telaPrincipal, double consumoS, double consumoM, double consumoL, double consumoXL, double tiempoConfeccion, double precioVenta, String estado, double costoMetroTela, double costoCostura) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telaPrincipal = telaPrincipal;
        this.consumoS = consumoS;
        this.consumoM = consumoM;
        this.consumoL = consumoL;
        this.consumoXL = consumoXL;
        this.tiempoConfeccion = tiempoConfeccion;
        this.precioVenta = precioVenta;
        this.estado = estado;
        this.costoMetroTela = costoMetroTela;
        this.costoCostura = costoCostura;
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

    public String getTelaPrincipal() {
        return telaPrincipal;
    }

    public void setTelaPrincipal(String telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }

    public double getConsumoS() {
        return consumoS;
    }

    public void setConsumoS(double consumoS) {
        this.consumoS = consumoS;
    }

    public double getConsumoM() {
        return consumoM;
    }

    public void setConsumoM(double consumoM) {
        this.consumoM = consumoM;
    }

    public double getConsumoL() {
        return consumoL;
    }

    public void setConsumoL(double consumoL) {
        this.consumoL = consumoL;
    }

    public double getConsumoXL() {
        return consumoXL;
    }

    public void setConsumoXL(double consumoXL) {
        this.consumoXL = consumoXL;
    }

    public double getTiempoConfeccion() {
        return tiempoConfeccion;
    }

    public void setTiempoConfeccion(double tiempoConfeccion) {
        this.tiempoConfeccion = tiempoConfeccion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getCostoMetroTela() {
        return costoMetroTela;
    }

    public void setCostoMetroTela(double costoMetroTela) {
        this.costoMetroTela = costoMetroTela;
    }

    public double getCostoCostura() {
        return costoCostura;
    }

    public void setCostoCostura(double costoCostura) {
        this.costoCostura = costoCostura;
    }
    
    public abstract double calcularCostoProduccion(String talla);
    
    public double obtenerConsumo(String talla){
        if(talla.equals("S")){
            return consumoS;
        }else if (talla.equals("M")){
             return consumoM;
        }else if (talla.equals("L")){
            return consumoL;
        }else if (talla.equals("XL")){
            return consumoXL;
        }
        return 0;
    }
    
}
