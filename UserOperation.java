package vote;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserOperation {

    public void registration(VoterList voterList)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name.");
        String name=scan.nextLine();

        System.out.println("Please enter your mobile.");
        String mobile=scan.next();
        scan.nextLine();
        System.out.println("Please enter your address.");
        String address=scan.nextLine();

        User user =new User(name,mobile,address);
        System.out.println(user);

        voterList.setVoterList(user);
        voterList.totalVoter();
        System.out.println();
    }
    public void takeVote(VoterList voterList,Set<User>voted,List count)
    {
        System.out.println("Please enter your mobile number");
        Scanner scan=new Scanner(System.in);
        String mobile =scan.next();

        User user=voterList.findUser(mobile);
        if(user==null)
        {
            System.out.println("Plese Register First");
            return ;
        }
        int prevSize=voted.size();
        voted.add(user);
        if(prevSize==voted.size())
        {
            System.out.println("You have taken,try next year");
            return;
        }

        System.out.println("1 for Sabbir");
        System.out.println("2 for Mehedi");
        System.out.println("3 for Al amin");
        int v=scan.nextInt();
        count.add(v);
    }
}
