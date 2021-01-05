package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static double clacFeetAndInchesToCentimeters(int feet, int inches){
        if(feet >= 0 && inches >= 0){
            double CentFt = feet * 30.48;
            double CentIn = inches * 2.54;
            return (double)(CentFt + CentIn);
        }



    }
}
