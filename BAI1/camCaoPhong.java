/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */

public class camCaoPhong extends quaCam {
    public String mau="Cam";
    public String vi="ngot";

    public camCaoPhong(double cannang , int soluong) {
        super(cannang , soluong);
    }
    public String xuattencamcaophong(){
        return ten = "Cam cao phong";
    }
    
    public double getGiaBanCamCaoPhong() {
        return super.getGiaBan() * 1500;
    }
}
