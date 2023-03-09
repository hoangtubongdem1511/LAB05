/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */

public class camSanh extends quaCam {
    public String mau="Cam";
    public String vi="chua";

    public camSanh(double cannang , int soluong) {
        super(cannang , soluong);
    }
    public String xuattencamsanh(){
        return ten = "Cam sanh";
    }
    
    public double getGiaBanCamSanh() {
        return super.getGiaBan() * 2000;
    }
}
