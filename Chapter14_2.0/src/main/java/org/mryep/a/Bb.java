package org.mryep.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bb {
  @SuppressWarnings({ "all" })
  public static void main(String[] args) {
    List<Dog> list = new ArrayList<>();
    list.add(new Dog(1, "A"));
    list.add(new Dog(1, "A"));
    list.add(new Dog(1, "A"));

    for (Object obj : list) {
      System.out.println(obj);
    }

    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
      Object obj = iterator.next();
      System.out.println(obj);
    }
  }
}

class Dog {
  private String name;
  private int age;

  public Dog() {
  };

  public Dog(int age, String name) {
    this.setAge(age);
    this.setName(name);
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Dog" + age + name;
  }

}
