class Program {
    public static void main(String[] args) {
        byte b =  123;
        String str = Byte.toString(b); //primitive to string 
        System.out.println(str);

        Byte b1 = new Byte(b);    //primitive to object
       System.out.println( b1);

       String str1 = new String("45"); // string to object
       Byte b2 = new Byte(str1);
      

       
       System.out.println(b2);
       
          

    }
}