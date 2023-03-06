/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbosinta;

/**
 *
 * @author User
 */
public class Sapi extends Hewan {
     public Sapi(int kaki) {
        super(kaki);
    }
    
    @Override
    public void bersuara() {
        System.out.println("Mohhhhhhh");
    }

    @Override
    public void tidur() {
        System.out.println("Sapi sedang tertidur");
    }

    @Override
    public void bernapas() {
        System.out.println("Sapi sedang bernafas");
    }

    @Override
    public void makan(String makanan) {
        System.out.println("Sapi sedang memakan " + makanan);
    }

    @Override
    public void bergerak() {
        System.out.println("Sapi sedang berjalan");
    }
}
