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
public class Student {
    private String ten;
    private String mssv;
    private float diemTB;
    private String lop;
    
    Student(Student s){
        this.ten = s.ten;
        this.mssv = s.mssv;
        this.lop = s.lop;
        this.diemTB = s.diemTB;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMssv() {
        return mssv;
    }
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public float getDiemTB() {
        return diemTB;
    }
    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public void inputInfo(){
        System.out.println("Nhap thong tin sinh vien:");
        System.out.print("Ten: ");
        Scanner input = new Scanner(System.in);
        this.setTen(input.nextLine());
        System.out.println();
        System.out.print("Ma so sinh vien: ");
        this.setMssv(input.nextLine());
        System.out.println();
        System.out.print("Lop: ");
        this.setLop(input.nextLine());
        System.out.println();
        System.out.print("Diem trung binh: ");
        this.setDiemTB(input.nextFloat());
        System.out.println();
    }
    public void showInfo(){
        System.out.println("Ten sinh vien: " + this.getTen());
        System.out.println("Ma so sinh vien: " + this.getMssv());
        System.out.println("Lop hoc: " + this.getLop());
        System.out.println("Diem trung binh: " + this.getDiemTB());
    }
    public boolean checkHocBong(){
        return (this.getDiemTB() > 3.2);
    }
}
