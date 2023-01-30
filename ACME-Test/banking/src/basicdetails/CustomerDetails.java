package banking.basicdetails;

public class CustomerDetails {
    private String Name;
    private Address address;
    private String Mobile_no;
    private final String Aadhar_Id;
    public CustomerDetails(String Name,Address address,String Mobile_no,String Aadhar_Id)
    {
        this.Name=Name;
        this.address=address;
        this.Mobile_no=Mobile_no;
        this.Aadhar_Id=Aadhar_Id;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public String getMobile_no(){
        return Mobile_no;
    }
    public void setMobile_no(String Mobile_no)
    {
        this.Mobile_no=Mobile_no;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAadhar_Id() {
        return Aadhar_Id;
    }

}
