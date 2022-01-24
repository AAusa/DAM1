package cadenas;

import java.util.Scanner;

public class Ej11 {
	public static void main(String[]args) {
		String texto;
		int longitud;
		char caracter=0;
		String mayus;
		int nveces=0;
		int repetido=0;
		String cadena="";
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,ñ=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
		
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("texto en mayus:");
		texto = teclado.nextLine();
		longitud = texto.length();
		mayus= texto.toUpperCase();
		
		if(mayus==texto && longitud<61) {
			for(int contador=0;contador<longitud;contador++) {
				caracter=texto.charAt(contador);
				switch(caracter) {
				case 'A':
					a+=1;break;
				case 'B':
					b+=1;break;
				case 'C':
					c+=1;break;
				case 'D':
					d+=1;break;
				case 'E':
					e+=1;break;
				case 'F':
					f+=1;break;
				case 'G':
					g+=1;break;
				case 'H':
					h+=1;break;
				case 'I':
					i+=1;break;
				case 'J':
					j+=1;break;
				case 'K':
					k+=1;break;
				case 'L':
					l+=1;break;
				case 'M':
					m+=1;break;
				case 'N':
					n+=1;break;
				case 'Ñ':
					ñ+=1;break;
				case 'O':
					o+=1;break;
				case 'P':
					p+=1;break;
				case 'Q':
					k+=1;break;
				case 'R':
					r+=1;break;
				case 'S':
					s+=1;break;
				case 'T':
					t+=1;break;
				case 'U':
					u+=1;break;
				case 'V':
					v+=1;break;
				case 'W':
					w+=1;break;
				case 'X':
					x+=1;break;
				case 'Y':
					y+=1;break;
				case 'Z':
					z+=1;break;
				}	
				switch(caracter) {
				case 'A':
					if(a>1) {
						repetido=repetido+1;
					};break;
				case 'B':
					if(b>1) {
						repetido=repetido+1;
					};break;
				case 'C':
					if(c>1) {
						repetido=repetido+1;
					};break;
				case 'D':
					if(d>1) {
						repetido=repetido+1;
					};break;
				case 'E':
					if(e>1) {
						repetido=repetido+1;
					};break;
				case 'F':
					if(f>1) {
						repetido=repetido+1;
					};break;
				case 'G':
					if(g>1) {
						repetido=repetido+1;
					};break;
				case 'H':
					if(h>1) {
						repetido=repetido+1;
					};break;
				case 'I':
					if(i>1) {
						repetido=repetido+1;
					};break;
				case 'J':
					if(j>1) {
						repetido=repetido+1;
					};break;
				case 'K':
					if(k>1) {
						repetido=repetido+1;
					};break;
				case 'L':
					if(l>1) {
						repetido=repetido+1;
					};break;
				case 'M':
					if(m>1) {
						repetido=repetido+1;
					};break;
				case 'N':
					if(n>1) {
						repetido=repetido+1;
					};break;
				case 'Ñ':
					if(ñ>1) {
						repetido=repetido+1;
					};break;
				case 'O':
					if(o>1) {
						repetido=repetido+1;
					};break;
				case 'P':
					if(p>1) {
						repetido=repetido+1;
					};break;
				case 'Q':
					if(q>1) {
						repetido=repetido+1;
					};break;
				case 'R':
					if(r>1) {
						repetido=repetido+1;
					};break;
				case 'S':
					if(s>1) {
						repetido=repetido+1;
					};break;
				case 'T':
					if(t>1) {
						repetido=repetido+1;
					};break;
				case 'U':
					if(u>1) {
						repetido=repetido+1;
					};break;
				case 'V':
					if(v>1) {
						repetido=repetido+1;
					};break;
				case 'W':
					if(w>1) {
						repetido=repetido+1;
					};break;
				case 'X':
					if(x>1) {
						repetido=repetido+1;
					};break;
				case 'Y':
					if(y>1) {
						repetido=repetido+1;
					};break;
				case 'Z':
					if(z>1) {
						repetido=repetido+1;
					};break;
				}
					
				nveces=nveces+1;
				
			}
			


			System.out.println("caracteres distintos: "+nveces);
			System.out.println("caracteres repetidos: "+repetido);	
		}
		else {
			System.out.println("En mayus y <61 carac ");
		}	
	}	
}

