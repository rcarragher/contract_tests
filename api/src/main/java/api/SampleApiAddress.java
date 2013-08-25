package api;

public class SampleApiAddress {
    private final String street;
    private final String zip;

    public SampleApiAddress(String street, String zip) {
        this.street = street;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public String getZip() {
        return zip;
    }
}
