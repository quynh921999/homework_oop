/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class PS {

    private int tuSo;
    private int mauSo;
    PS(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    private PS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setTuSo(int tuSo){
        this.tuSo = tuSo;
    }
    public int getTuSo(){
        return this.tuSo;
    }
    public void setMauSo(int mauSo){
        this.mauSo = mauSo;
    }
    public int getMauSo(){
        return this.mauSo;
    }
    // tìm ước chung lớn nhất của tử số và mẫu số
    public int UCLN(int a, int b){
        if(a < 0) a=-a;
        if(b < 0) b=-b;
        while(a!=b){
            if(a > b)
                a = a-b;
            else 
                b = b-a;
        }
        return a;
    }
    // rút gọn phân số
    public PS compactPS(){
        int ts = this.tuSo / UCLN(this.getTuSo(),this.getMauSo());
        int ms = this.mauSo/UCLN(this.getMauSo(),this.getTuSo());
        PS result = new PS(ts,ms);
        return result; 
    }
    // cộng 2 phân số
    public PS addPS(PS ps) {
        int ts = this.tuSo * ps.getMauSo() + this.mauSo * ps.getTuSo();
        int ms = this.mauSo * ps.getMauSo();
        PS result = new PS(ts,ms);
        
        if(result.getTuSo() != 0)
            result = result.compactPS();
        return result;
    }
    // trừ 2 phân số
    public PS substractPS(PS ps){
        int ts = this.tuSo * ps.getMauSo() - this.mauSo * ps.getTuSo();
        int ms = this.mauSo * ps.getMauSo();
        PS result = new PS(ts,ms);
        
        if(result.getTuSo() != 0)
            result = result.compactPS();
        return result;
    }
    // nhân 2 phân số
    public PS multiplyPS(PS ps){
        int ts = this.tuSo * ps.getTuSo();
        int ms = this.mauSo * ps.getMauSo();
        PS result = new PS(ts,ms);
        
        if(result.getTuSo() != 0)
            result = result.compactPS();
        return result;
    }
    //chia 2 phân số
    public PS dividingPS(PS ps){
        int ts = this.tuSo * ps.getMauSo();
        int ms = this.mauSo * ps.getTuSo();
        PS result = new PS(ts,ms);
        
        if(result.getTuSo() != 0)
            result = result.compactPS();
        return result;
    }
    
    //in phân số
    public void printPS(){
        if(this.tuSo==0 || this.mauSo == 1)
            System.out.println(this.getTuSo());
        else 
            System.out.println(this.getTuSo()+"/"+this.getMauSo());
    }
    // so sánh ps1 với ps2. trả về true nếu ps1 lớn hơn ps2
    public boolean equals(PS ps){
        this.tuSo = this.getTuSo()*ps.getMauSo();
        ps.setTuSo(ps.getTuSo()*this.getMauSo());
        return (this.tuSo > ps.getTuSo());  
    }
}
