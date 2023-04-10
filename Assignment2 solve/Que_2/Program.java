
import java.util.*;
class BmiCalculator{
     private double height;
     private double weight;

     BmiCalculator(){
        this.height = 0;
        this.weight=0;
     }

     public void setHeight(double height){
        this.height= height;}

    public double getHeight(){
         return this.height;
        }

     public void setWeight(double weight){
     this.weight= weight;
        }
        public double getWeight(){
            return this.weight;
           }

      public double setWeight(){
            return this.weight;
        }

        double calculateBmi(){
            double Bmi = ((this.weight)/(this.height * this.height));
            return Bmi;
        }

        }
class Program{
    public static void main(String[] args) {
        BmiCalculator bmi = new BmiCalculator();

       
        Scanner sc = new Scanner(System.in);

        System.out.print("Height in meter: ");
        bmi.setHeight(sc.nextDouble());

        System.out.print("Weight in kg: ");
        bmi.setWeight(sc.nextDouble());

        System.out.println("Height is "+bmi.getHeight()+" "+ "Weight is  "+bmi.getWeight()+"");

      double Bmi = bmi.calculateBmi();

       System.out.println( "The Bmi of the person is  "+Bmi);
    



        }
}