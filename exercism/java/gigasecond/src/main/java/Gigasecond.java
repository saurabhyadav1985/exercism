import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {

	LocalDateTime moment;

	public Gigasecond(LocalDate moment) {
		this.moment = LocalDateTime.of(moment, LocalTime.MIDNIGHT);
	}

	public Gigasecond(LocalDateTime moment) {
		this.moment = moment;
	}

	public LocalDateTime getDateTime() {
		return moment.plusSeconds((long) Math.pow(10, 9));
	}
}
