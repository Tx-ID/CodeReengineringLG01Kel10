public class Customer {
    protected String name;
    protected int age;
    protected int credit;

    public Customer(String n, int a, int c) {
        name = n;
        age = a;
        credit = c;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setCredit(int c) {
        credit = c;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCredit() {
        return credit;
    }

}
