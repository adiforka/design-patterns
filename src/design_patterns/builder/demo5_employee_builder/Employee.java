package design_patterns.builder.demo5_employee_builder;

//would be interesting to simulate ID auto-generation
class Runner {
    public static void main(String[] args) {

        Employee employee1 = new Employee.Builder()
                .setName("Jackson")
                .setAge(22)
                .setDepartment("Bureaucracy Inc.")
                .build();

        Employee employee2 = new Employee.Builder()
                .setName("Samuel")
                .setAge(65)
                .setDepartment("of Death")
                .build();

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}

public class Employee {

    private final String name;
    private final int age;
    private final String department;

    private Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String toString() {
        return "Employee: " + name + ", " + age + ", " + department;
     }

    public static class Builder {
        private String name;
        private int age;
        private String department;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Employee build() {
            return new Employee(name, age, department);
        }
    }
}


