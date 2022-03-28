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
public class adung {

    private String nama;
    private String kelas;
    private int absen;

    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setAbsen(int absen) {
        this.absen = absen;
    }
    //getter
    public String getNama() {
        return this.nama;
    }

    public String getKelas() {
        return this.kelas;
    }

    public int getAbsen() {
        return this.absen;
    }

}
