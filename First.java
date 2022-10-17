import java.util.*;
public class First {
    public static void averageNo(int a, int b , int c)
    {
      float  avg ;
      avg=(a+b+c)/3;
      System.out.println("Avergae of three numbers "+avg);
      return;
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        averageNo(a,b,c);
        return;
        
    }
    
}
