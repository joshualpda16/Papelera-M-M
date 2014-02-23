/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author joshua
 */
public class Articulo {
    private int idArticulo;
    private String nombre;
    private int stock;
    private double precioCompra;
    private double precioVentaU;
    private int cantidadPorBulto;
    private double precioVentaB;
    
    private Rubro rubro;
    private SubRubro subRubro;
    private Proveedor proveedor;

    public Articulo() {
    }

    public Articulo(String nombre, double precioCompra, double precioVentaU, int cantidadPorBulto, double precioVentaB, int stock, Rubro rubro, SubRubro subRubro, Proveedor proveedor) {
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVentaU = precioVentaU;
        this.cantidadPorBulto = cantidadPorBulto;
        this.precioVentaB = precioVentaB;
        this.stock = stock;
        this.rubro = rubro;
        this.subRubro = subRubro;
        this.proveedor = proveedor;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    private void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVentaU() {
        return precioVentaU;
    }

    public void setPrecioVentaU(double precioVentaU) {
        this.precioVentaU = precioVentaU;
    }

    public int getCantidadPorBulto() {
        return cantidadPorBulto;
    }

    public void setCantidadPorBulto(int cantidadPorBulto) {
        this.cantidadPorBulto = cantidadPorBulto;
    }

    public double getPrecioVentaB() {
        return precioVentaB;
    }

    public void setPrecioVentaB(double precioVentaB) {
        this.precioVentaB = precioVentaB;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public SubRubro getSubRubro() {
        return subRubro;
    }

    public void setSubRubro(SubRubro subRubro) {
        this.subRubro = subRubro;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    
    
}
