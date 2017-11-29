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
public class ArticuloLiquido extends Artìculo{
    
    private float _litros;

    public articuloLiquido(String nombre, Integer codigo, float costo,int stock,float litros) {
        super(nombre, codigo,costo,stock);
        this._litros=litros;
    }
    
   
    
}
    

