import java.time.LocalDate;
import java.util.ArrayList;

class EmployeeManagementSystem{
    int emp_id;
    String emp_name;
    int emp_salary;
    LocalDate date;
    String department;

    public EmployeeManagementSystem() {
    }

    public EmployeeManagementSystem(int emp_id, String emp_name, int emp_salary, LocalDate date, String department) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
        this.date = date;
        this.department = department;
    }
    ArrayList<EmployeeManagementSystem> adde= new ArrayList<>();

    @Override
    public String toString() {
        return
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_salary='" + emp_salary + '\'' +
                ", date=" + date +
                ", department='" + department + '\'' +
                '}';
    }
    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Integer getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(Integer emp_salary) {
        this.emp_salary = emp_salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<EmployeeManagementSystem> getAdde() {
        return adde;
    }

    public void setAdde(ArrayList<EmployeeManagementSystem> adde) {
        this.adde = adde;
    }

    public  void addEmployee(EmployeeManagementSystem emp){
        if(emp==null||emp.emp_id==0||emp.emp_salary==0||
                emp.emp_name==null||emp.department==null||emp.date==null)
        {
            System.out.println("employee details or empty so you can write out the code ");
            return;
        } else {
            adde.add(emp);
           // System.out.println("successfully added the emplyoee ");
        }
    }
    public void viewallEmployee (){
        System.out.println(adde);
    }

    public void viewemployebyId(int empid) {
        for(EmployeeManagementSystem e:adde)
        {
            if(e.getEmp_id()==empid)
            {
                System.out.println(e);
            }
        }
    }

    public void UpdateEmployeebyId(EmployeeManagementSystem emp) {
        if(emp==null)
            System.out.println("employee is empty");
        for(EmployeeManagementSystem esd:adde)
        {
           if (esd.emp_id==emp.emp_id)
           {
               esd.setEmp_name("chandru");
               esd.setDepartment("EEE");
               esd.setEmp_salary(27000);
           }}
    }

    public void deleteByName(String name) {
            if(name == null) {
                System.out.println("name is null");
                return;
            }
            for(int i = 0; i < adde.size(); i++) {
                if(adde.get(i).emp_name.equals(name)) {
                    adde.remove(i);
                    System.out.println("Employee deleted");
                    return;
                }}
            System.out.println("Employee not found");}

    public void deleteById(int id) {

        for(int i=0;i<adde.size();i++)
        {
           if(adde.get(i).getEmp_id()==id) {
               adde.remove(i);
               return;}
           else {
               System.out.println("not found the user");}
        }}

    public void updateSalarybyemp(int id,int salary) {
        for(int i=0;i<adde.size();i++)
        {
            if(adde.get(i).emp_id==id)
            {
                adde.get(i).setEmp_salary(salary);
            }
        }

    }
}
class employeemanagement {
    public static void main (String args[])
    {
        //USER ENTER THE DETAILS
        EmployeeManagementSystem e1=new EmployeeManagementSystem();
    e1.addEmployee(new EmployeeManagementSystem(1,"al-ameen",
           27000,LocalDate.of(2001,11,12),"IT"));
        e1.addEmployee(new EmployeeManagementSystem(2,"prakash",
                26000,LocalDate.of(2002,2,12),"ECE"));
     e1.addEmployee(new EmployeeManagementSystem(3,"sanjana",
                45000,LocalDate.of(2003,4,12),"IT"));
        e1.addEmployee(new EmployeeManagementSystem(4,"kanmani",
                7000,LocalDate.of(2005,5,12),"MECH"));
        e1.addEmployee(new EmployeeManagementSystem());
        //e1.viewemployebyId(3);
        e1.UpdateEmployeebyId(new EmployeeManagementSystem(1,"al-ameen",
                27000,LocalDate.of(2001,11,12),"IT"));
       // e1.deleteByName("prakash");
        e1.deleteById(2);
        e1.updateSalarybyemp(1,55555);
        e1.viewallEmployee();

    }
}