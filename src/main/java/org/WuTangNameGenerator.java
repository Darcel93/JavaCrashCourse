package org;

import java.nio.file.SecureDirectoryStream;

public class WuTangNameGenerator {
    public static void main(){
        FirstNames();
        SecondNames();
        TitleName();



    }

    public static String FirstNames(){
        String[] Firstword = new String [11];
        Firstword[0] = "Crimson";
        Firstword[1] = "Shadow";
        Firstword[2] = "Iron";
        Firstword[3] = "Storm";
        Firstword[4] = "Silent";
        Firstword[5] = "Ruthless";
        Firstword[6] = "Frost";
        Firstword[7] = "Phantom";
        Firstword[8] = "Steel";
        Firstword[9] = "Nova";
        Firstword[10] = "Masta";
        return Firstword[0];
    }

    public static String SecondNames(){
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
    }

    public static String TitleName(){
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

    }
}


