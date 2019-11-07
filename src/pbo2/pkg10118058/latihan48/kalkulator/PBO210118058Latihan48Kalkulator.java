/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan48.kalkulator;

/**
 *
 * @author user
 */
public class PBO210118058Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     *  Nama:Satyaning Andaru bawalaksana
     * Nim: 10118058
     * kelas : If-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator k = new Kalkulator(7.0,5.0);
        System.out.println("Value 1 = "+k.getValue1());
        System.out.println("Value 2 = "+k.getValue2());
        k.setNameProject();
        k.setNoteProject(null);
        System.out.println("Result Add is = " +k.add());
        System.out.println("Result Minus is = " +k.minus());
        System.out.println("Result Multiple is = " +k.multiplication());
        System.out.println("Result Division is = " +k.division());
        
    }
    
}
