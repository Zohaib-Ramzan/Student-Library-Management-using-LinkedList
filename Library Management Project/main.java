
import java.util.Scanner; // COSC212101057

public class main {

    public static void main(String[] args) {
        int choice = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\n\n");
        System.out.print("\t\t\t     ****************************************\n");
        System.out.print("\t\t\t     *                                      *\n");
        System.out.print("\t\t\t     *                                      *\n");
        System.out.print("\t\t\t     *     ----------------------------     *\n");
        System.out.print("\t\t\t     *      WELCOME TO STUDENT LIBRARY      *\n");
        System.out.print("\t\t\t     *     ----------------------------     *\n");
        System.out.print("\t\t\t     *                                      *\n");
        System.out.print("\t\t\t     *                                      *\n");
        System.out.print("\t\t\t     ****************************************\n");
        System.out.print("\n\n");

        StudentInfo stud = new StudentInfo();
        LibraryInfo libr = new LibraryInfo();

        while (choice != 4) {

            System.out.println("--->Enter 1- For the Student Registeration \n--->Enter 2- For Visiting Library \n--->Enter 3- View purchase History \n--->Enter 4- For Exit the Program");
            choice = obj.nextInt();

            if (choice == 1) {
                //   StudentInfo stud = new StudentInfo();

                System.out.println("Enter the Student's name : ");
                stud.name = obj.nextLine();
                stud.name = obj.nextLine();
                System.out.println("Enter the Father's name : ");
                stud.fname = obj.nextLine();
                System.out.println("Enter the University Registration No. ");
                stud.reg_no = obj.nextLine();
                System.out.println("Enter the User ID : ");
                stud.uid = obj.nextLine();
                System.out.println("In which Semester you Study: ");
                stud.sem = obj.nextInt();

                stud.setdata(stud.name, stud.fname, stud.reg_no, stud.uid, stud.sem);
                System.out.println("-------------------------------------");
                System.out.println("Congratulations! You Are Registered");
                System.out.println("-------------------------------------");
                System.out.print("\n");
            } else if (choice == 2) {

                libr.chemistry();
                libr.biology();
                libr.Physics();
                libr.departmentPurchase();
            } else if (choice == 3) {
                System.out.print("\n\n");
                System.out.println("-------------------------------------");
                stud.getdata();
                libr.print();
                System.out.println("-------------------------------------");
            } else if (choice == 4) {
                System.out.println("Thanks! For Visiting Our Library  :-) ");
            } else {
                System.out.println("Wrong input!");
            }
        }
    }

}
