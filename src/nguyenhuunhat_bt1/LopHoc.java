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
public class LopHoc {
    QLDS dsHS = new QLDS();
    QLDS dsGVGD = new QLDS();
    public int themHocSinh (HocSinh hs)
    {
        dsHS.them(hs);
        return 1;
    }
    public int themGVGD(GiaoVien gv)
    {
        dsGVGD.them(gv);
        return 1;
    }
    public int inDSHS()
    {
        dsHS.inDS();
        return 1;
    }
    public int inDSGVDG()
    {
        dsGVGD.inDS();
        return 1;
    }
}
