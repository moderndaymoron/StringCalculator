package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
			if(text.isEmpty()){
				return 0;
			}
			else if(text.contains(",")){
				String[] str = text.split(",");
				return Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
			}
			else{
				return 1;
			}
	}

}
