/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author joshua
 */
public class SubRubro {
    private int idSubRubro;
    private Rubro rubro;
    private String nombre;
    private Double precioCompra;
    private Double precioVenta;
    private Calendar fecUltimaModif;
    private Double ultimoPorc;
    private Set<Articulo> articulos=new TreeSet<Articulo>();;

    public SubRubro() {
    }

    public SubRubro(Rubro rubro, String nombre, Double precioCompra, Double precioVenta, Calendar fecUltimaModif, Double ultimoPorc) {
        this.rubro = rubro;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.fecUltimaModif = fecUltimaModif;
        this.ultimoPorc = ultimoPorc;
    }

    public int getIdSubRubro() {
        return idSubRubro;
    }

    private void setIdSubRubro(int idSubRubro) {
        this.idSubRubro = idSubRubro;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Calendar getFecUltimaModif() {
        return fecUltimaModif;
    }

    public void setFecUltimaModif(Calendar fecUltimaModif) {
        this.fecUltimaModif = fecUltimaModif;
    }

    public Double getUltimoPorc() {
        return ultimoPorc;
    }

    public void setUltimoPorc(Double ultimoPorc) {
        this.ultimoPorc = ultimoPorc;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    
}
