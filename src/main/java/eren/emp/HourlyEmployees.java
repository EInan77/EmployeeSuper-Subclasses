/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.emp;

/**
 *
 * @author ereni
 */
public class HourlyEmployees extends Employee {
    private double hours;
    private double hourlyWage;
     public HourlyEmployees(String firstName, String lastName, 
      String socialSecurityNumber, double hours, 
      double hourlyWage) {
       super(firstName, lastName, socialSecurityNumber );
       if (hourlyWage < 0.0) {
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }      

      // if commissionRate is invalid throw exception
      if (hours<= 0.0 || hours >= 168.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }     
      this.hours=hours;
      this.hourlyWage=hourlyWage;
     }
     public void setWage(double hourlyWage) {
      if (hourlyWage < 0.0) {
         throw new IllegalArgumentException("Hourly Wage must be non-negative");
      }      

      this.hourlyWage= hourlyWage;
   } 
      public void setHours(double hours) {
      if (hours <= 0.0 || hours >= 168.0) {
         throw new IllegalArgumentException(
            "Value of hours worked must be between 0 and 168 ");
      } 

      this.hours= hours;
   } 

    public double getHours() {
        return hours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }
         public double earnings() {
      return getHours() * getHourlyWage();
   } 
         
         @Override
public String toString() {
return String.format("%s%n%s: %.2f%n%s: %.2f",
super.toString(), "HourlyWage:", getHourlyWage(),
"Hours Worked", getHours());
}

}
