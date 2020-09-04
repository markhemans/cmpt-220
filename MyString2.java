import java.util.ArrayList;


public class MyString2 {
    
    char[] chars;
    
    public MyString2(String s)
    {
        s = "Hello";
    }
    
     public int compare(String s)
     {
         String a1 = new String("Hello");
         return a1.length();
     }
     
     public MyString2 substring(int begin)
     {
        String MyString2 = "hello".substring(begin);
        return MyString2.this;
     }
    
     public MyString2 toUpperCase()
    {
       String a = "hello".toUpperCase();
       return new MyString2(a);
    }
   
    public char[] toChars()
    {
        return chars;
    }
    
    public static MyString2 valueOf(boolean b)
    {
        return new MyString2((b)?"true":"false");
    }
    
   public static void main(String[] args) {

        
       MyString2 string1 = new MyString2("Hello");
       System.out.println(string1);
       String string2 = "hello".toUpperCase();
       System.out.println(string1.toChars());
       System.out.println(string1.compare("hello"));
      

    }
}
