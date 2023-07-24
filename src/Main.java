import java.util.Scanner;
public class Main {
   static boolean shouldWakeUp(boolean bark, int time) {
       if(!bark) {
           return false;
       } else{
           return 20 < time || (0 < time && time < 8);
       }
   }

  static boolean hasTeen(int age1,int age2,int age3) {
      return (13 < age1 && age1 <= 19) || (13 < age2 && age2 <= 19) || (13 < age3 && age3 <= 19);
  }

    static boolean isCatPlaying (boolean summer,int degree) {
      if(!summer && (25<=degree && degree<=35)) {
          return true;
      } else return summer && (25 <= degree && degree <= 45);
    }


    static double area(double side1, double side2) {
        if (side1<0 || side2<0) {
            return -1;
        } else {

            return side1*side2;
        }
    }

    static double area(double radius) {
        if (radius<0) {
            System.out.println("Alan değeri 0'dan büyük olmalıdır");

            return -1;
        } else {

            return radius*radius*Math.PI;
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Test shouldWakeUp
        System.out.println("shouldWakeUp (true, 1) => " + shouldWakeUp(true, 1));
        System.out.println("shouldWakeUp (false, 2) => " + shouldWakeUp(false,1));
        System.out.println("shouldWakeUp (true, 8) => " + shouldWakeUp(true, 8));
        System.out.println("shouldWakeUp (true, -1) => " + shouldWakeUp(true, -1));

        // Test hasTeen
        System.out.println("hasTeen(9, 99, 19) => " + hasTeen(9, 99, 19));
        System.out.println("hasTeen(23, 15, 42) => " + hasTeen(23, 15, 42));
        System.out.println("hasTeen(22, 23, 34) => " + hasTeen(22, 23, 34));

        // Test isCatPlaying
        System.out.println("isCatPlaying(true, 10) => " + isCatPlaying(true, 10));
        System.out.println("isCatPlaying(false, 36) => " + isCatPlaying(false, 36));
        System.out.println("isCatPlaying(false, 35) => " + isCatPlaying(false, 35));

        Scanner scanner = new Scanner(System.in);
        /*
       TO MAKE INPUT ACTIVE, MAKE ISVALID TRUE:
        */
        boolean isValid = false;
        while(isValid) {
            try {
                System.out.println("Enter width of rectangle: ");
                double x = scanner.nextDouble();

                System.out.println("Enter height of rectangle: ");
                double y = scanner.nextDouble();


                double result = area(x,y);

                        // Test area
                System.out.println("area(x, y) => " + result);
            } catch (Exception ex) {
                isValid=false;
                System.out.println("Invalid Input");

            }
        }


        System.out.println("area(-1.0, 4.0) => " + area(-1.0, 4.0));

        // Test area for circle
        System.out.println("area(5.0) => " + area(5.0));
        System.out.println("area(-1) => " + area(-1));
    }
}