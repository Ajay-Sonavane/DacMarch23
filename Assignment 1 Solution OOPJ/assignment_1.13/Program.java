class Program {
public static void main(String[] args) {
    short s = 2324;
    String str = Short.toString(s);
    System.out.println("Str is  : "+str);

    Short sh = Short.valueOf(s);//short value into short instance
    System.out.println("Sh : "+sh);

    String str1 = "123";
    String str2 = String.valueOf(str1);//String instance
     
    Short  sh1 = new Short (str2);//String instance into short instance

    System.out.println("sh1 : "+sh1 );




}    
}
