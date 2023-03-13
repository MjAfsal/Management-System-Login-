import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList<Product> productLinkedList = new LinkedList<Product>();
    private static Scanner mypage;

    public static void main(String[] args) {
        System.out.println("Welcome to Management System\n");
        AdminLogin();
    }

    public static void selection() {
        AdminLogin();
    }

    public static void AdminLogin() {
        Scanner mypage = new Scanner(System.in);
        System.out.println("Enter userName: ");
        String userName = mypage.nextLine();
        System.out.println("Enter Password: ");
        String Password = mypage.nextLine();
        System.out.println("Enter User Role: ");
        String userRole = mypage.nextLine();
        String user = "Admin";

        if ("Admin".equals(userRole)) {
            System.out.println("Do you want to Add Staff? ");
            String staffAdd = mypage.nextLine();
            if ("Yes".equals(staffAdd)) {
                System.out.println("How many Employees?");
                int n = 0;
                Employee emp[] = new Employee[n];
                n = mypage.nextInt();
                emp = new Employee[n];
                for (int i = 0; i < n; i++) {
                    emp[i] = new Employee();
                    System.out.println("Enter " + (i + 1) + " Employee data :");
                    System.out.print("Enter employee id :");
                    emp[i].id = mypage.nextInt();
                    System.out.print("Enter employee name :");
                    emp[i].name = mypage.next();
                    System.out.print("Enter employee designation :");
                    emp[i].designation = mypage.next();
                    System.out.print("Enter employee salary :");
                    emp[i].salary = mypage.nextBigDecimal();
                    //employeeList.add( emp[i]);
                }
                System.out.println("\n\n********* All Employee Details are :*********\n");
                for (int i = 0; i < n; i++) {
                    System.out.println("Employee id, Name, Designation and Salary :" + emp[0].id + " " + emp[i].name + " " + emp[i].designation + " " + emp[i].salary);
                    AddProduct();
                    selection();


                }
            }
        }
        if ("Staff".equals(userRole)) {
            AddProduct();
        } else if ("Customer".equals(userRole)) {
            Display();

        }
    }

    public static void StaffLogin() {
        System.out.println("Do you want to Add Product?");
        String ProductAdd = mypage.nextLine();
        if ("Yes".equals(ProductAdd)) AddProduct();
    }

    public static void AddProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to Add Product? ");
        String ProductAdd = scanner.nextLine();// Yes or No
        if ("Yes".equals(ProductAdd))
        if ("No".equals(ProductAdd)){
            Display();
        }

            System.out.print("How many Products? ");
        int n = scanner.nextInt();
        Product prod[] = new Product[n];
        for (int i = 0; i < n; i++) {
            prod[i] = new Product();
            System.out.println("Enter " + (i + 1) + " Product :");
            System.out.println("Product name: ");
            prod[i].Name = scanner.next();
            System.out.println("Product id: ");
            prod[i].Id = scanner.nextInt();
            System.out.println("Price: ");
            prod[i].Price = scanner.nextInt();

        }
        System.out.println("\n\n********* All Products Details are :*********\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Product id, Name, Code and Price :" + prod[0].Id + " " + prod[i].Name + " " + prod[i].Price);
        }


       System.out.println("Do you want Delete Product");
        String DeleteProduct = scanner.nextLine();
        if ("Yes".equals(DeleteProduct)) {
            DeleteProduct();
    } else if ("No".equals(DeleteProduct)) {
            Display();

        }

    }
    public static void DeleteProduct(){
        Delete();
    }


    public static void DisplayProduct() {
        Display();
    }



    public static void Display () {
        for (Product temp : productLinkedList) {
            System.out.println(temp.getName());
            System.out.println(temp.getId());
            System.out.println(temp.getPrice());
        }
    }
        public static void Delete () {
        productLinkedList.removeLast();
    }
    }


