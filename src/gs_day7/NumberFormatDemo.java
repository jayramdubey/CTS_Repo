package gs_day7;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		 double d = 123456.789; 
		 
		 NumberFormat nfobj = NumberFormat.getInstance(Locale.ITALY);
		 System.out.println("ITALY representation of " + d + " : " + nfobj.format(d)); 
		 
		 NumberFormat obUs = NumberFormat.getInstance(Locale.US);
		 System.out.println("US representation of " + d + " :    "+obUs.format(d));

	}

}
