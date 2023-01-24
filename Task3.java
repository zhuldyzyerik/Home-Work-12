package class12HW;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

    /*3) Write a program that reads two people's first
    names and if they expecting boy or girl?
    Based on the input suggests a name for a baby:
    Example Output:
    Mom’s first name? Mary
    Dad’s first name? Daniel
    Boy or Girl? boy
    Suggested baby name: DANRY

    Example Output:
    Mom’s first name? Mary
    Dad’s first name? Daniel
    Boy or Girl? girl
    Suggested baby name: MAIEL

 */
        Scanner scanner= new Scanner(System.in);
        System.out.print("Mom's first name?");
String mom=scanner.nextLine();
        System.out.print("Dad’s first name? ");
        String dad=scanner.nextLine();
        System.out.print("Boy or Girl??");
        String gender=scanner.nextLine();
        String suggestedName;

        if (gender.equalsIgnoreCase("Boy")) {
            suggestedName = dad.substring(0, 3) + mom.substring(2);
            System.out.println(suggestedName.toUpperCase());
        } else if (gender.equalsIgnoreCase("Girl")) {
            suggestedName = mom.substring(0, 2) + dad.substring(3);
            System.out.println(suggestedName.toUpperCase());
        }
    }
}
