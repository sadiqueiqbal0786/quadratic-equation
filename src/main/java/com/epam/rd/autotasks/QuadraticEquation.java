package com.epam.rd.autotasks;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a=scanner.nextDouble();
        if(a==0)
            return;
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double desc= b*b-4*a*c;
        double x,x1,x2;
        if(desc<0)
            System.out.print("no roots");
        else if (desc==0) {
            x= (-b+Math.sqrt(desc))/(2*a);
            BigDecimal root=new BigDecimal(x);
            root=root.stripTrailingZeros();
            System.out.print(root);

        }
        else{
            x1= (-b+Math.sqrt(desc))/(2*a);
            x2= (-b-Math.sqrt(desc))/(2*a);
            BigDecimal root1=new BigDecimal(x1);
            root1=root1.stripTrailingZeros();
            BigDecimal root2=new BigDecimal(x2);
            root2=root2.stripTrailingZeros();
            System.out.print(root2+" "+root1);
        }




    }

}