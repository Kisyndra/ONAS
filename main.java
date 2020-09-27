public class Main {

  public static void main(String[] args) {

    Salary salary = new Salary();
    salary.setRateByHour(50);
    salary.setWorkedHours(100);
    salary.printSalaryAmount();

    salary.input();
    salary.output();

  }
}
