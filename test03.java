package execl;

public class test03 {
	public class UniqueLineReader extends BufferedReader {
		Set< String> lines = new HashSet< String>（）; 
		 public UniqueLineReader（Reader arg0）{
		 super（arg0）; 
		} 
	}
		 public static String test3（） {
		 String uniqueLine; 
		 if（lines.add（uniqueLine = super.readLine（）））
		 return uniqueLine; 
		 return""; 
		
	}

}
//去除重复行