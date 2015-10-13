package is.ru.stringcalculator;
import java.io.*;
public class Calculator {

	final static int GREATESTNUMBER = 1000;
	public static int add(String text){
			if(text.isEmpty()){
				return 0;
			}
			else if(text.matches("(.*)-[1-9](.*)")){
				throw new RuntimeException("Negatives are not allowed:" + getNegatives(text));
			}

			else if(text.startsWith("//")){
				String newStr = text.substring(4);
				String[] str = newStr.split(text.substring(2,3));

				return returnSum(str);
			}

			else if(text.contains(",") | text.contains("\\n")){
				String[] str = text.split("[\\W]");
				return returnSum(str);
			}

			else{
				return Integer.parseInt(text);
			}
	}

	private static int returnSum(String[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++){
			if(Integer.parseInt(arr[i]) <= GREATESTNUMBER){
					sum += Integer.parseInt(arr[i]);
			}
		}

		return sum;
	}

	private static String getNegatives(String text){
		StringBuilder sb = new StringBuilder("");
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == '-'){
						if(!(sb.toString().equals(""))){
							sb.append(',');
						}
						sb.append('-');
						sb.append(text.charAt(i +1));
			}
		}
		return sb.toString();
	}
}
