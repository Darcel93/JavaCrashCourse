package Lessons;

public class Loops {
    static void main() {
        //ForLoops();
        //ForLoopExercise();
        //ForLoopBreak();
        ForLoopContinue();

    }

    static void ForLoops(){
        for(int i = 1; i <= 20; i = i + 1){  //i + 1 is the same as i++
          System.out.print(i + " ");
        }
    }

    static void ForLoopExercise(){
        int i = 1;
        for(char a = 'a'; a <= 'z'; a++, i++){
            //i = i + 1;
            System.out.println(i + " " + " " + a + " "); // can also print (i++ + " " + " " + a + " ") for the same results
            //i = i + 1;
        }
    }

    static void ForLoopBreak(){
        for(int uno = 0; uno <= 100; uno++){
            System.out.println(uno);
            if(uno == 20){
               break;
            }
        }
    }

    static void ForLoopContinue(){
        for(int fiddy = 0; fiddy <= 50; fiddy++){
            System.out.println("Current Value: " + fiddy);
            if(fiddy != 50){
                continue;
            }
            System.out.println(fiddy);
        }

    }
}

