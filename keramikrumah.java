/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramikrumah;

/**
 *
 * @author TEGAR SATRIYA WIGUNA
 */
public class KeramikRumah {
    int Luaslantai;
    
    void keramikA(){
        double ukurankeramik = 0.3 * 0.3;
        int pcs = 10;
        int harga = 54000;
        double total = ((this.Luaslantai / ukurankeramik) / pcs) * harga;
        System.out.println("Keramik A");
        System.out.println("Total harga Rp. " + total+ " dengan luas "+ this.Luaslantai+ " meter persegi");
        System.out.println("------------------------------------------------------------------");
    }
    
    void keramikB(){
        double ukurankeramik = 0.4 * 0.4;
        int pcs = 10;
        int harga = 54000;
        double total = ((this.Luaslantai / ukurankeramik) / pcs) * harga;
        System.out.println("Keramik B");
        System.out.println("Total harga Rp. " + total+ " dengan luas "+ this.Luaslantai+ " meter persegi");
        System.out.println("------------------------------------------------------------------");
    }
    
    void keramikC(){
        double ukurankeramik = 0.3 * 0.4;
        int pcs = 10;
        int harga = 54000;
        double total = ((this.Luaslantai / ukurankeramik) / pcs) * harga;
        System.out.println("Keramik C");
        System.out.println("Total harga Rp. " + total+ " dengan luas "+ this.Luaslantai+ " meter persegi");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KeramikRumah p1 = new KeramikRumah ();
        p1.Luaslantai = 100;
        p1.keramikA();
        p1.keramikB();
        p1.keramikC();
    }
    
}
