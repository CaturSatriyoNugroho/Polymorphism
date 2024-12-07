/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author HP
 */
public class Matematika {
    // Metode pertambahan
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public double pertambahan(double a, double b) {
        return a + b;
    }

    public double pertambahan(double a, double b, double c) {
        return a + b + c;
    }

    // Metode pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    public double pengurangan(double a, double b) {
        return a - b;
    }

    // Metode perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    public double perkalian(double a, double b) {
        return a * b;
    }

    // Metode pembagian
    public double pembagian(int a, int b) {
        return (double) a / b;
    }

    public double pembagian(double a, double b) {
        return a / b;
    }

    // Metode modulus
    public int modulus(int a, int b) {
        return a % b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }

    // Metode baru untuk pecahan
    public double pecahan(double a, double b, double c) {
        return a + b + c; // Contoh implementasi
    }
}
