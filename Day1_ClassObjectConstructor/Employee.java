public class Employee {
    String name;
    int id;
    int salary;
    Employee(int salary){
        if(salary<0){
            System.out.println("invalid");
            this.salary=0;
        }else{
            System.out.println("valid");
            this.salary=salary;
        }
    }
    public String toString(){
        return name+" "+id+" "+salary;
    }
    public static void main(String[] args){
        Employee e=new Employee(-10000);
        e.name="safrun";
        e.id=121;
        System.out.println(e);
    }
    }

