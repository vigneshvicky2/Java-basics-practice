class employee{
    int emp_no;
    String emp_name;
    String dept;
    double salary;
    public employee(){
        emp_no=0;
        dept="";
        emp_name="";
        salary=0.0;
    }
    public employee(int emp_no,String emp_name,String dept,double salary){
        this.emp_no=emp_no;
        this.emp_name=emp_name;
        this.dept=dept;
        this.salary=salary;
    }
    public employee(employee s){
        emp_no=s.emp_no;
        emp_name=s.emp_name;
        dept=s.dept;
        salary=s.salary;
    }
    void display(){
        System.out.println(emp_no+" "+ emp_name+" "+dept+" "+salary);
    }
    void salary(){
        System.out.println("Salary in LPA: "+(salary*12));
    }
}
public class constructor{
    public static void main(String[] args) {
        employee obj1 = new employee();
        obj1.display();
        employee obj2 = new employee(1,"Vignesh","AI",18000);
        obj2.display();
        employee obj3 = new employee(obj2);
        obj3.display();
        obj3.salary();
    }
}