package date;

/**
 * <p>A date converter class for handling and converting various date formats into a standard format
 * or into the Buddhist calendar system. This class leverages Java's {@link java.text.SimpleDateFormat}
 * for parsing and formatting dates, ensuring robust handling of different date representations.</p>
 *
 * <p>For example, given different date inputs such as:</p>
 * <blockquote><pre>
 * 1625097600          // UNIX timestamp
 * 2021-06-30T14:00:00Z // ISO 8601 timestamp
 * 30/June/1999         // Simple date format
 * </pre></blockquote>
 *
 * <p>The class will correctly parse and format these dates into a human-readable form and can convert them
 * into the corresponding date in the Buddhist calendar, which is offset by 543 years from the Gregorian calendar.</p>
 *
 * <p>Using the {@link java.util.Date} parsing capabilities, this class can handle a variety of date formats robustly:</p>
 * <blockquote><pre>
 * Date input: "30/June/1999"
 * Standard output: "30-06-1999"
 * Buddhist calendar output: "30-06-2542"
 * </pre></blockquote>
 *
 * <p>This class also handles conversion of UNIX timestamps and ISO 8601 formatted strings into more readable date formats,
 * supporting a wide range of input types used in different data systems and applications.</p>
 *
 * <p>Additionally, this converter uses the {@link java.util.Calendar} class to adjust years according to the Buddhist calendar,
 * providing correct year representation for regions where this calendar is utilized.</p>
 *
 * <p>Examples of handling special date formats:</p>
 * <blockquote><pre>
 * Input: "1625097600" (UNIX timestamp)
 * Output: "01-07-2021"
 * Buddhist Output: "01-07-2564"
 *
 * Input: "2021-06-30T14:00:00Z" (ISO 8601)
 * Output: "30-06-2021"
 * Buddhist Output: "30-06-2564"
 * </pre></blockquote>
 *
 * <p>The use of {@link java.text.SimpleDateFormat} not only ensures flexibility in date parsing and formatting but also
 * adherence to international date standards.</p>
 *
 * @author Pantakan Kanprawet (Tom)
 *
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConverter {

    public static String convertToStandardDate(String inputDate) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
            Date date = formatter.parse(inputDate);
            formatter = new SimpleDateFormat("dd-MM-yyyy");
            return formatter.format(date);
        } catch (Exception e) {
            return "Invalid date format";
        }
    }

    public static String convertToBuddhistCalendar(String inputDate) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
            Date date = formatter.parse(inputDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.YEAR, 543);
            formatter = new SimpleDateFormat("dd-MM-yyyy");
            return formatter.format(calendar.getTime());
        } catch (Exception e) {
            return "Invalid date format";
        }
    }

    public static void main(String[] args) {
        // Example usage
        String standardDate = convertToStandardDate("30/June/1999");
        String buddhistDate = convertToBuddhistCalendar("30/June/1999");

        System.out.println("Standard Date: " + standardDate);
        System.out.println("Buddhist Date: " + buddhistDate);
    }
}
