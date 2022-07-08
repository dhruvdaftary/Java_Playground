import java.io.*;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */


    public static String findDay(int month, int day, int year) {
        {
            String date = String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year);
            //return date;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH);
            try{
                Date myDate = sdf.parse(date);
                sdf.applyPattern("EEEE");
                String sMyDate = sdf.format(myDate);
                String c_sMyDate = sMyDate.toUpperCase();
                return c_sMyDate;
            }catch (ParseException e){
                return date;
            }

        }
    }

}

public class java_date_and_time {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
