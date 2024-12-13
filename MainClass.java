package vote;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class MainClass {

    public static void main(String[] args) {
        System.out.println("===============");
        System.out.println("Welcome To EVM");
        System.out.println("===============");

        VoterList voterList=new VoterList();
        UserOperation useOperation =new UserOperation();
        Set<User>voted =new HashSet<>();
        List<Integer>count =new ArrayList<>();
        while(true)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("Press 1 for Registration");
            System.out.println("Press 2 for Vote");
            System.out.println("Press 0 for Exit");
            int choice=scan.nextInt();
            if(choice==1)
            {
                useOperation.registration(voterList);
            }
            else if(choice==2)
            {
                useOperation.takeVote(voterList,voted,count);
            }
            else if(choice==0)
            {
                System.out.println("Thank you ,Application is shutting down....\n");
                break;
            }
            else
            {
                System.out.println("Please enter a valid choice.\n");
            }
        }
    }

}
