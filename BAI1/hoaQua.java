/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class hoaQua {
    public String ten;
    public double cannang;
    public int soluong;
    
    public void xuatten(){
        System.out.println(""+ten+"");
    }

    public hoaQua() {
        this.cannang = 0;
        this.soluong = 0;
    }

    public hoaQua(double cannang , int soluong) {
        this.cannang = cannang;
        this.soluong = soluong;
    }

    public double getCanNang() {
        return cannang;
    }

    public int getSoLuong() {
        return soluong;
    }


    public void setCanNang(double cannang) {
        this.cannang = cannang;
    }

    public void setSoLuong(int soluong) {
        this.soluong = soluong;
    }

    public double getGiaBan() {
        return cannang * soluong;
    }

    @Override
    public String toString() {
    return "";
    }

    
}
