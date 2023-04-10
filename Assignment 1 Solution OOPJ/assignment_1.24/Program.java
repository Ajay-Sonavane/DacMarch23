class Program {
    public static void main(String[] args) {
            String str = Float.toString(123.3f); //float to string

            Float f = Float.valueOf(123.3f); //float to float inastance
            System.out.println("float to float instance  "+f);

            String str1 = String.valueOf("234");

            
            Float fin = Float.valueOf(str1); //string instace to float inastance
            System.out.println("string to float instance  "+fin);

            String str2 = Float.toHexString(123.3f);
            System.out.println("Float to hexString "+str2);

             


    }
}