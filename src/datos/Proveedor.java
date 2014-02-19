/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author joshua
 */
public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String direccion1;
    private String direccion2;
    private String telefono1;
    private String telefono2;
    private String empleado1;
    private String empleado2;
    private Set<Articulo> articulos = new TreeSet<Articulo>();
    
    public Proveedor(){
    }

    public Proveedor(String nombre, String direccion1, String direccion2, String telefono1, String telefono2, String empleado1, String empleado2) {
        this.nombre = nombre;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    public int getIdProveedor() {
        return idProveedor;
    }

    private void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(String empleado1) {
        this.empleado1 = empleado1;
    }

    public String getEmpleado2() {
        return empleado2;
    }

    public void setEmpleado2(String empleado2) {
        this.empleado2 = empleado2;
    }
    
    
}