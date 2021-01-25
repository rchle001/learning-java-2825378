public class Main {
    public static double EmployeeGrossYearlySalary(double WeeklyHours, double MoneyPerHour)
    // input 1: number of hours the employee works per week 
    // input 2: amount of money the employee make per hour
    {
        // roughly 52 weeks in a year
        double YearlySalary = WeeklyHours * 52 * MoneyPerHour;  

        return YearlySalary;
    }
    public static void main(String[] args) {
        double salary = EmployeeGrossYearlySalary(40, 20);
        System.out.println(salary);
    }

}
