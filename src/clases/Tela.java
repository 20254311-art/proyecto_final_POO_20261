/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Aldo
 */
public class Tela {
    protected String codigo;
    protected String tipo;
    protected String color;
    protected double metrosStock;
    protected double costoMetro;

    public Tela(String codigo, String tipo, String color, double metrosStock, double costoMetro) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.color = color;
        this.metrosStock = metrosStock;
        this.costoMetro = costoMetro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMetrosStock() {
        return metrosStock;
    }

    public void setMetrosStock(double metrosStock) {
        this.metrosStock = metrosStock;
    }

    public double getCostoMetro() {
        return costoMetro;
    }

    public void setCostoMetro(double costoMetro) {
        this.costoMetro = costoMetro;
    }
    
    
    
}
