import java.util.Arrays;

public class Min {

public static void main (String args[]) {

int a []= {12,33,25,-11,66,78,89,99};
	
int min=Arrays.stream(a).min().getAsInt(); 

System.out.println(min);	
	
}	
}
