package api;

public class SampleApiContent {
    private final long id;
    private final String name;
    private final String address;
    private final String zip;

    public SampleApiContent(long id, String name, String address, String zip) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.zip = zip;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getZip() {
        return zip;
    }
}
