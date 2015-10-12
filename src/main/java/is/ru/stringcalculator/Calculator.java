package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
			if(text.isEmpty()){
				return 0;
			}
			else if(text.contains(",")){
				String[] str = text.split(",");
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
