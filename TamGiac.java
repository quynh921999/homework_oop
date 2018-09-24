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
public class TamGiac {
    private double canh1, canh2, canh3;
	public Scanner input;
	TamGiac(){input = new Scanner(System.in);}
	TamGiac(double canh1, double canh2, double canh3) {
		this.setCanh1(canh1);
		this.setCanh2(canh2);
		this.setCanh3(canh3);
	}

	public double getCanh1() { 
		return canh1;
	}

	public void setCanh1(double canh1) {
		this.canh1 = canh1;
	}

	public double getCanh2() {
		return canh2;
	}

	public void setCanh2(double canh2) {
		this.canh2 = canh2;
	}

	public double getCanh3() {
		return canh3;
	}

	public void setCanh3(double canh3) {
		this.canh3 = canh3;
	}
	public void nhapDoDai() {
		this.setCanh1(input.nextDouble());
		this.setCanh2(input.nextDouble());
		this.setCanh3(input.nextDouble());
	}
	public void loaiTamGiac() {
		double c1 = this.getCanh1() * this.getCanh1(); // tinh binh phuong cac canh
		double c2 = this.getCanh2() * this.getCanh2();
		double c3 = this.getCanh3() * this.getCanh3();
		if (this.getCanh1() == this.getCanh2() && this.getCanh2() == this.getCanh3()) { // c1 == c2 == c3
			System.out.println("tam giac deu");
		} 
		else if (this.getCanh1() == this.getCanh2() || this.getCanh2() == this.getCanh3() 
				|| this.getCanh1() == this.getCanh3()) { // c1 == c2 || c2 == c3 || c3 == c1 
			System.out.println("tam giac can");
		} else if(c1 + c2 == c3 || c1 + c3 == c2 || c2 + c3 == c1)  { // tong binh phuong cac canh
			System.out.println("tam giac vuong");
		} else {
			System.out.println("tam giac thuong");
		}
	}
	public void inDoDai() {
		System.out.println(this.getCanh1() + " " + this.getCanh2() + " " + this.getCanh3());
	}
	public double tinhChuVi() {
		return this.getCanh1() + this.getCanh2() + this.getCanh3();
	}
	public void dienTich() {
		double nuaChuVi = this.tinhChuVi() / 2;
		double a = nuaChuVi * (nuaChuVi - this.getCanh1()) * (nuaChuVi - this.getCanh2()) * (nuaChuVi - this.getCanh3());
		System.out.println(Math.sqrt(a));
	}
}
