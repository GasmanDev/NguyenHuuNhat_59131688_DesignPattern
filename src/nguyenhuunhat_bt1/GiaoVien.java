/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenhuunhat_bt1;

/**
 *
 * @author MSI
 */
public class GiaoVien extends CaNhan{
    
    String monDay;
    String toBoMon;
    //Getter, setter
    public String getMonDay()
    {
        return this.monDay;
    }
    public void setMonDay(String monDay)
    {
        this.monDay = monDay;
    }
    public String getToBoMon()
    {
        return this.toBoMon;
    }
    public void setToBoMon(String toBoMon)
    {
        this.toBoMon = toBoMon;
    }
    //Phuong thuc
    public GiaoVien(){}
    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon)
    {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }
    
    @Override
    public void hienThiTT()
    {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số điện thoại: " + sdt);
        System.out.println("Môn dạy: " + monDay);
        System.out.println("Tổ bộ môn: " + toBoMon);
    }
}
