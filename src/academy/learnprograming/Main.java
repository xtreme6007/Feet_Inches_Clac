package academy.learnprograming;

public class Main {

    public static void main(String[] args) {

    }

    public static double clacFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double CentFt = feet * 30.48;
            double CentIn = inches * 2.54;
            return (double) (CentFt + CentIn);
        }
        return -1;
    }
        public static double clacFeetAndInchesToCentimeters(int inches){
            if(inches >= 0){

                int feet = inches / 12;
                int remainder = inches % 12;
                System.out.println(clacFeetAndInchesToCentimeters(feet, remainder));

            }
            return -1;



    }
}
