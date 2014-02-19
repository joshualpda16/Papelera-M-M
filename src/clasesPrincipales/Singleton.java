/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesPrincipales;

import formularios.*;
import javax.swing.DesktopManager;
import javax.swing.UIManager;

/**
 *
 * @author joshua
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    private static final Singleton INSTANCE = new Singleton();
    
    //Atributos
    private static int indiceVentanas=0;
    
    //Formularios
    private final frameListarArticulos frmListarArticulos = new frameListarArticulos();
    public frameRubros frmRubros = new frameRubros();
    public frameAgregarArticulo frmAgregarArticulo = new frameAgregarArticulo();
    public frameProveedores frmProveedores = new frameProveedores();
    
    //Constructor
    public Singleton(){}
    
    public static Singleton getInstance(){
        return INSTANCE;
    }
    
    //Metodos privados
    private int nuevoIndiceVentana(){
        indiceVentanas++;
        return indiceVentanas;
    }
    
    //Abrir y cerrar JFrames
    public void ventanaProveedores(boolean act){
        if(act){
            framePrincipal.subEscritorio.add(frmProveedores,nuevoIndiceVentana());
            frmProveedores.setLocation(10,10);
            frmProveedores.show();
            framePrincipal.mnuProveedoresVer.setEnabled(false);
            framePrincipal.cmdProveedores.setEnabled(false);
        } else{
            frmProveedores.dispose();
            framePrincipal.mnuProveedoresVer.setEnabled(true);
            framePrincipal.cmdProveedores.setEnabled(true);
        }
    }
    
    public void ventanaRubros(boolean act){
        if(act){
            framePrincipal.subEscritorio.add(frmRubros,nuevoIndiceVentana());
            frmRubros.setLocation(10, 10);
            frmRubros.show();
            framePrincipal.mnuRubrosRubros.setEnabled(false);
        } else{
            frmListarArticulos.dispose();
            framePrincipal.mnuRubrosRubros.setEnabled(true);
        }
    }
    
    public void ventanaAgregarArticulo(boolean act){
        if(act){
            framePrincipal.subEscritorio.add(frmAgregarArticulo,nuevoIndiceVentana());
            frmAgregarArticulo.setLocation(10, 10);
            frmAgregarArticulo.show();
            framePrincipal.mnuArticulosAgregar.setEnabled(false);
        } else{
            frmAgregarArticulo.dispose();
            framePrincipal.mnuArticulosAgregar.setEnabled(true);
        }
    }
    
    public void ventanaListarArticulos(boolean act){
        if(act){
            framePrincipal.subEscritorio.add(frmListarArticulos,nuevoIndiceVentana());
            frmListarArticulos.setLocation(10, 10);
            frmListarArticulos.show();
            framePrincipal.cmdListar.setEnabled(false);
            framePrincipal.mnuArticulosListar.setEnabled(false);
        } else{
            frmListarArticulos.dispose();
            framePrincipal.cmdListar.setEnabled(true);
            framePrincipal.mnuArticulosListar.setEnabled(true);
        }
    }
    
}
