public class RevisedHistoricalEvent extends HistoricalEvent {
    private String revisedDescription;
    private String citation;

    public RevisedHistoricalEvent() {
        super();

        this.revisedDescription = "None";
        this.citation = "None";
    }

    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) {
        super(description, eventDay);

        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }

    public String getRevisedDescription() {
        return this.revisedDescription;
    }

    public String getCitation() {
        return this.citation;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + getRevisedDescription() + " \n " + getCitation();

    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!super.equals(obj)) {
            return false;
        }

        if (!(obj instanceof RevisedHistoricalEvent)) {
            return false;
        }

        RevisedHistoricalEvent event = (RevisedHistoricalEvent) obj;

        return this.revisedDescription.equals(event.revisedDescription) && this.citation.equals(event.citation);
    }
    public void teach() {
        System.out.println("====================================================");
        System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }
}
