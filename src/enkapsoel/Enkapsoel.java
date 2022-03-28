/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsoel;

/**
 *
 * @author LENOVO
 */
public class Enkapsoel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        adung Objek = new adung();
        Objek.setNama("Rakha");//set & get nama
        System.out.println("Nama saya " + Objek.getNama());
        Objek.setKelas("XR2");//set & get kelas
        System.out.println("Kelas saya " + Objek.getKelas());
        Objek.setAbsen(33);//set & get absen
        System.out.println("Absen saya " + Objek.getAbsen());

    }

}
