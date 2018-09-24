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
public class BangDiem {
    private String ten, ma;
    private float toan;
    private float van;
    private float anh;
    public BangDiem[] BD;
    BangDiem(int length) {
	BD = new BangDiem[length];
	for (int i = 0; i < length; i++) {
            BD[i] = new BangDiem();
	}
    }
    BangDiem(){}
    BangDiem(String ten, String ma, float toan, float van, float anh) {
	this.setTen(ten);
	this.setMa(ma);
	this.setToan(toan);
	this.setVan(van);
	this.setAnh(anh);
    }
    public String getTen() { // ham xuat ten
	return ten;
    }
    public void setTen(String ten) { // ham nhap ten
	this.ten = ten;
    }
    public String getMa() { // ham lay ma hoc sinh
	return ma;
    }
    public void setMa(String ma) { // ham nhap ma hoc sinh
	this.ma = ma;
    }
    public float getToan() { // lay diem toan
	return toan;
    }
    public void setToan(float toan) { // nhap diem toan
	this.toan = toan;
    }
    public float getVan() { // lay diem van
	return van;
    }
    public void setVan(float van) { // nhap diem van
   	this.van = van;
    }
    public float getAnh() { // lay diem anh
	return anh;
    }
    public void setAnh(float anh) { // nhap diem anh
	this.anh = anh;
    }
    public float tongDiem() { // tinh tong diem
	return this.getToan() + this.getVan() + this.getAnh();
    }
    public void inHS() { // in thong tin hoc sinh
	System.out.println(this.getTen() + "\t" + this.getMa() + "\t" + "\t" + this.getToan() + "\t" 
							+ this.getVan() + "\t" + this.getAnh());
	}
    public boolean checkPass() { // kiem tra hoc sinh co qua ki thi khong
	if ((this.getToan() + this.getVan() + this.getAnh()) / 3 >= 5) {
		return true;
        } else {
		return false;
	}
    }
    public String xepLoai() {
	if (this.tongDiem() / 3 >= 8.0) {
            return "Gioi";
	}
	else if (this.tongDiem() / 3 >= 6.5) {
            return "kha";
	}
	else if (this.tongDiem() / 3 >= 5) {
            return "Trung binh";
	}
	else if (this.tongDiem() / 3 >= 3.5) {
            return "yeu";
	} else {
            return "kem";
	}
    }
}
