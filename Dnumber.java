import java.util.*;

class Dnumber{
static Scanner sc=new Scanner(System.in);
  static public boolean duck(){
           boolean flag=false;
           System.out.println("Enter a num");
           int num=sc.nextInt();
           int temp=0;
        //    int num=01204  /* it's read octal number  */;
           for(int i=0;num!=0;i++)
           {    
              temp=num%10;             
              if(temp==0)
              {
                flag=true;
                break;
              }
              num=num/10;
           }
           
           return flag;
    
  }
    public static void main(String[] args) {
        boolean a=duck();
        if(a==true)
        {
            System.out.println("Duck number");
        }
        else
        {
            System.out.println("Not Duck Number");
        }
        
    }
}