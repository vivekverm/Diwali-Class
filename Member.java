public class Member
{
    String Name;
    int Age;
    int P_number;
    String Address;
    float Salary;
    public void printSalary()
    {
        System.out.println("Salary of Member");
    }
}
class Employee extends Member
{
   String Specialization;
   String Department;
   Employee()
   {
       System.out.println(Name="Vivek kumar");
       System.out.println(Age=20);
       System.out.println(P_number=992989261);
       System.out.println(Address="Agra");
       System.out.println(Salary=999999);

   }


}
class Manager extends Member
{
    String Specialization;
    String Department;
    Manager()
    {
        System.out.println();
        System.out.println(Name="Dracula");
        System.out.println(Age=18);
        System.out.println(P_number=654389261);
        System.out.println(Address="Delhi");
        System.out.println(Salary=99);
    }

    public static void main(String[] args) {
        Employee obj=new Employee();
        Manager obj1=new Manager();
    }
}

