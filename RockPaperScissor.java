import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\nLet's play Rock Paper Scissor.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissor.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String option=scan.nextLine();
        if(option.equals("yes")||option.equals("YES")){
            System.out.println("Great! rock – paper – scissor, shoot!\n");
            String yourChoice=scan.nextLine();
            String computerAnswer=computerChoice();
            String finalResult= result(yourChoice, computerAnswer);
            printResult(yourChoice,computerAnswer,finalResult);
        }
        else{
            System.out.println("Darn, some other time...!\n");
            System.exit(0);
        }
        scan.close();
    }
    public static String computerChoice(){
        double answer=Math.random()*3;
        answer++;
        String finalAnswer="";
        if((int)answer==1){
            finalAnswer="rock";
        }
        else if((int)answer==2){
            finalAnswer="paper";
        }
        else if((int)answer==3){
            finalAnswer="scissor";
        } 
        return finalAnswer;  
    }
    public static String result(String yourChoice,String computerAnswer){
        String result="";
        if((yourChoice.equals("rock") && computerAnswer.equals("scissor"))
            ||(yourChoice.equals("paper")&& computerAnswer.equals("rock"))
            ||(yourChoice.equals("scissor")&& computerAnswer.equals("paper"))){
                result="You Win";
            }
        else if((computerAnswer.equals("rock") && yourChoice.equals("scissor"))
        ||(computerAnswer.equals("paper")&& yourChoice.equals("rock"))
        ||(computerAnswer.equals("scissor")&& yourChoice.equals("paper"))){
                result="You loose";
        }
        else if((yourChoice.equals("rock") && computerAnswer.equals("rock"))
        ||(yourChoice.equals("paper")&& computerAnswer.equals("paper"))
        ||(yourChoice.equals("scissor")&& computerAnswer.equals("scissor"))){
                result= "It's a draw.";
        }
        return result;
    }
    public static void printResult(String yourChoice, String computerAnswer,String finalResult){
        System.out.println("\nYou chose: "+ yourChoice);
        System.out.println("\nThe computer chose: "+ computerAnswer);
        System.out.println("\nResult of the match: "+finalResult+"\n");
    }
    
}
