import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class Perfectsqr{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<num;i++)
        {
            if(i*i==num)
            {
                count++;
            }
        }
        
       if(count==1)
       {
        System.out.println("Perfect Square");
       }
       else
       {
        System.out.println("Not Perfect Square");
       }

    }
}