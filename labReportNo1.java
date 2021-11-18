package labreport1;
import java.util.Scanner;

public class labReportNo1 {

    //Function to determine the triangle type
    static void triangleType(int x, int y, int z)
    {
        if (x==y && y==z){
            System.out.println("Equilateral Triangle");
        }
        
        else if (x==y || y==z || z==x ){
            System.out.println("Isosceles triangle");
        }
        else 
            System.out.println("Scalene triangle");
    }
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter length of each side of triangle: ");
         int x = input.nextInt();
         int y = input.nextInt();
         int z = input.nextInt();
         
         if ( (x+y > z) && (x+z>y) && (z+y>x)  ) 
        {
            triangleType(x,y,z);
        }
         else 
             System.out.println("Triangle is invalid");
    }
    

}
