package org;

public class WarmUpNoJcole {

    public static void main() {
     String name = "Darsenio Hall";
     int age = 33;
     boolean actual = false;
     double sum  = 12.15;
     float sub = 13.21f;
     adding();
     add2(3,4);
     String Final = AllCaps("running");
     System.out.println("After: "  + Final);
     boolean release_status = true;
     GTA(release_status);

    }

    public static void adding (){
        int i = 5;
        int v = 7;
        //int q = 3;
        int add = i + v;
        System.out.println(add);


    }

    public static void add2(int i, int v){
        int sum2 = i + v;
        System.out.println(sum2);

    }

    public static String AllCaps(String a){
        System.out.println("Before: " + a);
        String A = a.toUpperCase();
        return A;

    }

    public static void GTA(boolean will_release){
       // ! means false....
        if (!will_release){
            System.out.println("GTA Will Release This Year!!");
            return;

        }
        System.out.println("Will Not Release This Year :(");


    }
}
