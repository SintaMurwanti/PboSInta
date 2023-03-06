    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbosinta;

/**
 *
 * @author User
 */
public class PboSinta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan[] h = new Hewan[2];
        h[0] = new Singa(4);
        h[1] = new Sapi(4);
        
        for (int i = 0; i < 2; i++) {
            h[0].bergerak();
            h[i].bernapas();
            h[i].bersuara();
            h[i].tidur();
            if (i == 0) {
                h[i].makan("Daging");
            }else{
                h[i].makan("Rumput");
            }
            System.out.println("");
            System.out.println("");
        }
        
        try{
            Manusia manusia = new Manusia("Sinta Murwanti");
             
            manusia.bergerak();
            manusia.bernapas();
            manusia.bergerak();
        }catch(Exception e){
            System.out.println("Terdapat error" + e.getMessage());
        }
       
       
    }
    
}
