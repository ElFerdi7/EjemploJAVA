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
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente fernando = new Cliente("22583952E", "Fernando", "Doctor Jose Peris");

        Cuenta uno = new Cuenta(1000, "7-7-1991");

        fernando.anyadirActor(uno);

        System.out.println(fernando.toString());

        // TODO code application logic here
    }

}
