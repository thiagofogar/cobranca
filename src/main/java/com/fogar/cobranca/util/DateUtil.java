package com.fogar.cobranca.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class DateUtil {

	public static LocalDate toLocalDate(Date date) {
		return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public static String format(LocalDate date) {
		return DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(new Locale("pt", "br")).format(date);
	}
}
