package parser.exSAX;

public class Employee {
    private String name, job, content;

    public Employee(String name, String job, String content) {
        this.name = name;
        this.job = job;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
