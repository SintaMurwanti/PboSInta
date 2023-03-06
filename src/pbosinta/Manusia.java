/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbosinta;

/**
 *
 * @author User
 */
public class Manusia implements MakhlukHidup {
    String nama;

    public Manusia(String nama) {
        this.nama = nama;
    }

    
    
    @Override
    public void bernapas() {
        System.out.println(nama +" sedang bernafas dengan paru-paru");
    }
    

    @Override
    public void makan(String makanan) {
        System.out.println(nama + " sedang makan " + makanan);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " sedang berjalan");
    }
    
}
