import java.util.Scanner;
public class Gmailvalid {
   public static void main(String[] args) {
      
      String phone = "def2modata_001@gmail.com";
      String regex = "^[a-zA-Z]{1}+[a-zA-Z0-9_]+@+[a-z]+\\.+com$",str="hello",str2="hellho";
      
      char a='b';
      int b=a;
      System.out.println(a);
      System.out.println(b);
      boolean result = phone.matches(regex);
      if(str.matches(str2))
      {
         System.out.println("true");
      }
      else
      {
         System.out.println(false);
      }
      System.out.println(result);
   
      int i=0;
      while(i<str.length())
      {
         System.out.print(str.codePointAt(i));
         i++;

      }
     System.out.println("\n");
      String name="ram";
      String name2="ram";
      System.out.println("hggg"+name.compareTo(name));
      System.out.println(name.equals(name2));
      System.out.println(name.concat(name2).concat(str2));
      
      char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
      String myStr2 = "";
      myStr2 = myStr2.copyValueOf(myStr1);
      System.out.println("Returned String: " + myStr2);  
      
   }
}