
public class CustomerDetail extends Customer {

	public CustomerDetail(String name, int age, int credit) {
		super(name, age, credit);
	}
	
	public boolean hasCredit() {
        if (credit > 0) {
            return true;
        } 
        return false;
    }

    public boolean isAdult() {
        if (age >= 18) {
            return true;
        } 
        return false;
        
    }
    
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Credit: " + credit);
    }

}
