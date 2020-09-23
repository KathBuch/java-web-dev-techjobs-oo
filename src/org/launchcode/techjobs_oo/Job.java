package org.launchcode.techjobs_oo;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        new Job();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency= coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        if (id != job.id) return false;
        if (name != null ? !name.equals(job.name) : job.name != null) return false;
        if (employer != null ? !employer.equals(job.employer) : job.employer != null) return false;
        if (location != null ? !location.equals(job.location) : job.location != null) return false;
        if (positionType != null ? !positionType.equals(job.positionType) : job.positionType != null) return false;
        return coreCompetency != null ? coreCompetency.equals(job.coreCompetency) : job.coreCompetency == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (employer != null ? employer.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (positionType != null ? positionType.hashCode() : 0);
        result = 31 * result + (coreCompetency != null ? coreCompetency.hashCode() : 0);
        return result;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
