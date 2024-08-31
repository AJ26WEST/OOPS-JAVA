public class Inheritance_Engineer extends Inheritance_Employee {

    public static void main(String[] args) {
        Inheritance_Employee employee1 = new Inheritance_Employee();
        Inheritance_Engineer engineer = new Inheritance_Engineer();
        
        int salary = 20000;
        engineer.display();  // Display method from InheritanceEngineer
        engineer.printSalary(salary);

        salary = 10000;
        employee1.display();  // Display method from InheritanceEmployee
        employee1.printSalary(salary);
    }

    public static void display() {
        System.out.println("Display method in InheritanceEngineer.");
    }

    public void printSalary(int salary) {
        System.out.println("Salary in InheritanceEngineer: " + salary);
    }
}



public class Inheritance_Employee {
    public static void display() {
        System.out.println("Display method in InheritanceEmployee.");
    }

    public void printSalary(int salary) {
        System.out.println("Salary in InheritanceEmployee: " + salary);
    }
}
