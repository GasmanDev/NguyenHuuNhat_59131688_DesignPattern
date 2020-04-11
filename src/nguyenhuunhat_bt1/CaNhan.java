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
public abstract class CaNhan {
    String hoTen;
    int tuoi; 
    String diaChi;
    String sdt;
    
    //Getter, setter
    public String getHoTen()
    {
        return this.hoTen;
    }
    public void setHoTen(String hoTen)
    {
        this.hoTen = hoTen;
    }
    public int getTuoi()
    {
        return this.tuoi;
    }
    public void setTuoi(int tuoi)
    {
        this.tuoi = tuoi;
    }
    public String getDiaChi()
    {
        return this.diaChi;
    }
    public void setDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }
    public String getSdt()
    {
        return this.sdt;
    }
    public void setSdt(String sdt)
    {
        this.sdt = sdt;
    }
    //Phuong thuc khoi tao
    public CaNhan(){
    }
    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt)
    {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    //Phuong thuc truu tuong
    public abstract void hienThiTT();
    //
    
}
