import java.util.ArrayList;

// Yapıcı metod içerisinden yukarıda tanımlanan nesne değişkenlerine erişilmek istenirse this anahtar kelimesi kullanılır.
// this kelimesi, o anda üzerinde işlem yapılan nesnenin referansını döndürür
// ve böylece nesne değişkenlerine erişmiş oluruz.

public class Customers
{
    public String firstName;    // String with the name "firstName" created
    public String lastName;     // String with the name "lastName" created
    public ArrayList<String> customerList = new ArrayList<>();      // ArrayList with the name "CustomerList" created
    public Customers(String firstName)
    {
        this.firstName = firstName;

    }
    public Customers(){
        customerList.add("Cierra");     // add the customer with the name Cierra to the CustomerList
        customerList.add("Alden");      // add the customer with the name Alden to the CustomerList
        customerList.add("Ece");        // add the customer with the name Ece to the CustomerList
    }
}
