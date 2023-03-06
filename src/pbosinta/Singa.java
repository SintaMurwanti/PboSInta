/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbosinta;

/**
 *
 * @author User
 */
public class Singa extends Hewan {

    public Singa(int kaki) {
        super(kaki);
    }
    
    @Override
    public void bersuara() {
        System.out.println("Rawwwr");
    }

    @Override
    public void tidur() {
        System.out.println("Singa sedang tertidur");
    }

    @Override
    public void bernapas() {
        System.out.println("Singa sedang bernafas");
    }

    @Override
    public void makan(String makanan) {
        System.out.println("Singa sedang memakan " + makanan);
    }

    @Override
    public void bergerak() {
        System.out.println("Singa sedang berjalan");
    }
    
}
