import java.util.*;
//identifica si es bisiesto o no
public class Bisiesto{
	public static void main(String[]args){
int año=0;
Scanner kb= new Scanner(System.in);
System.out.println("Ingresa el año");
año=kb.nextInt();
if ((año%4==0)&&(año%400==0)){
	System.out.println("Es bisiesto");
}
else if((año%4==0)&&(año%100==0)&&(!(año%400==0))){
	System.out.println("No es bisiesto");
}
}
}