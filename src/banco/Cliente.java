/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

/**
 *
 * @author a022583952e
 */
public class Cliente {
    
    private String nif;
    private String nombre;
    private String direccion;
    ArrayList<Cuenta>cuentas=new ArrayList<Cuenta>();

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente(String nif, String nombre, String direccion) {
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public Cuenta anyadirActor(Cuenta anyadir){
        cuentas.add(anyadir);
        return anyadir;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", cuentas=" + cuentas + '}';
    }
    
    
    
}
