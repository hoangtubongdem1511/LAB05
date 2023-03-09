/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;
import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class main {
    public static void main(String[] args) {
        Square s=new Square();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap canh: ");
        s.setSide(sc.nextDouble());
        System.out.println(s);
    }
}
