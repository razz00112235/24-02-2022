import java.util.*;

public class AMnum{

    public static void main(String[] args) {
        int count=0;
        String check1="",check2="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int num=sc.nextInt();
        int sqr=num*num;
        for(int i=0;num!=0;i++)
        {
            if(num%10!=sqr%10)
            {
                count++;
                System.out.println("Not AM Number");
                break;
            }
            num=num/10;
            sqr=sqr/10;
        }
        if(count==0)
        {
            System.out.println("AM Number");
        }
    }
}