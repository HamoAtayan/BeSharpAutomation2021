package automation.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 * Created By Hmayak on 2021, Sep, 02
 */
public class CommonHelper {

    private static final Logger LOG = LoggerFactory.getLogger(CommonHelper.class);
    private static final SecureRandom RANDOM = new SecureRandom();

    /**
     * Returns formatted date by pattern
     *
     * @param date        to be formatted
     * @param fromPattern from pattern
     * @param toPattern   to pattern
     * @return formatted date by pattern
     */
    public static String changeDateFormat(String date, String fromPattern, String toPattern) {
        DateTimeFormatter currentFormat = DateTimeFormatter.ofPattern(fromPattern);
        LocalDateTime localDateTime = LocalDateTime.parse(date, currentFormat);
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern(toPattern);
        return localDateTime.format(newFormat);
    }


    /**
     * Returns the current date with given date format
     *
     * @param format date format
     * @return date with given format as String
     */
    public static String getCurrentDate(String format) {
        LocalDateTime currentDate = LocalDateTime.now();
        return currentDate.format(DateTimeFormatter.ofPattern(format));
    }

    /**
     * Returns past date from given date to current date range with given format
     *
     * @param fromDate past date in MM/dd/yyyy format
     * @param format   date format
     * @return random date as string
     */
    public static String getRandomDate(String fromDate, String format) {
        String[] fromMmDdYyyy = fromDate.split("/");
        LocalDate from = LocalDate.of(Integer.parseInt(fromMmDdYyyy[2]), Integer.parseInt(fromMmDdYyyy[0]), Integer.parseInt(fromMmDdYyyy[1]));
        LocalDate to = LocalDate.now();
        long days = from.until(to, ChronoUnit.DAYS);
        long randomDays = (long) (RANDOM.nextDouble() * days);
        LocalDate randomDate = from.plusDays(randomDays);
        return getDateInFormat(randomDate, format);
    }

    /**
     * Method returns random date by adding (subtracting if given number is negative)
     * random number of days in the given range to current date
     *
     * @param daysRange the day range (i.e. if given 10 will generate 1 - 10 random number)
     * @return LocalDate type object
     */
    public static LocalDateTime getDateFromCurrentDateInRange(int daysRange) {
        LocalDateTime currentDate = LocalDateTime.now();
        return addDaysInRangeToDate(currentDate, daysRange);
    }

    /**
     * Method returns random date by adding (subtracting if given number is negative)
     * random number of days in the given range to current date
     *
     * @param daysRange the day range (i.e. if given 10 will generate 1 - 10 random number)
     * @param format    the date format
     * @return date as a String
     */
    public static String getDateFromCurrentDateInRange(int daysRange, String format) {
        LocalDateTime randomDate = getDateFromCurrentDateInRange(daysRange);
        return getDateInFormat(randomDate, format);
    }

    /**
     * Method returns random date by adding (subtracting if given number is negative)
     * random number of days in given range to given date
     *
     * @param date      given date to witch needs add random number of days
     * @param daysRange the days range (i.e. if given 10 will generate 1 - 10 random number)
     * @return LocalDate type object
     */
    public static LocalDateTime addDaysInRangeToDate(LocalDateTime date, int daysRange) {
        int randomDay = RANDOM.nextInt(Math.abs(daysRange)) + 1;
        return (daysRange > 0) ? date.plusDays(randomDay) : date.minusDays(randomDay);
    }

    /**
     * Method returns random date by adding (subtracting if given number is negative)
     * random number of days in given range to given date
     *
     * @param date      given date to witch needs add random number of days
     * @param daysRange the days range (i.e. if given 10 will generate 1 - 10 random number)
     * @param format    date format
     * @return date as String
     */
    public static String addDaysInRangeToDate(LocalDateTime date, int daysRange, String format) {
        return getDateInFormat(addDaysInRangeToDate(date, daysRange), format);
    }

    /**
     * Returns given date as String in given format
     *
     * @param date
     * @param format
     * @return date as String
     */
    public static String getDateInFormat(LocalDate date, String format) {
        return date.format(DateTimeFormatter.ofPattern(format));
    }

    /**
     * Returns given date as String in given format
     *
     * @param date
     * @param format
     * @return date as String
     */
    public static String getDateInFormat(LocalDateTime date, String format) {
        return date.format(DateTimeFormatter.ofPattern(format));
    }

    /**
     * Checks if the given file exists in the given path and deletes it if exists
     *
     * @param downloadsPath - the path starting from home, where the file should be
     * @param fileName      - file for which we are looking fore (downloaded file)
     * @param fileExtension - the file extension (pdf, csv, xlsx)
     * @return true if the file was found in the path otherwise returns false
     */
    public static boolean isFileDownloaded(String downloadsPath, String fileName, String fileExtension) {
        String homePath = System.getProperty("user.home");
        String filePath = String.format("%s/%s/%s.%s", homePath, downloadsPath, fileName, fileExtension);
        Path path = Paths.get(filePath);
        try {
            return Files.deleteIfExists(path);
        } catch (IOException e) {
            LOG.error(String.format("Could not delete '%s' file%n%s", filePath, e.getMessage()));
            return false;
        }
    }

    /**
     * Creates File object with given resource file
     *
     * @param fileName the resource file name
     * @return File object
     */
    public static File getResource(String fileName) {
        return new File(getResourcePath(fileName));
    }

    /**
     * Returns given resource file path
     *
     * @param fileName - name of resource file which path needs to return
     * @return the given file path in String format
     */
    public static String getResourcePath(String fileName) {
        return Objects.requireNonNull(CommonHelper.class.getClassLoader().getResource(fileName)).getFile();
    }

    /**
     * Generate random String with specified length by selecting random characters from given String
     *
     * @param charactersList the allowed characters list
     * @param length         length of the random String
     * @return random String
     */
    private static String getRandomString(String charactersList, int length) {
        int size = charactersList.length();
        StringBuilder stringBuilder = new StringBuilder();
        while (length-- != 0) {
            stringBuilder.append(charactersList.charAt(RANDOM.nextInt(size)));
        }
        return stringBuilder.toString();
    }

    /**
     * Creates random alpha numeric String with given length
     *
     * @param length - the length of random string
     * @return random String
     */
    public static String getRandomAlphaNumericString(int length) {
        return getRandomString("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789", length);
    }

    /**
     * Creates random numeric String with given length"
     *
     * @param length - the length of random string
     * @return random String
     */
    public static String getRandomNumericString(int length) {
        int min = (int) Math.pow(10, (length - 1));
        return String.valueOf((min + RANDOM.nextInt(9 * min)));
    }

    /**
     * Creates random numeric String with given length"
     *
     * @param length - the length of random string
     * @return random String
     */
    public static String getRandomAlphabeticString(int length) {
        return getRandomString("ABCDEFGHIJKLMNOPQRSTUVWXYZ", length);
    }


    private CommonHelper() {
        throw new UnsupportedOperationException("Not allowed to crate an instance of CommonHelper class");
    }

    public static void main(String[] args) {
        System.out.println(getRandomString("0123456789",20) + "@gmail.com");
    }

}
