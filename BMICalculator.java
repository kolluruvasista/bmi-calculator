import java.util.*;
public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();

        try {
            double bmi = calculateBMI(weight, height);
            System.out.printf("Your BMI is: %.2f%n", bmi);

            String cat = categorizeBMI(bmi);
            System.out.println("You are classified as: " + cat);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    
}

    public static double calculateBMI(double weightKg, double heightM) {
        if (heightM <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero.");
        }
        return weightKg / (heightM * heightM);
    }

    public static String categorizeBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
