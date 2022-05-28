
import java.util.Scanner;
import java.util.LinkedList;

public class LibraryInfo {

    int dep, purchase;

    public void chemistry() {
        System.out.println("");
        System.out.println("Available books in Chemistery Departments are following : ");
        LinkedList<String> book = new LinkedList<String>();
        book.add("1-> Biomolecular Chemistry");
        book.add("2-> Physical Chemistry");
        book.add("3-> Organic Chemistry");
        System.out.println(book);

    }

    public void biology() {
        System.out.println("");
        System.out.println("Available books in Biology Departments are following : ");
        LinkedList<String> book = new LinkedList<String>();
        book.add("1-> Anatomy");
        book.add("2-> Physiolohy");
        book.add("3-> Pharmocology");
        System.out.println(book);

    }

    public void Physics() {
        System.out.println("");
        System.out.println("Available books in Physics Derpartment are following");
        LinkedList<String> book = new LinkedList<String>();
        book.add("1-> Quantum Physics");
        book.add("2-> Mechanical Physics");
        book.add("3-> Sound Physics");
        System.out.println(book);

    }

    public void departmentPurchase() {
        int rep;
        Scanner obj = new Scanner(System.in);

        System.out.println("");
        System.out.println("Press 1: Chemistry Department");
        System.out.println("Press 2: Biology Department");
        System.out.println("Press 3: Physics Department");

        while (dep != 3) {
            System.out.println("What Do you want Press?");

            dep = obj.nextInt();

            if (dep == 1) {
                chemistry();
                System.out.println("What Book do want to purchase from Chemistry Department");

                while (purchase != 3) {

                    purchase = obj.nextInt();
                    if (purchase == 1) {
                        System.out.println("You have Successfully Purchased \"Biomolecular Chemistry\" ");
                        break;
                    } else if (purchase == 2) {
                        System.out.println("You have Successfully Purchased \"Physical Chemistry\" ");
                        break;
                    } else if (purchase == 3) {
                        System.out.println("You have Successfully Purchased \"Organic Chemistry\" ");
                        break;
                    } else {
                        System.out.println("Please choose from above available books!");
                    }
                }
                break;
            } else if (dep == 2) {
                biology();
                System.out.println("What do want to purchase from Biology Department");

                while (purchase != 3) {

                    purchase = obj.nextInt();
                    if (purchase == 1) {
                        System.out.println("You have Successfully Purchased \"Anatomy\" ");
                        break;
                    } else if (purchase == 2) {
                        System.out.println("You have Successfully Purchased \"Physiology\" ");
                        break;
                    } else if (purchase == 3) {
                        System.out.println("You have Successfully Purchased \"Pharmocology\" ");
                        break;
                    } else {
                        System.out.println("Please choose from above available books!");
                    }

                }
                break;
            } else if (dep == 3) {
                Physics();
                System.out.println("What do want to purchase from Physics Department");

                while (purchase != 3) {
                    purchase = obj.nextInt();
                    if (purchase == 1) {
                        System.out.println("You have Successfully Purchased \"Quantum Physics\" ");
                        break;
                    } else if (purchase == 2) {
                        System.out.println("You have Successfully Purchased \"Mechanical Physics\" ");
                        break;
                    } else if (purchase == 3) {
                        System.out.println("You have Successfully Purchased \"Sound Physics\" ");
                        break;
                    } else {
                        System.out.println("Please choose from above available books!");
                    }
                }

                break;
            } else {
                System.out.println("Wrong input!");
            }
        }
    }

    public void print() {
        if (dep == 1) {
            if (purchase == 1) {
                System.out.println("You have Purchased \"Biomolecular Chemistry\" ");
            } else if (purchase == 2) {
                System.out.println("You have Purchased \"Physical Chemistry\" ");
            } else if (purchase == 3) {
                System.out.println("You have Purchased \"Organic Chemistry\" ");
            }
        } else if (dep == 2) {
            if (purchase == 1) {
                System.out.println("You have Purchased \"Anatomy\" ");
            } else if (purchase == 2) {
                System.out.println("You have Purchased \"Physiology\" ");
            } else if (purchase == 3) {
                System.out.println("You have Purchased \"Pharmocology\" ");
            }
        } else if (dep == 3) {
            if (purchase == 1) {
                System.out.println("You have Purchased \"Quantum Physics\" ");
            } else if (purchase == 2) {
                System.out.println("You have Purchased \"Mechanical Physics\" ");
            } else if (purchase == 3) {
                System.out.println("You have Purchased \"Sound Physics\" ");
            }
        }
    }

}
