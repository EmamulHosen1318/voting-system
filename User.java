package vote;

public class User {
    private String name;
    private String mobile;
    private String address;

    public User(String name,String mobile,String address)
    {
        this.name=name;
        this.mobile=mobile;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Override....
    public String toString()
    {
        return "User [name="  +name +",mobile="+ mobile +",address="+address+ "]";
    }

}
