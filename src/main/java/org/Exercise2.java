package org;

public class Exercise2 {
    public static int sum(int one , int two) {
        return one + two;
        //System.out.println(total);
    }

    public static void Avengers(int roster){

        if (roster > 4 || roster < 0 ){
            System.out.println("I said five dummy");
            return;
        }
        String[] Assemble = new String[5];
        Assemble[0] = "Spiderman";
        Assemble[1] = "Thor";
        Assemble[2] = "Sentry";
        Assemble[3] = "Tony Stark";
        Assemble[4] = "Hulk";
        System.out.println(Assemble[roster]);

    }

    public static void JLA(){
        String[] League = new String[5];
        League[0] = "Aquaman";
        League[1] = "Superman";
        League[2] = "The Flash";
        League[3] = "Batman";
        League[4] = "Wonder Woman";
//        for (int i =0; i < 5; i= i+1){
//            System.out.println(League[i]);
//        }

        while (true){
            System.out.println(League[3]);
        }
    }

    public static void main(){

        int variable_one = 2;
        int variable_two = 3;
        int variable_result = sum(variable_one, variable_two);
        System.out.println(variable_result);
        if (variable_result == 6){
            System.out.println("Yes, the answer is five!");
        }
        Avengers(4);
        Avengers(6);
        JLA();
        String word = "Ho Yeah!";
        System.out.println(word);
        int variable_three = 69;
        int variable_four = 67;
        int variable_result2 = variable_three + variable_four;
        int variable_five = 14;
        int variable_six = 12;
        int variable_result3 = variable_five + variable_six;
        int results = 5 + 4;
//        sum(6, 7);
 //      sum(variable_one, variable_two);
//        sum(6,7);
     String Game_title = "Dak and the power of juju";
    System.out.println(sum(6,7));
      // System.out.println(variable_result2);
      // System.out.println(Game_title);

    }


}
