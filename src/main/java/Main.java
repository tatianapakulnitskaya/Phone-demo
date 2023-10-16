
public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(1234567, "Nokia", 250.5);
        Phone phone2 = new Phone(1111111, "Huawei", 350);
        Phone phone3 = new Phone(7654327, "Samsung", 110);
        System.out.println(phone1 + "\n" + phone2 + "\n" + phone3);
        Phone.receiveCall("Василий");
        System.out.println(Phone.getNumber(phone1.number));
        System.out.println(Phone.getNumber(phone2.number));
        System.out.println(Phone.getNumber(phone3.number));
        //  System.out.println(phone3.number);
        Phone.receiveCall2("Василий", Phone.getNumber(phone1.number));

    }
}