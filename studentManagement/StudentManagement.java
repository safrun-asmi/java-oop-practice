package studentManagement;
import java.util.*;
class student{
    private int  id;
    private String name;
    private int age;
    private String course;
    student(int id,String name,int age,String course){
        this.name=name;
        this.age=age;
        this.course=course;
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public String toString(){
        return name+" "+age+" "+id+" "+course;
    }
}
public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<student> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter option");
        System.out.println("1.Add Student");
        System.out.println("2.view Student");
        System.out.println("3.search Student");
        System.out.println("4.update Student");
        System.out.println("5.delete Student");
        System.out.println("6.exit");
        
        String option=sc.nextLine();
        while(!option.equalsIgnoreCase("exit")){
        if(option.equalsIgnoreCase("Add Student")){
            System.out.println("enter id");
            int id=sc.nextInt();
            sc.nextLine();
            boolean exists=false;
            for(int i=0;i<list.size();i++){
                student s=list.get(i);
                if(id==s.getId()){
                    exists=true;
                    break;
                }
            }
                if(exists){
                    System.out.println("student with this id already exists");
                }else{
                    System.out.println("enter name");
                    String name=sc.nextLine();
                    System.out.println("age");
                    int age=sc.nextInt();
                     sc.nextLine();
                     System.out.println("enter course");
                     String course=sc.nextLine();
                     student s1=new student(id,name,age,course);
                     list.add(s1);
                     System.out.println("student added");
                }
            }
            
        else if(option.equalsIgnoreCase("view Student")){
            if(list.size()==0){
                System.out.println("no students to view");
                
            }else{
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
        }else if(option.equalsIgnoreCase("search student")){
            System.out.println("enter id");
            int id=sc.nextInt();
            sc.nextLine();
            for(int i=0;i<list.size();i++){
                student s=list.get(i);
                if(s.getId()==id){
                    System.out.println(s);
                    break;
                }
            }
        }else if(option.equalsIgnoreCase("update Student")){
            System.out.println("enter id");
            int id=sc.nextInt();
            sc.nextLine();
            for(int i=0;i<list.size();i++){
                student s=list.get(i);
                if(id==s.getId()){
                    System.out.println("name");
                    String name=sc.nextLine();
                    System.out.println("age");
                    int age=sc.nextInt();
                    sc.nextLine();
                    System.out.println("course");
                    String course=sc.nextLine();
                    s.setName(name);
                    s.setAge(age);
                    s.setCourse(course);
                    break;
                }
            }
        }
        else if(option.equalsIgnoreCase("delete Student")){
            System.out.println("enter id");
            int id=sc.nextInt();
            sc.nextLine();
            for(int i=0;i<list.size();i++){
                student s=list.get(i);
                if(id==s.getId()){
                    list.remove(i);
                    break;
                }
            }
        }
        System.out.println("enter option");
        option=sc.nextLine();
    }
}
    
}
