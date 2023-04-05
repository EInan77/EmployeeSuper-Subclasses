/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.emp;

/**
 *
 * @author ereni
 */
public class HourlyEmpstest {
      public static void main(String[] args) {
     HourlyEmployees employee =             
         new HourlyEmployees(                
         "Bob", "Lewis", "333-33-3333", 122, 15);
      
      // get base-salaried commission employee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Hours worked are", 
         employee.getHours());
      System.out.printf("%s %.2f%n", "Hourly Wage is",
         employee.getHourlyWage());
      System.out.printf("%s %.2f%n", "Your earnings are",
         employee.earnings());
     
      System.out.println(" ");
      
      employee.setHours(55);
      employee.setWage(25);
      System.out.println("Employee information obtained by tostring method after update");
      System.out.println(employee.toString());
      System.out.printf("%s %.2f%n", "Your earnings are",
         employee.earnings());

      
      
    
}
}
