/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Dodii
 */

//import java.text.DecimalFormat;

public class Konversi_uang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dolar, euro;
        String r =javax.swing.JOptionPane.showInputDialog("Masukkan nilai Rupiah ");
        int r1 = Double.parseDouble(r); //perintah konversi dari string ke double
        dolar=r1/3000;
        euro=r1/3000;
         //code untuk membatasi jumlah angka di belakang koma
        //DecimalFormat formatdata = new DecimalFormat("#.##");
        //dolar = Double.valueOf(formatdata.format(dolar));
        //euro = Double.valueOf(formatdata.format(euro));
        javax.swing.JOptionPane.showMessageDialog(null, "Hasil konversi Mata Uang: \n Rp " +r+" = "+dolar+" Dolar \n Rp " +r+" = "+euro+" Euro");   
        System.out.println("Hasil konversi Mata Uang:");
        System.out.println("Rp " +r+" = "+dolar+" Dolar");
        System.out.println("Rp " +r+" = "+euro+" Euro");   
    }
    
}
