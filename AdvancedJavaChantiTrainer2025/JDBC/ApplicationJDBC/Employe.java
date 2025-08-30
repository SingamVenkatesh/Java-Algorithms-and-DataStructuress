package AdvancedJavaChantiTrainer2025.JDBC.ApplicationJDBC;


public class Employe {
    private int id;
    private String name;
    private float salary;

    public Employe() {
    }

    public Employe(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Employee {  id " + this.id + " name " + this.name + "salary " + this.salary + "}";
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return this.salary;
    }
}
