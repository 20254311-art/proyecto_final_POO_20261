package clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldo
 */
public class Insumo {
    protected String codigo;
    protected String nombre;
    protected String tipo;
    protected int stock;
    protected int stockMinimo;
    protected double costoUnitario;

    public Insumo(String codigo, String nombre, String tipo, int stock, int stockMinimo, double costoUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
        this.costoUnitario = costoUnitario;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }
    
    public boolean verificarStockMinimo(){
        return stock <= stockMinimo;
    }
    
}
