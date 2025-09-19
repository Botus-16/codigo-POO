import java.util.Scanner;
public class tarea1{
	public static void main(String args[]){
		Scanner leer = new Scanner(System.in);
		System.out.println("Digite su año, mes y dia de nacimiento");
		short year =leer.nextShort();
		byte month =leer.nextByte();
		byte day =leer.nextByte();
		if (month==1){
			if (day>=1 & day<=19){
				System.out.println("Usted es un capricornio de "+(2025-year)+" años");
			}
			else if (day>=20 & day<=31){
				System.out.println("Usted es un acuario de "+(2025-year)+" años");
			}
			else{
				System.out.println("Bro, en el planeta TIERRA enero tiene 31 dias");
			}	
		}
		else if (month==2){
			if (day>=1 & day<=18){
				System.out.println("Usted es un acuario de "+(2025-year)+" años");
			}
			else if (day>=19 & day<=29){
				System.out.println("Usted es un piscis de "+(2025-year)+" años");
			}
			else{
				System.out.println("Bro, en el planeta TIERRA febrero tiene 28 o 29 dias");
			}	
		}
		else if (month==3){
			if (day>=1 & day<=20){
				System.out.println("Usted es un piscis de "+(2025-year)+" años");
			}
			else if (day>=21 & day<=30){
				System.out.println("Usted es un aries de "+(2025-year)+" años");
			}
			else{
				System.out.println("Bro, en el planeta TIERRA marzo tiene 30 dias");
			}	
		}
		else if (month==4){
			if (day>=1 & day<=19){
				System.out.println("Usted es un aries de "+(2025-year)+" años");
			}
			else if (day>=20 & day<=31){
				System.out.println("Usted es un tauro de "+(2025-year)+" años");
			}
			else{
				System.out.println("Bro, en el planeta TIERRA marzo tiene 31 dias");
			}
		}
		else if (month==5){
			if (day>=1 & day<=20){
				System.out.println("Usted es un tauro de "+(2025-year)+" años");
			}
			else if (day>=21 & day<=30){
				System.out.println("Usted es un geminis de "+(2025-year)+" años");
			}
			else{
				System.out.println("Bro, en el planeta TIERRA mayo tiene 30 dias");
			}	
		}
		else if (month==6){
			if (day>=1 & day<=20){
				System.out.println("Usted es un geminis de "+(2025-year)+" años");
			}
			else if (day>=21 & day<=31){
				System.out.println("Usted es un cancer de "+(2025-year)+" años");
			}
			else{
				System.out.println("Bro, en el planeta TIERRA junio tiene 31 dias");
			}
		}
		else if (month==7){
			if (day>=1 & day<=22){
				System.out.println("Usted es un cancer de "+(2025-year)+" años");
			}
			else if (day>=23 & day<=30){
				System.out.println("Usted es un leo de "+(2025-year)+" años");
			}
			else{
				System.out.println("Bro, en el planeta TIERRA julio tiene 30 dias");
			}
		}
		else if (month==8){
			if (day>=1 & day<=22){
				System.out.println("Usted es un leo de "+(2025-year)+" años");
			}
			else if (day>=23 & day<31){
				System.out.println("Usted es un virgo de "+(2025-year)+" años");
			}
			else{
				System.out.println("Bro, en el planeta TIERRA agosto tiene 31 dias");
			}	
		}
		else if (month==9){
			if (day>=1 & day<=22){
				System.out.println("Usted es un virgo de "+(2025-year)+" años");
			}
			else if (day>=23 & day<30){
				System.out.println("Usted es un libra de "+(2025-year)+" años");
			}
			else{
				System.out.println("Bro, en el planeta TIERRA septiembre tiene 30 dias");
			}	
		}
		else if (month==10){
			if (day>=1 & day<=22){
				System.out.println("Usted es un libra de "+(2025-year)+" años");
			}
			else if (day>=23 & day<=31){
				System.out.println("Usted es un escorpio de "+(2025-year)+" años");
			}
			else{
				System.out.println("Bro, en el planeta TIERRA octubre tiene 31 dias");
			}
		}
		else if (month==11){
			if (day>=1 & day<21){
				System.out.println("Usted es un escorpio de "+(2025-year)+" años");
			}
			else if (day>=22 & day<=30){
				System.out.println("Usted es un sagitario de "+(2025-year)+" años");
			}
			else{
				System.out.println("Bro, en el planeta TIERRA noviembre tiene 30 dias");
			}
		}		
		else if (month==12){
			if (day>=1 & day<=21){
				System.out.println("Usted es un sagitario de "+(2025-year)+" años");
			}
			else if (day>=22 & day<=31){
				System.out.println("Usted es un capricornio de "+(2025-year)+" años");
			}
			else{
				System.out.println("Bro, en el planeta TIERRA diciembre tiene 31 dias");
			}
		}
		else{
			System.out.println("Solo existen 12 meses");
		}
	}
}