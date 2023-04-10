import java.util.function.DoubleToLongFunction;

class Program {
    public static void main(String[] args) {
        
    
                  double d = 343.34;
                  String str = Double.toString(d);
                  System.out.println("Doule to string  "+str);

                  Double di = Double.valueOf(d);
                  System.out.println("double value to instance "+di);

                  String strin = String.valueOf(str);
                  Double din = Double.valueOf(strin);
                  System.out.println("String instance into double instace "+din);

              
                  String hex = Double.toHexString(d);
                  System.out.println(hex);

                  

            


                  




                  
                  
}             
}
