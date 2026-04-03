package WuTangThemedCoding;

import java.util.Random;
import java.util.Scanner;

public class WuTangNameGeneratorUpdate {


    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String FirstName = input.nextLine();
        System.out.print("Enter Last Name: ");
        String LastName = input.nextLine();
        FirstName = FirstNames();
        System.out.println("This is the value of the first name: " + FirstName);
        LastName = SecondNames(FirstName);
        String NameFinal = FirstName + " " + LastName + " " + TitleName();

        System.out.print(NameFinal);



    }


    public static String FirstNames(){
        Random generate = new Random();
        int i = generate.nextInt(22);

        String[] FullName = new String [22];
        FullName[0] = "Crimson";
        FullName[1] = "Shadow";
        FullName[2] = "Iron";
        FullName[3] = "Storm";
        FullName[4] = "Silent";
        FullName[5] = "Ruthless";
        FullName[6] = "Draco";
        FullName[7] = "Phantom";
        FullName[8] = "Steel";
        FullName[9] = "Nova";
        FullName[10] = "Masta";
        FullName[11] = "Dragon";
        FullName[12] = "Tiger";
        FullName[13] = "Ronin";
        FullName[14] = "Mantis";
        FullName[15] = "Cipher";
        FullName[16] = "Killah";
        FullName[17] = "Lotus";
        FullName[18] = "Katana";
        FullName[19] = "Live";
        FullName[20] = "Monarch";
        FullName[21] = "God";
        return FullName[i];
    }

    public static String SecondNames(String other){
        System.out.println("This is the other value: " + other);
        Random generate = new Random();
        int i = generate.nextInt(22);

        String[] FullName = new String [22];
        FullName[0] = "Crimson";
        FullName[1] = "Shadow";
        FullName[2] = "Iron";
        FullName[3] = "Storm";
        FullName[4] = "Silent";
        FullName[5] = "Ruthless";
        FullName[6] = "Draco";
        FullName[7] = "Phantom";
        FullName[8] = "Steel";
        FullName[9] = "Nova";
        FullName[10] = "Masta";
        FullName[11] = "Dragon";
        FullName[12] = "Tiger";
        FullName[13] = "Ronin";
        FullName[14] = "Mantis";
        FullName[15] = "Cipher";
        FullName[16] = "Killah";
        FullName[17] = "Lotus";
        FullName[18] = "Katana";
        FullName[19] = "Live";
        FullName[20] = "Monarch";
        FullName[21] = "God";

        String picked = FullName[i];
        boolean is_equals = true;
        while (is_equals) {
            i = generate.nextInt(22);
            picked = FullName[i];
            System.out.println("In a While Loop");
           is_equals = picked.equals(other);
        }
        return picked;
    }

    public static String TitleName(){
        Random generate = new Random();
        int b = generate.nextInt(0, 11);
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


