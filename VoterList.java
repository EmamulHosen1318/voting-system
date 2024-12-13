package vote;
import java.util.ArrayList;

public class VoterList {

    private ArrayList<User>voterList=new ArrayList<>();

    public ArrayList<User> getVoterList() {
        return voterList;
    }

    public void setVoterList(User voterList) {
        this.voterList.add(voterList);

    }
    public void totalVoter()
    {
        System.out.println("Total Voter:"+this.voterList.size());
    }
    public User findUser(String mobile)
    {
        for(int i=0;i<this.voterList.size();i++)
        {
            User u=this.voterList.get(i);
            if(mobile.compareToIgnoreCase(u.getMobile())==0)
            {
                return u;
            }

        }
        return null;
    }


}
