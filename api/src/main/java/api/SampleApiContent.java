package api;

public class SampleApiContent {
    private final long id;
    private final String first_name;
    private final String last_name;
    private final SampleApiAddress address;

    public SampleApiContent(long id, String first_name, String last_name, SampleApiAddress address) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public SampleApiAddress getAddress() {
        return address;
    }

}
