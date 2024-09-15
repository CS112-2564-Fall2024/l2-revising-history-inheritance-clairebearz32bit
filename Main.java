/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String description = "There was a riot at a New York bar called the Stonewall, that was run by the mafia. The event occured when police raided the bar.";
		String revised1 = "At a New York gay bar, there was a rebellion that kickstarted the primary gay rights movement in the 1960s and 1970s. The protests lasted over six days.";
		String revised2 = "A year after the initial protests, the first pride parade was held.";
		String citation = "https://guides.loc.gov/lgbtq-studies/stonewall-era";
		HistoricalEvent[] events = { new HistoricalEvent(description, new Date(6, 28, 1969)),
				new RevisedHistoricalEvent(description, new Date(6, 28, 1969), revised1, citation),
				new RevisedHistoricalEvent(description, new Date(6, 28, 1970), revised2, citation) };
		sort(events);

		for (HistoricalEvent event : events) {
			event.teach();
		}
	}
	
	private static void sort(HistoricalEvent[] array) {
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i].compareTo(array[i+1]) > 0) {
					HistoricalEvent temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
	}
}