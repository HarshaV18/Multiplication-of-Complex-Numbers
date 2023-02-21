import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Complex{
    
    int real; int im;
    
    public  Complex(){
        
    }
    public Complex(int real,int im){
        this.real=real;
        this.im=im;
    }
    public void mul(Complex a,Complex b){
        int real =a.real*b.real-a.im*b.im;
        int im =a.real*b.im+a.im*b.real;
        this.real =real;
        this.im =im;
        
    }
    public void show(){
        if(im>=0){
            System.out.println(real+"+"+im+"i");
        } 
        else{
            System.out.println(real+"-"+(-im)+"i");
        }
    }


    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int real1=obj.nextInt(); int im1=obj.nextInt();
        int real2=obj.nextInt(); int im2=obj.nextInt();
        Complex a=new Complex(real1,im1);
        Complex b=new Complex(real2,im2);
        Complex ans=new Complex();
        ans.mul(a,b);
        ans.show();
      
        
    }
}
