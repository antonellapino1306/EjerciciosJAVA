/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploproductoconteiner;

/**
 *
 * @author alumno
 */
public class Importado extends Producto{
    private String _pais;
    private float _Impuesto;
    
    public Importado (int id, String nombre,float precio,String pais,float Impuesto)
    {
        super(id,nombre,precio);
        this._pais=pais;
        this._Impuesto=Impuesto;
    }
    public void MostrarProducto()
    {
    super.MostrarProducto();
        System.out.println("pais"+ this._pais "Impuesto"+ this._Impuesto);
        
    }
}
