/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenhuunhat_bt1;
import java.util.ArrayList;
/**
 *
 * @author MSI
 */
public class QLDS implements IQLDS {
    
    ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

    
    @Override
    public int them(CaNhan p)
    {
        if (dsCaNhan.add(p))
        {
            return 1;
        }
        return 0;
    }
    @Override
    public int xoa(String ten)
    {
        if (dsCaNhan.removeIf(p -> p.hoTen.equals(ten)))
        {
            return 1;
        }
        return 0;
    }
    @Override
    public void inDS()
    {
        dsCaNhan.forEach(p -> p.hienThiTT());
    }
}

