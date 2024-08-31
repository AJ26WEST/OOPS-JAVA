public class Inehritance_Engineer extends inheritance_Employeee{
    public static void main(String[] args) {
        inheritance_Employeee employee = new inheritance_Employeee();
        int salary  = 20000;
        employee.display();
        employee.calcSalary(salary);
        salary = 10000;
        employee.calcSalary(salary);

    }
}


public class inheritance_Employeee {
    public void display(){
        System.out.println("The class is inheritance_Employee");
    }
   public  int calcSalary(int salary ){
        System.out.println("Salary is "+salary);
        return 0;
    }
   
}
