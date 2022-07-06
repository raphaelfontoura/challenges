package JavaDateAndTime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;

public class FindDayWeek {

  public static String findDay(int month, int day, int year) {
    Calendar date = Calendar.getInstance(Locale.US);
    date.set(year, month-1, day);

    String dayWeek = date.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();

    return dayWeek;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int month = Integer.parseInt(firstMultipleInput[0]);

    int day = Integer.parseInt(firstMultipleInput[1]);

    int year = Integer.parseInt(firstMultipleInput[2]);

    String res = FindDayWeek.findDay(month, day, year);

    System.out.println(res);

    // bufferedWriter.write(res);
    // bufferedWriter.newLine();

    bufferedReader.close();
    // bufferedWriter.close();
  }

}
