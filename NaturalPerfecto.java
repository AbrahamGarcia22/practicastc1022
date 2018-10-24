import java.util.*;
//identifica si es natural perfecto
public class NaturalPerfecto{
	public static void main(String[]args){
int num=0;
int count=1;
int suma=0;
Scanner kb= new Scanner(System.in);
System.out.println("Ingresa el numero");
num=kb.nextInt();
for(count=1;(count<num);count++){
	if(num%count==0){
		suma=suma+count;
	}//end if
}//end for
if(suma==num){
	System.out.println("Es natural perfecto");
}//end if
else{
	System.out.println("No es natural perfecto");
}//end else



}
}