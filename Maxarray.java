import java.util.Arrays;

public class Maxarray {

public static void main(String args[]) {
 int a[]= {12,43,55,76,92,29};

int max=Arrays.stream(a).max().getAsInt(); 
	
System.out.println(max);
}	
}
