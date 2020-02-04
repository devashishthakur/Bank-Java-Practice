
/**
 * @author Devashish Thakur
 * @version 1.0
 * @since 1.0
 */

public class Address
{
    private String houseNo;
    private String street;
    private String city;
    private int zipCode;

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Address(String houseNo, String street, String city, int zipCode) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

}