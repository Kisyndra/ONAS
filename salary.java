package example.com;

import java.util.Scanner;

public class Salary {

  private String firstLastName;

  private int workedHours;

  private int rateByHour;

  public Salary() {
    System.out.println("New salary");
  }

  public Salary(String firstLastName, int workedHours, int rateByHour) {
    this.firstLastName = firstLastName;
    this.workedHours = workedHours;
    this.rateByHour = rateByHour;
  }

  public void output() {
    System.out.println(toString());
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first name, last name and patronymic (example Petr Ivanov Ivanovich): ");
    this.firstLastName = scanner.nextLine();
    System.out.println();
    if (!this.firstLastName.matches("^[A-Z][a-z]{1,19}\\s[A-Z][a-z]{1,19}\\s[A-Z][a-z]{1,19}")) {
      this.firstLastName = "";
      System.out.println("No valid first name, last name and patronymic");
      return;
    }

    System.out.print("Enter worked hours (more than 0): ");
    this.workedHours = scanner.nextInt();
    System.out.println();
    if (this.workedHours < 0) {
      this.workedHours = 0;
      System.out.println("No valid worked hours");
      return;
    }

    System.out.print("Enter rate by hour (more than 0): ");
    this.rateByHour = scanner.nextInt();
    if (this.rateByHour < 0) {
      this.rateByHour = 0;
      System.out.println("No valid rate by hour");
    }

  }

  public void printSalaryAmount() {
    System.out.println("Salary: " + (workedHours * rateByHour));
  }

  public String getFirstLastName() {
    return firstLastName;
  }

  public void setFirstLastName(String firstLastName) {
    this.firstLastName = firstLastName;
  }

  public int getWorkedHours() {
    return workedHours;
  }

  public void setWorkedHours(int workedHours) {
    this.workedHours = workedHours;
  }

  public int getRateByHour() {
    return rateByHour;
  }

  public void setRateByHour(int rateByHour) {
    this.rateByHour = rateByHour;
  }

  @Override
  public String toString() {
    return "Salary{" +
        "firstLastName='" + firstLastName + '\'' +
        ", workedHours=" + workedHours +
        ", rateByHour=" + rateByHour +
        '}';
  }
}
