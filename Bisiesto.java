import java.util.*;
//identifica si es bisiesto o no
public class Bisiesto{
	public static void main(String[]args){
int a�o=0;
Scanner kb= new Scanner(System.in);
System.out.println("Ingresa el a�o");
a�o=kb.nextInt();
if ((a�o%4==0)&&(a�o%400==0)){
	System.out.println("Es bisiesto");
}
else if((a�o%4==0)&&(a�o%100==0)&&(!(a�o%400==0))){
	System.out.println("No es bisiesto");
}
}
}