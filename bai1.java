/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main main = new Main();
        /*System.out.print("Nhap so thu nhat: ");
        int num1 = input.nextInt();
        System.out.println();
        System.out.print("Nhap so thu hai: ");
        int num2 = input.nextInt();
        System.out.println();
        
        int greatestDivisor = main.UCLN(num1, num2);
        System.out.println("Uoc chung lon nhat cua " + num1 + " va " + num2 +" la: " + greatestDivisor);
        */
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        System.out.println(main.Fibonaci(n));
    }
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
    public int Fibonaci(int n){
        int f1 = 0;
        int f2 = 1;
        if(n == 0)
            return f1;
        else if(n == 1)
            return f2;
        else
            return Fibonaci(n-1)+Fibonaci(n-2);
    }
    
}
