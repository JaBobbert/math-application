public class MathApp {
    public static void main(String[] args) {
        //Question 1
        int bobSalary = 83_000;
        int garySalary = 79_000;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is $" + highestSalary);

        //Question 2
        double carPrice = 32_999.99;
        double truckPrice = 40_999.99;

        System.out.println("The cheaper option is $" + Math.min(carPrice, truckPrice));

        //Question 3
        double radius = 7.25;
        System.out.println("The area of a circle with the radius 7.25 is " + (Math.PI *(radius * radius)));

        //Question 4
        System.out.println("Square root of 5 is " + Math.sqrt(5.0));

        //Question 5
        System.out.println("The distance between (5,10) and (85, 50) is (" + Math.subtractExact(85, 5) + "," + Math.subtractExact(50,10) + ")");

        //Question 6
        System.out.println("The absolute value of -3.8 is " + Math.abs(-3.8));

        //Question 7
        System.out.println("Random number between 0 and 1: " +  Math.random());

    }
}
