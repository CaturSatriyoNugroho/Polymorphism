/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author HP
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika math = new Matematika();

        // Uji metode pecahan
        double pecahanResult = math.pecahan(12.5, 28.7, 14.2);
        System.out.println("Hasil pecahan: " + pecahanResult);

        // Uji konsep overloading
        System.out.println("Pertambahan (double): " + math.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan (int): " + math.pertambahan(12, 28, 14));
        System.out.println("Pertambahan (int): " + math.pertambahan(23, 34));
        System.out.println("Pertambahan (double): " + math.pertambahan(3.4, 4.9));
    }
}
