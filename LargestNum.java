//Shivaguru P
//24BCM0085
//09/02/2025
public class LargestNum{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        int num4;
        if (num1 >= num2) {
            if (num1 >= num3) {
                num4 = num1;
            } else {
                num4 = num3;
            }
        } else {
            if (num2 >= num3) {
                num4 = num2;
            } else {
                num4 = num3;
            }
        }
        System.out.println("The largest number is: " + num4);
    }
}
