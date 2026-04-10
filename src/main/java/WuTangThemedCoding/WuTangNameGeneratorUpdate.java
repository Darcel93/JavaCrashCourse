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
        System.out.print ("Enter preferred gender: ");
        String gender = input.nextLine();
        //FirstName = FirstNames();
        LastName = SecondNames(FirstName);
        String NameFinal = FirstName + " " + LastName + " " + TitleName();

        System.out.print(NameFinal);



    }


    public static String FirstNames(String partone){
        Random generate = new Random();
        int i = generate.nextInt(50);

        String[] FullName = new String [50];
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
        FullName[22] = "Venom";
        FullName[23] = "Blaze";
        FullName[24] = "Rebel";
        FullName[25] = "Ghost";
        FullName[26] = "Savage";
        FullName[27] = "Cobra";
        FullName[28] = "Inferno";
        FullName[29] = "Rogue";
        FullName[30] = "Thunder";
        FullName[31] = "Shogun";
        FullName[32] = "Wicked";
        FullName[33] = "Bronze";
        FullName[34] = "Viper";
        FullName[35] = "Mystic";
        FullName[36] = "Fury";
        FullName[37] = "Samurai";
        FullName[38] = "Razor";
        FullName[39] = "Eclipse";
        FullName[40] = "Titan";
        FullName[41] = "Onyx";
        FullName[42] = "Serpent";
        FullName[43] = "Wraith";
        FullName[44] = "Hawk";
        FullName[45] = "Volcanic";
        FullName[46] = "Prophet";
        FullName[47] = "Jackal";
        FullName[48] = "Omega";
        FullName[49] = "Zen";

        String full = FullName[generate.nextInt(50)];
        while (full.equals(partone)) {
           // full = FullName
        }
        return FullName[i];

    }

    public static String SecondNames(String other){
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
           is_equals = picked.equals(other);
        }
        return picked;
    }

    public static String TitleName(){
        Random generate = new Random();
        int b = generate.nextInt(0, 50);
        String[] Titles = new String[50];
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
        Titles[11] = "The Sword Scholar";
        Titles[12] = "The Venomous Sage";
        Titles[13] = "Keeper of the 36 Chambers";
        Titles[14] = "The Shaolin Architect";
        Titles[15] = "The Midnight Enforcer";
        Titles[16] = "Ruler of the Wu";
        Titles[17] = "The Ghost Assassin";
        Titles[18] = "The Forbidden One";
        Titles[19] = "Protector of the Clan";
        Titles[20] = "The Grim Philosopher";
        Titles[21] = "The Temple Watcher";
        Titles[22] = "Master of the Iron Fist";
        Titles[23] = "The Lyrical Samurai";
        Titles[24] = "Warden of the East";
        Titles[25] = "The Crown Holder";
        Titles[26] = "The Celestial Monk";
        Titles[27] = "Slayer of the Wicked";
        Titles[28] = "The Street Ronin";
        Titles[29] = "The Ruthless Tactician";
        Titles[30] = "Voice of the Ancestors";
        Titles[31] = "The Jade Emperor";
        Titles[32] = "The War Poet";
        Titles[33] = "The Unseen Hand";
        Titles[34] = "Disciple of Chaos";
        Titles[35] = "The Dragon Whisperer";
        Titles[36] = "The Bone Collector";
        Titles[37] = "The Grandmaster";
        Titles[38] = "Herald of the Storm";
        Titles[39] = "The Night Phantom";
        Titles[40] = "The Bloodline King";
        Titles[41] = "The Fifth Element";
        Titles[42] = "The Scroll Keeper";
        Titles[43] = "The Raw Diamond";
        Titles[44] = "The Concrete Prophet";
        Titles[45] = "The Final Boss";
        Titles[46] = "The Wu Disciple";
        Titles[47] = "The Apex Predator";
        Titles[48] = "The Hood Oracle";
        Titles[49] = "The Eternal Flame";

        return Titles[b];

    }
}


