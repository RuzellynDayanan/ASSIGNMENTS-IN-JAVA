class Vehicle{
   String brand;
   Vehicle (String brand){
      this.brand = brand;
   }
      
      void start (){
         System.out.println("The vehicle " + brand + " is starting");
      }
}
class Car extends Vehicle {
   Car (String brand){
      super(brand);
   }
   
   @Override
   void start(){
      super.start();
      System.out.println("The car " + brand + " uses a key to start");
    }
}

class Motorcycle extends Vehicle{
   Motorcycle (String brand){
      super(brand);
   }
   
   @Override
   void start (){
      super.start();
      System.out.println("The motorcycle  " + brand + " uses button to start");
   }
} 


public class VehicleClass{
   public static void main(String [] args){
      Car c1 = new Car ("Vios");
      c1.start();
      
      System.out.println();
      
      Motorcycle m1 = new Motorcycle ("Kawasaki");
      m1.start();
   }
}