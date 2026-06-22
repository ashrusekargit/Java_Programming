import java.util.Scanner;
public class Details {
    public static void main(String[] args) {
        Scanner info= new Scanner(System.in);
        String name = info.nextLine();
        int age = info.nextInt();
        double percentage = info.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage +"%");
}
}