/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class quaTao extends hoaQua {
    public String mau="Do";
    public String vi="ngot";
    
    public String xuattentao(){
        return ten ="Tao'";
    }

    public quaTao(double cannang , int soluong) {
        super(cannang , soluong);
    }
    
    public double getGiaBanTao() {
        return super.getGiaBan() * 1000;
    }

}
