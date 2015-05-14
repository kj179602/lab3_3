package edu.iis.mto.time;

import org.joda.time.DateTime;

public class DateTimeSourceImp implements DateTimeSource{

	@Override
	public DateTime getDateTime() {
		return new DateTime();
	}
}
