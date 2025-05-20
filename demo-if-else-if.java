package com.mycompany.strukturkontrolpemilihan;

/**
 * Demonstrasi If-Else-If Bertingkat
 * @author luqmanaru
 */
public class StrukturKontrolPemilihan {
    public static void main(String[] args) {
        int grade = 65;
        
        if (grade > 90) {
            System.out.println("Very good!");
        } 
        else if (grade > 60) {
            System.out.println("Good job!");
        }
        else {
            System.out.println("Sorry you failed");
        }
    }
}
