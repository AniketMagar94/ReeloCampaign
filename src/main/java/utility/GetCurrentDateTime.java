// To use current time for stamping on the screenshots.

package utility;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import testBase.TestBase;

public class GetCurrentDateTime extends TestBase{
    
    
    public static String CurrentDateTime() {
    	LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HH"+"_"+"mm"+"_"+"ss");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }
}
