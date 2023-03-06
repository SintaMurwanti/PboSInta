/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbosinta;

/**
 *
 * @author User
 */
public abstract class Hewan implements MakhlukHidup{
    int kaki = 0;

    public Hewan(int kaki) {
        this.kaki = kaki;
    }

    public abstract void bersuara();
     public abstract void tidur();
}
