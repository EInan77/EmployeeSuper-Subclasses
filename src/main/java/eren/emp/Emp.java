/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.emp;

/**
 *
 * @author ereni
 */
public class Emp {

    public static void main(String[] args) {
         CommissionEmployee Emp1 = new CommissionEmployee
        ("Eren", "Inan","173-23-1393",15000, 0.2);
         System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%s %s%n", "First name is",
         Emp1.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         Emp1.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         Emp1.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         Emp1.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         Emp1.getCommissionRate());
     
      
      
 System.out.println(" ");
         System.out.println("Commission Employee data retrieved from toString method:");
         System.out.println(Emp1.toString());
         
    }
}
