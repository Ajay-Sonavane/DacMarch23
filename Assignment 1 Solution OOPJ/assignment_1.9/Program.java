class Program {
    public static void main(String[] args) {
        byte b = 125;
        Byte bs = new Byte (b);//byte instance
        
        byte num1 = bs.byteValue();           //Instance method so called object reference
        System.out.println("num1 "+num1);

        short num2 = bs.shortValue();
        System.out.println("num2 "+num2);

        int num3 = bs.intValue();
        System.out.println("num3 "+num3);

        long num4 = bs.longValue();
       System.out.println("num4 "+num4);
 
         float num5 = bs.floatValue();
         System.out.println("num5 "+num5);

         double num6 = bs.doubleValue();
         System.out.println("num6: "+num6);
     
           
          

    }
    
}
