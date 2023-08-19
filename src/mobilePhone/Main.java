package mobilePhone;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", "123-456-7890", 128);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 12", "987-654-3210", 256);

        phone1.makeCall("555-1234");
        phone1.installApp("Facebook");
        phone1.displayInfo();

        System.out.println();

        phone2.makeCall("555-5678");
        phone2.installApp("Instagram");
        phone2.displayInfo();
    }
}

