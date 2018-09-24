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
public class PrimeNumber {
    private int num;
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    PrimeNumber(){};
    public boolean isPrimeNumber(int x){
        if(x < 2)
            return false;
        else {
            for(int i = 2; i <= Math.sqrt(x); i++){
                if(x % i == 0)
                    return false;
            }
            return true;
        }
    }
    //nếu x là số nguyên tố thì lưu vào num
    public void PrimeNumber(int x){
        if(isPrimeNumber(x))
            this.setNum(x);
        else
               System.out.println(x + " khong la so nguyen to.");
    }
    //tìm số nguyên tố liền sau x
    public void findPrimeNumber(int x){
        if(isPrimeNumber(x)){
            int temp = x;
            while(!isPrimeNumber(temp))
                temp ++;
            System.out.println("So nguyen to lien sau "+x+" la: " + temp);
        } else {
            System.out.println("x khong la so nguyen to");
        }
    }
}
