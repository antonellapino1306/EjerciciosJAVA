/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetoscomprayventa;

/**
 *
 * @author alumno
 */
    
public class ArtìculoComestible extends articulo {
    
    private Date _fechaVencimiento;

    public articuloComestible(String nombre, int codigo, float costo, int stock,Date fechaVencimiento) {
        super(nombre,codigo ,costo,stock);
        this._fechaVencimiento=fechaVencimiento;
    }
   
}
