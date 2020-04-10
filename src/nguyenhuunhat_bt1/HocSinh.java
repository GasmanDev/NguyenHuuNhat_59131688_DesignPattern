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
public class HocSinh extends CaNhan {
    String lop;
    String nangKhieu;
    
    //Getter, setter
    public String getLop()
    {
        return this.lop;
    }
    public void setLop(String lop)
    {
        this.lop = lop;
    }
    public String getNangKhieu()
    {
        return this.nangKhieu;
    }
    public void setNangKhieu(String nangKhieu)
    {
        this.nangKhieu = nangKhieu;
    }
    //Phuong thuc
    public HocSinh(){}
    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu)
    {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public void hienThiTT()
    {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số điện thoại: " + sdt);
        System.out.println("Lớp: " + lop);
        System.out.println("Năng khiếu: " + nangKhieu);
    }
}
