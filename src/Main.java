import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String response=" ";

    //MAIN METHOD
    public static void main(String[] args) {
        welcome();
        while(!response.equalsIgnoreCase("Q")){
            chooseReply(getInput());
        }
    }


    //SECONDARY METHODS
    public static void welcome(){
        System.out.print("hey. how are you feeling today? ");
    }

    public static String getInput(){
        response = sc.nextLine();
        return response;
    }

    public static void chooseReply (String response){

        //feelings
        String[] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};
        String[] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};

        int positiveCount = 0;
        int negativeCount = 0;

        //count +/- keywords
        for(int i=0; i<positive.length; i++) {
            if (response.contains(positive[i])) {
                positiveCount++;
            }
        }
        for(int i=0; i<negative.length; i++){
            if (response.contains(negative[i])) {
                negativeCount++;
            }
        }

        //reply
        if(positiveCount>negativeCount){
            System.out.print("must be nice. I can't relate.. anything else? ");
        }
        else if(positiveCount<negativeCount){
            System.out.print("Hah hah! tell me more! ");
        }
        else if(positiveCount==negativeCount && !response.equalsIgnoreCase("Q")){
            System.out.print("meh. what else? ");
        }
        else if(response.equalsIgnoreCase("Q")){
            //do nothing
        }
        else {
            System.out.print("what? ");
        }

    }


}
