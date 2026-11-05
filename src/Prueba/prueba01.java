//Cada retrato robot está formado por cuatro líneas de texto
//en cada línea se muestra un rasgo del retrato robot
//en el orden siguiente de arriba hacia abajo: pelo, ojos, orejas/nariz, boca y barbilla.
//Para crear un retrato robot, el usuario podrá elegir una de las opciones siguientes para cada uno de los rasgos:

package Prueba;

import java.util.Scanner;

public class prueba01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				
		System.out.println("Elige un pelo, introduciendo un número de 1-4: ");
		System.out.println("Opción 1: WWWWWWWWW");
		System.out.println("Opción 2: \\\\\\//////");
		System.out.println("Opción 3: \"|||||||\"");
		System.out.println("Opción 4: |||||||||");
		
		String peloDibu = "";
		int pelo = in.nextInt();
		if (pelo == 1)
			peloDibu = "WWWWWWWWW";
		else if (pelo == 2)	
			peloDibu = "\\\\\\//////";
		else if (pelo == 3)	
			peloDibu = "\"|||||||\"";
		else
			peloDibu = "|||||||||";
		
		System.out.println("Elige ojos, introduciendo un número de 1-4: ");
		System.out.println("Opción 1: |  o o  |");
		System.out.println("Opción 2: |-(· ·)-|");
		System.out.println("Opción 3: |-(o o)-|");
		System.out.println("Opción 4: | \\ / |");
		
		String ojosDibu = ""; 
		int ojos = in.nextInt();
		if (ojos == 1)
			ojosDibu = "|  o o  |"; 
		else if (ojos == 2)	
			ojosDibu = "|-(· ·)-|";
		else if (ojos == 3)	
			ojosDibu = "|-(o o)-|";
		else
			ojosDibu = "|  \\ /  |";
	
		System.out.println("Elige orejas/nariz, introduciendo un número de 1-4: ");
		System.out.println("Opción 1: @ J @");
		System.out.println("Opción 2: { \" }");
		System.out.println("Opción 3: [ j ]");
		System.out.println("Opción 4: < - >");
		
		String orejaDibu = "";
		int oreja = in.nextInt();
		if (oreja == 1)
			orejaDibu = " @ J @";
		else if (oreja == 2)	
			orejaDibu = " { \" }";
		else if (oreja == 3)	
			orejaDibu = " [ j ]";
		else
			orejaDibu = " < - >";
		
		System.out.println("Elige boca, introduciendo un número de 1-4: ");
		System.out.println("Opción 1: | === |");
		System.out.println("Opción 2: |  -  |");
		System.out.println("Opción 3: | ___ |");
		System.out.println("Opción 4: | --- |");
		
		String bocaDibu = "";
		int boca = in.nextInt();
		if (boca == 1)
			bocaDibu = "| === |";
		else if (boca == 2)	
			bocaDibu = "|  -  |";
		else if (boca == 3)	
			bocaDibu = "| ___ |";
		else
			bocaDibu = "| --- |";
		
		System.out.println("Elige barbilla, introduciendo un número de 1-4: ");
		System.out.println("Opción 1: \\_______/");
		System.out.println("Opción 2: \\,,,,,,,/");
		System.out.println("Opción 3: \\......./");
		System.out.println("Opción 4: \\mmmmmmm/");
		
		String barbiDibu = "";
		int barbilla = in.nextInt();
		if (barbilla == 1)
			barbiDibu = "\\_______/";
		else if (barbilla == 2)	
			barbiDibu = "\\,,,,,,,/";
		else if (barbilla == 3)	
			barbiDibu = "\\......./|";
		else
			barbiDibu = "\\mmmmmmm/";
		
		
		System.out.println("Tu robot es");
		System.out.println(peloDibu);
		System.out.println(ojosDibu);
		System.out.println(orejaDibu);
		System.out.println(bocaDibu);
		System.out.println(barbiDibu);

	}
	

}
