import java.util.Comparator;

public class users implements Comparable<users> {
    String name;
      int age;
    String dept;
    int rollno;
    public users() {
    }

    @Override
    public String toString() {
        return "users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    public users(int rollno, int age, String dept, String name) {
        this.name=name;
        this.age=age;
        this.dept=dept;
        this.rollno=rollno;

    }

    @Override
    public int compareTo(users o) {
        return this.rollno-o.rollno;
    }
}

