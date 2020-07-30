/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO 110-14IAP
 */
public class arraysatudimensi {
    public static void main(String[] args) {
        // contoh deklarasi array cara ke-1
        int angka[] = new int[4];
        angka[0] = 100;
        angka[1] = 200;
        angka[2] = 150;
        angka[3] = 120;
        
        
        // contoh deklarasi array cara ke-2
        String koncoplek[] = {"rokhim", "alvi", "jihar", "nanda"};
        
        // cara print array
        for (int i=0; i<angka.length; i++){
        System.out.println(angka[i]);
        }
        
        for (int i=0; i<koncoplek.length; i++){
        System.out.println(koncoplek[i]);
        }
    }
}
   
