package model;

public class Employee {
    private int id;
    private String employee_name;
    private float employee_salary;
    private int employee_age;
    private int profile_image;

    public Employee(int id, String employee_name, float employee_salary, int employee_age, int profile_image) {
        this.id = id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
        this.profile_image = profile_image;
    }

    public int getId() {
        return id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public float getEmployee_salary() {
        return employee_salary;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public int getProfile_image() {
        return profile_image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public void setEmployee_salary(float employee_salary) {
        this.employee_salary = employee_salary;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }

    public void setProfile_image(int profile_image) {
        this.profile_image = profile_image;
    }
}
