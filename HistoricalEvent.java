public class HistoricalEvent {
    private String description;
    private Date eventDay;

    public HistoricalEvent() {
        this.description = "None";
        this.eventDay = new Date();
    }

    public HistoricalEvent(String description, Date eventDay) {
        this.description = description;
        this.eventDay = eventDay;
    }

    public String getDescription() {
        return this.description;
    }

    public Date getEventDay() {
        return this.eventDay;
    }

    @Override
    public String toString() {
        return getEventDay().toString() + " --- " + getDescription();
    }

    public void teach() {
        System.out.println("====================================================");
        System.out.println("HISTORICAL EVENT EXAMPLE:");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }

    public int compareTo(Object obj) {
        if (obj instanceof HistoricalEvent) {
            HistoricalEvent event = (HistoricalEvent) obj;

            if (getEventDay().precedes(event.getEventDay())) {
                return -1;
            }

            if (getEventDay().equals(event)) {
                return 0;
            }

            return 1;
        }

        return -1;
    }
}
