/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author a022583952e
 */
public class Cuenta {

    private int balance;
    private String fechaapertura;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getFechaapertura() {
        return fechaapertura;
    }

    public void setFechaapertura(String fechaapertura) {
        this.fechaapertura = fechaapertura;
    }

    public Cuenta(int balance, String fechaapertura) {
        this.balance = balance;
        this.fechaapertura = fechaapertura;
    }

    public int ingresar() {

        int a = 555;

        balance = balance + a;

        return balance;

    }

    public int retirar() {

        int c = 555;

        balance = balance - c;

        return balance;

    }

    @Override
    public String toString() {
        return "Cuenta{" + "balance=" + balance + ", fechaapertura=" + fechaapertura + '}';
    }

}
