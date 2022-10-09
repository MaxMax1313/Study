package Lesson7;

public class Employee {
    protected  double salary;
    void dvoynayaZP(){
        System.out.println("Dvoynaya ZP = " + salary*2);

    }
    Employee(double salary2){
        salary=salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();

    }
    class EmployeeTest{
        public static void main(String[] args) {
            Employee emp = new Employee(500);
            System.out.println(emp.salary);
            emp.dvoynayaZP();

        }



    }
}
