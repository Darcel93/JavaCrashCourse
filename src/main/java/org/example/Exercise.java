package org.example;

public class Exercise {
static void array1() {
    String[] Members = new String[10];
    Members[0] = "Rza";
    Members[1] = "Gza";
    Members[2] = "UGOD";
    Members[3] = "Method Man";
    Members[4] = "Inspecta Deck";
    Members[5] = "GhostFace Killah";
    Members[6] = "Raekwon";
    Members[7] = "Ol' Dirty Bastard";
    Members[8] = "Mastah Killah";
    Members[9] = "Capadonna";

    for (int i = 0; i < Members.length; i = i + 1 ){
        System.out.println(Members[i]);
    }

}
    static void main() {
        int one = 3;
        String Group = "WuTang";
        //String Members = "Rza, Gza, UGOD, Method Man, Inspecta Deck, GhostFace Killah, Raekwon, Ol' Dirty Bastard, Mastah Killah, Capadonna";
        array1();
        boolean Aintnothingtofuckwith = true;
        System.out.println(one);
        System.out.println(Group);
        System.out.println(Aintnothingtofuckwith);
        //System.out.println(Members);

    }
}

