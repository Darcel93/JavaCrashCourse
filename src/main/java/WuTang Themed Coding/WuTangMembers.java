package org.example;

public class WuTangMembers {
    static String[] WuTangMembers(){
        String[] WuTangList = new String[10];
        WuTangList[0] = "Rza";
        WuTangList[1] = "Gza";
        WuTangList[2] = "Ol' Dirty Bastard";
        WuTangList[3] = "Method Man";
        WuTangList[4] = "GhostFace Killah";
        WuTangList[5] = "Raekwon the Chef";
        WuTangList[6] = "UGod";
        WuTangList[7] = "Inspectah Deck";
        WuTangList[8] = "Masta Killa";
        WuTangList[9] = "Cappadonna";
         //return WuTangList;
     for (int i = 0; i < 10; i = i +1){
         System.out.println(WuTangList[i]);
     }
        return WuTangList;
    }
    static void main(){
        WuTangMembers();

    }

}

