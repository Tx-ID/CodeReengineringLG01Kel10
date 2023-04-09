
public class Main {

	public static void main(String[] args) {
		CustomerDetail customer = new CustomerDetail("Bunga", 20, 0);
		customer.printDetails();
		
		System.out.println(customer.hasCredit());
		System.out.println(customer.isAdult());
	}
}

/*
KELOMPOK 10 LQ01
2502005912 - Emmanuel Clement
2502016475 - Haliza Syafa Oktaviani
2502024382 - Bunga Aura Prameswari

Large Class Treatment:
- Melakukan extract subclass
- Membuat subclass baru "CustomerDetail.java" dari parent class "Customer.java"
- Menambahkan constructor subclass baru 
- Memindahkan method hasCredit(), isAdult(), dan printDetails() ke subclass baru
- Mengganti access modifier parent class dari private ke protected agar
  subclass dapat mengakses variabel name, age, dan credit dari parent class
*/