/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ThiSinhDuThi {
    private String ten;
    private String sbd;
    private float diemUuTien;
    private String diaChi;
    
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public String getSbd() {
        return sbd;
    }
    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public float getDiemUuTien() {
        return diemUuTien;
    }
    public void setDiemUuTien(float diemUuTien) {
        this.diemUuTien = diemUuTien;
    }

    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void print(){
        System.out.println("Ten thi sinh: " + this.getTen());
        System.out.println("So bao danh: "+ this.getSbd());
        System.out.println("Dia chi: " + this.getDiaChi());
        System.out.println("Diem uu tien: " + this.getDiemUuTien());
    }
    public void nhap(){
        System.out.println("Nhap thong tin thi sinh :");
        Scanner input = new Scanner(System.in);
        System.out.print("Ten: ");
        this.setTen(input.nextLine());
        System.out.println();
        System.out.print("Sbd: ");
        this.setSbd(input.nextLine());
        System.out.println();
        System.out.print("Dia chi: ");
        this.setDiaChi(input.nextLine());
        System.out.println();
        System.out.print("Diem uu tien: ");
        this.setDiemUuTien(input.nextFloat());
        System.out.println();
    }
}
