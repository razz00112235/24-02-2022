import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class Removetag{

    public static void main(String[] args) {
       
        
        String data="<div><h2>hello</h2></div>";
        System.out.println("Before remove tag"+data);
        data=data.replaceAll("<div>|</div>","");
        System.out.println("After remove tag"+data);

        

    }
}