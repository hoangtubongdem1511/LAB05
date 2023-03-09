/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class main {    
    public static void main(String[] args){
        System.out.println("1. Tao'");
        System.out.println("2. Cam Sanh`");
        System.out.println("3. Cam Cao Phong");
        System.out.print("Chon chuc nang: ");
        Scanner sc=new Scanner(System.in);
        int chon = sc.nextInt();
        switch (chon) {
            case 1 -> {
                quaTao qt =new quaTao(0 , 0);
                System.out.println( ""+qt.xuattentao());
                System.out.print("Nhap so kg can mua: ");
                qt.setCanNang(sc.nextInt());
                System.out.print("Nhap so luong can mua: ");
                qt.setSoLuong(sc.nextInt());
                System.out.println("Gia la: "+qt.getGiaBanTao());
            }
            case 2 -> {
                camSanh cs=new camSanh(0 ,0);
                System.out.println(""+cs.xuattencamsanh());
                System.out.print("Nhap so kg can mua: ");
                cs.setCanNang(sc.nextInt());
                System.out.print("Nhap so luong can mua: ");
                cs.setSoLuong(sc.nextInt());
                System.out.println("Gia la: "+cs.getGiaBanCamSanh());
            }
            case 3 -> {
                camCaoPhong ccp=new camCaoPhong(0 , 0);
                System.out.println(""+ccp.xuattencamcaophong());
                System.out.print("Nhap so kg can mua: ");
                ccp.setCanNang(sc.nextInt());
                System.out.print("Nhap so luong can mua: ");
                ccp.setSoLuong(sc.nextInt());
                System.out.println("Gia la: "+ccp.getGiaBanCamCaoPhong());
            }
            default -> System.out.println("Ban da nhap sai! ");
        }
    }
}
