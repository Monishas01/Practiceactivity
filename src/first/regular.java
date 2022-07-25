//regular expression
package first;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regular {
	public static void main(String[] args) {
	      String inputString = "She sells sea shells on the sea shore with shells";
	      //obtain a Pattern object
	      Pattern pattern = Pattern.compile("shells");
	       
	      // obtain a matcher object
	       System.out.println("input string: " + inputString);
	      Matcher matcher = pattern.matcher(inputString); 
	      inputString = matcher.replaceFirst("pearls");
	      System.out.println("\nreplaceFirst method:" + inputString);
	      //use replaceAll method to replace all occurrences of pattern
	      inputString = matcher.replaceAll("pearls");
	      System.out.println("\nreplaceAll method:" + inputString);
	   }
}

 
