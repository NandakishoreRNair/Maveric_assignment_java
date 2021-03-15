
import java.util.*;
import java.lang.Math; 
interface fun{
    public double getArea();
    public double getPerimeter();
}
class Triangle implements fun{
  int a,b,c;
  public Triangle(int q,int w,int e){
      a=q;
      b=w;
      c=e;
  }
  public double getArea(){
    double s = (a+b+c)/2.0;
    return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
  }
  public double getPerimeter(){
    return (a+b+c);
  }
}


class Rectangle implements fun{
  int l,b;
  public Rectangle(int a,int c){
      l=a;
      b=c;
  }
  public double getArea(){
    
    return l*b;
  }
  public double getPerimeter(){
    return 2*(l+b);
  }
}


class circle implements fun{
  int r;
  public circle(int a){
     r=a;
  }
  public double getArea(){
    
    return r*r*3.14;
  }
  public double getPerimeter(){
    return 2*3.14*r;
  }
}

public class Main
{
	public static void main(String[] args) {
	    int select=0;
	    Scanner sc= new Scanner(System.in);
	    System.out.println(" 1.Triangle \n 2.Rectangle \n 3.Circle");
	    select=sc.nextInt();
	    if(select==1){
		int a,b,c;
		 System.out.println("Enter the length of three sides of the triangle");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		 Triangle t = new Triangle(a,b,c);
    System.out.println("Area an perimeter of Triangle are");
    System.out.println(t.getArea());
    System.out.println(t.getPerimeter());}
    else if(select==2){
        int l,b;
         System.out.println("Enter the length and breadth of rectangle");
        l=sc.nextInt();
        b=sc.nextInt();
    	 Rectangle R = new Rectangle(l,b);
    System.out.println("Area an perimeter of Rectangle are");
    System.out.println(R.getArea());
    System.out.println(R.getPerimeter());
        
    }
     else if(select==3){
        int r;
         System.out.println("Enter the radius of the circle");
        r=sc.nextInt();
       
    	 circle c = new circle(r);
    System.out.println("Area an perimeter of circle are");
    System.out.println(c.getArea());
    System.out.println(c.getPerimeter());
        
    }
    
	}
}


