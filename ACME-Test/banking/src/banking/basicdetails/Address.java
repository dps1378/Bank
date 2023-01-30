package banking.basicdetails;

public class Address {
    private int H_no;
    private String b_name;
    private String city;
    private String street;
    private int pincode;



    public int getH_no() {
        return H_no;
    }

    public int getPincode() {
        return pincode;
    }

    public String getB_name() {
        return b_name;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Address(int hno, String bname, String city, String street, int pincode)
    {
        this.city=city;
        this.street=street;
        this.pincode=pincode;
        this.H_no=hno;
        this.b_name=bname;
    }
    public void set(int hno,String bname,String city,String street,int pincode)
    {
        this.city=city;
        this.street=street;
        this.pincode=pincode;
        this.H_no=hno;
        this.b_name=bname;
    }
}
