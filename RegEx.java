//import java.util.Scanner;
//import java.util.logging.SocketHandler;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegEx {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter the name");
//            Pattern name=Pattern.compile(sc.nextLine());
//            Matcher matcher = name.matcher(sc.nextLine());
//            System.out.println("Enter the full name");
//            Pattern fullName=Pattern.compile(sc.nextLine());
//            Matcher matcher1 = fullName.matcher(sc.nextLine());
//            System.out.println("Enter the phone number ");
//            Pattern phoneNumber=Pattern.compile(sc.nextLine());
//            Matcher matcher3 = phoneNumber.matcher(sc.nextLine());
//            System.out.println("Enter the date ");
//            Pattern date=Pattern.compile(sc.nextLine());
//            Matcher matcher4 = phoneNumber.matcher(sc.nextLine());
//            System.out.println("Enter the sentence");
//
//        }
//
////        String name = String.valueOf(Pattern.compile("[a-zA-Z]{9}"));
////        String fullName = String.valueOf(Pattern.matches("[a-zA-Z]{9} [a-zA-Z]{9}", "Vivek Gujale"));
////        String phoneNumber = String.valueOf(Pattern.matches("91-[7-9][0-9]{9}", "91-8693062765"));
////        String date = String.valueOf(Pattern.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}", "25/10/2022"));
////        String data = String.format("Hello %s, We have your full name as %s in our system. your contact number is %s.\n" +
////                " Please,let us know in case of any clarification\n" +
////                " Thank you BridgeLabz,\n" +
////                " Date : %s", name, fullName, phoneNumber, date);
////        System.out.println(data);
//    }
//}
