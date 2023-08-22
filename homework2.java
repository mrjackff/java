import java.util.*;
class homework2{
    double radius;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        radius=sc.nextDouble();
    }
    void print(){
        System.out.println("Radius is "+radius);
    }
    void circumfrence(){
        System.out.println(2*3.141*radius);
    }
    void circumference(double r){
        System.out.println(2*3.141*r);
    }
    public static void main(String[]args){
    
      homework2 hm=new homework2();
      hm.input();
      hm.print();
      hm.circumfrence();
      hm.circumference(9.6);
}}