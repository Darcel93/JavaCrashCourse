package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean Even_Odd (int number_1, int number_2) {
        return (number_1 % 2 == 0 && number_2 % 2 == 0) || (number_1 % 2 != 0 && number_2 % 2 != 0);
    }
//    public static boolean NumberEquals (int number_1, int number_2) {
//        int result = number_1 + number_2;
//        System.out.print("NumberEquals: ");
//        System.out.println(result);
//        return number_1 ==;
//
//    }
    public static String Address (String user_address) {
        return user_address.toUpperCase();
    }
    public static void sum (int number_1, int number_2){
        int result = number_1 + number_2;
       System.out.println(result);

    }
    public static String GetName () {
        //return number_1 + number_2 ;
        return "Darcel";

    }
 public static void main (String[] args){
     String Name = "Him Jones";
     String City = "BallSoHardVillage";
     int One = 1;
     int Two = 2;
     double decimal_value = 2.2;
     char A = 'a';
     long timestamp =156666774322L;
      boolean Truther = false;
      //int is_Him_Jones = Name.equals("Him Jones");
      //boolean is_Him_Jones = Name.equals("Him Jones");
     int three = One + Two;
     boolean is_three = three <= 3;
//    int result = sum(5, 3);
//    int num = sum2(4,3);
//    System.out.println(num);
     sum(5,15);
     boolean Odd_Even = Even_Odd(8, 4);
    String Name_2 = GetName();
    String street = Address("123 Easy St");
    //boolean Equals = NumberEquals(4, 5);
    //System.out.println(Equals);
    System.out.println(street);
    System.out.println(Name_2);
    System.out.println(Odd_Even);
    System.out.println(Even_Odd(7,8));






//     System.out.println(Name);
//     System.out.println(City);
//     System.out.println(One);
//     System.out.println(Two);
//     System.out.println(decimal_value);
//     System.out.println(A);
//     System.out.println(timestamp);
//     System.out.println(Truther);
//     System.out.println(is_Him_Jones);
     System.out.println(three);
     System.out.println(is_three);





 }
}
