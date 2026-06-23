package Day5_Abstraction;
 interface Payable {
    void calculatepay();
}
class Employee implements Payable{
    int bonus;
    int monthly_salary;
    Employee(int bonus,int monthly_salary){
        this.bonus=bonus;
        this.monthly_salary=monthly_salary;
    }
    @Override
    public void calculatepay() {
        System.out.println("payment for employee:"+(bonus+monthly_salary));
    }
}
class Freelancer implements Payable{
    int hours_worked;
    int rate_per_hour;
    Freelancer(int hours_worked,int rate_per_hour){
        this.hours_worked=hours_worked;
        this.rate_per_hour=rate_per_hour;
}
public void calculatepay(){
    System.out.println("payment for freelancer:"+hours_worked*rate_per_hour);
}
}
public class Payment {
    public static void main(String[] args) {
        Employee e=new Employee(1000,20000 );
        Freelancer f=new Freelancer(6, 580);
        e.calculatepay();
        f.calculatepay();
    }
}
