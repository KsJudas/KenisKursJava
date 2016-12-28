import java.util.Scanner;
public class Zad1 {
public static void main (String[] args){
	Scanner skan = new Scanner(System.in);
	System.out.print("Podaj cyfrę: ");
	int a = skan.nextInt();
	int tab[] = new int [a+1];
	System.out.println("Liczby pierwsze to: ");
		for (int i=2; i<=a; i++){
		for	(int x=2; x<i; x++){ 	
		if (i%x == 0){tab[i] = i; break;}}
		int n=i-tab[i];
		if(n>0) {System.out.print(n +" ");}}}}

