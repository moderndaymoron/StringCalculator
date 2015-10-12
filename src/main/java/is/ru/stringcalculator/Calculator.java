package is.ru.stringcalculator;
import java.io.*;
public class Calculator {

	public static int add(String text){
			if(text.isEmpty()){
				return 0;
			}

			else if(text.startsWith("//")){
				String newStr = text.substring(4);
				String[] str = newStr.split(text.substring(2,3));
				int sum = 0;
				for (int i = 0; i < str.length; i++){
					sum += Integer.parseInt(str[i]);
				}

				return sum;
			}

			else if(text.contains(",") | text.contains("\\n")){
				String[] str = text.split("[\\W]");
				int sum = 0;
				for (int i = 0; i < str.length; i++){
					sum += Integer.parseInt(str[i]);
				}

				return sum;
			}

			else{
				return Integer.parseInt(text);
			}
	}
}
