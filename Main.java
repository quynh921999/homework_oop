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
public class Main {
    public static void main(String[] args){
        System.out.print("Nhap tu so va mau so phan so 1: ");
        int ts1,ms1;
        Scanner input = new Scanner(System.in);
        ts1 = input.nextInt();
        ms1 = input.nextInt();
        PS ps1 = new PS(ts1,ms1);
        System.out.print("Nhap tu so va mau so phan so 2: ");
        int ts2,ms2;
        ts2 = input.nextInt();
        ms2 = input.nextInt();
        PS ps2 = new PS(ts2,ms2);
        
        /*PS add = ps1.addPS(ps2);
        add.printPS();
        PS sub = ps1.substractPS(ps2);
        sub.printPS();
        PS mul = ps1.multiplyPS(ps2);
        mul.printPS();
        PS div = ps1.dividingPS(ps2);
        div.printPS();
        */
        System.out.println(ps1.equals(ps2));
    }
}
