public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    public static String[] validNumber = new String[]{"84-0978489648", "80-0905327696"};
    public static String[] inValidNumber = new String[]{"a8-0222222222", "84-112345678"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String number : validNumber) {
            boolean invalid = phoneNumber.validate(number);
            System.out.println("Phone number " + number + " is valid : " + invalid);
        }
        for (String number : inValidNumber){
            boolean invalid = phoneNumber.validate(number);
            System.out.println("Phone number " + number + " is valid : " + invalid);
        }
    }
}
