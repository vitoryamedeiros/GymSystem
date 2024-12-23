package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GymManagement gym = new GymManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Gym Management System ---");
            System.out.println("1. Create Member");
            System.out.println("2. List Members");
            System.out.println("3. Update Member");
            System.out.println("4. Delete Member");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){

                case 1 -> {
                    System.out.println("\n--- Create Member");
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter email: ");
                    String email = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    gym.createMember(name, email, age);
                }
                case 2 -> gym.listMembers();
                case 3 -> {
                    System.out.print("Enter member ID to update: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter new name: ");
                    String name = scanner.next();
                    System.out.print("Enter new email: ");
                    String email = scanner.next();
                    System.out.print("Enter new age: ");
                    int age = scanner.nextInt();
                    gym.updateMember(id, name, email, age);
                }
                case 4 -> {
                    System.out.print("Enter member ID to delete: ");
                    int id = scanner.nextInt();
                    gym.deleteMember(id);
                }
                case 5 -> System.out.println("\n--- Exiting the system...");
                default -> System.out.println("\n--- Invalid choice! Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}