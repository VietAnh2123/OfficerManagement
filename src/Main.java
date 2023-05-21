
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author AD
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerOfficer mo = new ManagerOfficer();
        while (true) {
            System.out.println("*---*   Application Manager Offcier   *--*");
            System.out.println(" ");
            System.out.println("Enter your choice: ");
            System.out.println("    1: Insert Officer");
            System.out.println("    2: Search officer by name");
            System.out.println("    3: Show infomation officers");
            System.out.println("    4: Exit");
            System.out.print("User choice: ");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("    Option A: Insert Engineer");
                    System.out.println("    Option B: Insert Worker");
                    System.out.println("    Option C: Insert Staff");
                    System.out.print("  User option: ");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter name: ");
                            String name = sc.nextLine();
                            System.out.print("Enter age: ");
                            int age = sc.nextInt();
                            System.out.print("Enter gender: ");
                            sc.nextLine();
                            String gender = sc.nextLine();
                            System.out.print("Enter address: ");
                            String address = sc.nextLine();
                            System.out.print("Enter branch: ");
                            String branch = sc.nextLine();
                            Officer engineer = new Engineer(name, age, gender, address, branch);
                            mo.addOfficer(engineer);
                            System.out.println(engineer.toString());
                            System.out.println(" ");
                            break;
                        }

                        case "b": {
                            System.out.print("Enter name: ");
                            String name = sc.nextLine();
                            System.out.print("Enter age: ");
                            int age = sc.nextInt();
                            System.out.print("Enter gender: ");
                            sc.nextLine();
                            String gender = sc.nextLine();
                            System.out.print("Enter address: ");
                            String address = sc.nextLine();
                            System.out.print("Enter level: ");
                            int level = sc.nextInt();
                            Officer worker = new Worker(name, age, gender, address, level);
                            mo.addOfficer(worker);
                            System.out.println(worker.toString());
                            System.out.println(" ");
                            break;
                        }

                        case "c": {
                            System.out.print("Enter name: ");
                            String name = sc.nextLine();
                            System.out.print("Enter age: ");
                            int age = sc.nextInt();
                            System.out.print("Enter gender: ");
                            sc.nextLine();
                            String gender = sc.nextLine();
                            System.out.print("Enter address: ");
                            String address = sc.nextLine();
                            System.out.print("Enter task: ");
                            String task = sc.nextLine();
                            Officer staff = new Staff(name, age, gender, address, task);
                            mo.addOfficer(staff);
                            System.out.println(staff.toString());
                            System.out.println(" ");
                            break;
                        }
                        default:
                            System.out.println("Invalid!");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Enter name to search: ");
                    String name = sc.nextLine();
                    mo.searchOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    mo.showListInforOfficer();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid!");
            }
        }
    }
}
