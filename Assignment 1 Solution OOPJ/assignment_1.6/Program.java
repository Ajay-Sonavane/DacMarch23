

class Program {public static void main(String[] args) {
    boolean b = true;
    String strb = Boolean.toString(b);    //   primitive to String 
    System.out.println("Boolean to string = "+strb);
    System.out.println("------------");

    boolean b1 = false;
     Boolean b2 = new Boolean(b1); //primitive to wrapper object
     System.out.println(b2);
     System.out.println("------------");

     String strb2= "TRUE";
     boolean b3 = Boolean.parseBoolean( strb2);    //String to primitive
     System.out.println("Sting to boolean :"+ b3 );
     System.out.println("------------");
 
     Boolean b4 = new Boolean (strb2);      //String to object 
     System.out.println(b4);
}
}
