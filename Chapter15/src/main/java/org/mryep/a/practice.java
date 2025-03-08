package org.mryep.a;

import java.util.*;

public class practice {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        MyDate a = new MyDate(01, 17, 03);
        MyDate b = new MyDate(07, 9, 77);
        MyDate c = new MyDate(03, 13, 72);
        employees.add(new Employee("lyp", a, 22));
        employees.add(new Employee("ys", b, 48));
        employees.add(new Employee("lyf", c, 53));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().equals(o2.getName())) {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class Employee {
    private String name;
    private MyDate birthday;
    private int age;

    public Employee(String name, MyDate birthday, int age) {
        this.birthday = birthday;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", birthday=" + birthday + ", sal=" + age + "]";
    }

}

class MyDate implements Comparable<MyDate> {
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate [month=" + month + ", day=" + day + ", year=" + year + "]";
    }

    @Override
    public int compareTo(MyDate o) { // 把对year-month-day比较放在这里

        int yearMinus = year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        // 如果year相同，就比较month
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }
        // 如果year 和 month
        return day - o.getDay();
    }

}