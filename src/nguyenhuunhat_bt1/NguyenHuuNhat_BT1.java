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
public class NguyenHuuNhat_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
//        QLDS ds = new QLDS();
        LopHoc LH = new LopHoc();
        HocSinh hs1 = new HocSinh("Nguyễn Hữu Nhật", 21, "Nguyễn Đình Chiểu", "0912181370", "59-CNTT1", "Game");
        GiaoVien gv1 = new GiaoVien("Giáo Viên", 30, "Phạm Văn Đồng", "0123456789", "DesignPattern", "Toán-Tin");
        LH.themHocSinh(hs1);
        LH.themGVGD(gv1);
        LH.inDSHS();
        LH.inDSGVDG();
//test.hienThiTT();
//        if (ds.them(test) == 1)
//        {
//            System.out.println("Them thanh cong");
//            ds.inDS();
//        }
//        if (ds.xoa("Nguyễn Hữu Nhật") == 1)
//        {
//           System.out.println("Xoa thanh cong");
//           ds.inDS();
//        }   
    }
    
}
