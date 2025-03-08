package org.mryep.a;

import java.util.LinkedHashSet;

public class lls {
    public static void main(String[] args) {
        LinkedHashSet<car_lls> lls = new LinkedHashSet<>();
        lls.add(new car_lls("porche", 100));
        lls.add(new car_lls("porche", 100));
        lls.add(new car_lls("porche", 200));
        lls.add(new car_lls("ferriy", 400));
        System.out.println("lls=" + lls);
    }
}

class car_lls {
    private String name;
    private int no;

    public car_lls(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "car_lls [name=" + name + ", no=" + no + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + no;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        car_lls other = (car_lls) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (no != other.no)
            return false;
        return true;
    }

}