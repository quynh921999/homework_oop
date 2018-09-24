/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private String ten;
    private String phongBan;
    private float heSoLuong;
    private int soNgayCong;

    
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhongBan() {
        return phongBan;
    }
    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }
    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
    
    public float tinhLuong(){
        return this.getHeSoLuong()*730 + this.getSoNgayCong()*30;
    }
    
    public float tienThuong(){
        float bonus = 0;
        if(this.getSoNgayCong() > 25 && this.getPhongBan().equalsIgnoreCase("vip"))
            bonus += this.tinhLuong()*0.2;
        else if(this.getSoNgayCong() > 25)
            bonus += this.tinhLuong()*0.1;
        return bonus;
    }
    
    public float tongLuong(){
        return this.tienThuong() + this.tinhLuong();
    }
}
