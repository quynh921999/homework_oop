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
public class Rectangle {
    private double length; // chieu dai hinh chu nhat
    private double width; // chieu rong hinh chu nhat

        Rectangle(double length, double width) {
            this.setLength(length);
            this.setWidth(width);
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area() {
		// tinh dien tich hinh chu nhat
		return this.length * this.width;
	}
	public double perimeter() {
		// tinh chu vi hinh chu nhat
		return this.length * 2 + this.width * 2;
	}
	public void print() {
		// in thong so hinh chu nhat
		System.out.println("length : " + this.length + " " + "width : " + this.width);
	}
	public boolean sameArea(Rectangle R2) {
		// kiem tra 2 hinh chu nhat co cung dien tich hay khong
		if(this.area() == R2.area()) {
			return true;
		} else {
			return false;
		}
	}
}
