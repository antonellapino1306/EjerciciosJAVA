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
public class Producto {
private int _id;
private String _nombre;
public float _precio;

public Producto (int id, String nombre,float precio)
{
    this._id=id;
    this._nombre=nombre;
    this._precio=precio;
    
}
public float GetterPrecio()
{
    return this._precio;
}
public void MostrarProducto()
{
    System.out.println(this.toString());
}
public String toString()
{
  return
}

}
