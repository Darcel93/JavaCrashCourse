package org;

import java.nio.file.SecureDirectoryStream;
import java.util.Random;
import java.util.Scanner;

public class WuTangNameGenerator {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String FirstName = input.nextLine();
        System.out.print("Enter Last Name: ");
        String LastName = input.nextLine();
        String NameFinal = FirstNames() + " " + SecondNames() + " " + TitleName();

            System.out.print(NameFinal);



    }


    public static String FirstNames(){
        Random generate = new Random();
        int i = generate.nextInt(10);

        String[] Firstword = new String [11];
        Firstword[0] = "Crimson";
        Firstword[1] = "Shadow";
        Firstword[2] = "Iron";
        Firstword[3] = "Storm";
        Firstword[4] = "Silent";
        Firstword[5] = "Ruthless";
        Firstword[6] = "Draco";
        Firstword[7] = "Phantom";
        Firstword[8] = "Steel";
        Firstword[9] = "Nova";
        Firstword[10] = "Masta";

        return Firstword[i];
    }

    public static String SecondNames(){

        Random generate = new Random();
        int v = generate.nextInt(0, 10);

       String[] Secondword = new String[11];
       Secondword[0] = "Dragon";
       Secondword[1] = "Tiger";
       Secondword[2] = "Ronin";
       Secondword[3] = "Mantis";
       Secondword[4] = "Cipher";
       Secondword[5] = "Killah";
       Secondword[6] = "Lotus";
       Secondword[7] = "Katana";
       Secondword[8] = "Live";
       Secondword[9] = "Monarch";
       Secondword[10] = "God";

       return Secondword[v];
    }

    public static String TitleName(){
        Random generate = new Random();
        int b = generate.nextInt(0, 10);
    String[] Titles = new String[11];
    Titles[0] = "The Chamber Guardian";
    Titles[1] = "The Beat Assassin";
    Titles[2] = "The Rhythm Monk";
    Titles[3] = "The Flow General";
    Titles[4] = "The Iron Lyricist";
    Titles[5] = "Hidden Warrior";
    Titles[6] = "Of The Street Philosophers";
    Titles[7] = "Champion of the Shadows";
    Titles[8] = "Strategist Supreme";
    Titles [9] = "The Silent Conqueror";
    Titles[10] = "The Elder God";

    return Titles[b];

    }
}


