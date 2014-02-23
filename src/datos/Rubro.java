/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.util.Set;
import java.util.TreeSet;


public class Rubro {
    private int idRubro;
    private String nombre;
    private Set<SubRubro> subRubro = new TreeSet<SubRubro>();
    private Set<Articulo> articulos = new TreeSet<Articulo>();
//    private Set<Articulo> articulos = new TreeSet<Articulo>();

    public Rubro(){
    }
    
    public Rubro(String nombre) {
        this.nombre = nombre;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    public int getIdRubro() {
        return idRubro;
    }

    private void setIdRubro(int idRubro) {
        this.idRubro = idRubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<SubRubro> getSubRubros() {
        return subRubro;
    }

    public void setSubRubros(Set<SubRubro> subRubros) {
        this.subRubro = subRubros;
    }
    
}
