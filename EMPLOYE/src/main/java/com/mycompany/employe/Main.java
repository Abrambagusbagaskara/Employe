
package com.mycompany.employe;

/**
 *
 * @author ASUS
 */
public class Main extends EMPLOYE{
    public static void main(String[] args) {
        MANAGER manager = new MANAGER();
       BOS bos = new BOS();
   CS cs = new CS();
   bos.print();
   manager.print();
   cs.print();
    }
}
