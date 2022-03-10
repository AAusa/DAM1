package correcciónExamen;
import java.util.Scanner;
public class Ej2 {
	public static void main(String[] args) {





		String dni="";
		int num_dni=0;
		int op_dni=0;
		char let_cor=0;
		char let_int=0;
		boolean valido=false;

		Scanner teclado=new Scanner(System.in);




		while(valido==false) {
			System.out.println("dni");
			dni=teclado.nextLine();
			num_dni=Integer.parseInt(dni.substring(0,8));
			let_int=(char)(dni.charAt(8));

			if(num_dni>0 && num_dni<=100000000) {
				op_dni=num_dni % 23;

				switch(op_dni) {
				case 0:
					let_cor='T';break;
				case 1:
					let_cor='R';break;	
				case 2:
					let_cor='W';break;
				case 3:
					let_cor='A';break;
				case 4:
					let_cor='G';break;
				case 5:
					let_cor='M';break;
				case 6:
					let_cor='Y';break;
				case 7:
					let_cor='F';break;
				case 8:
					let_cor='P';break;
				case 9:
					let_cor='D';break;
				case 10:
					let_cor='X';break;
				case 11:
					let_cor='B';break;
				case 12:
					let_cor='N';break;
				case 13:
					let_cor='J';break;	
				case 14:
					let_cor='Z';break;
				case 15:
					let_cor='S';break;
				case 16:
					let_cor='Q';break;
				case 17:
					let_cor='V';break;
				case 18:
					let_cor='H';break;
				case 19:
					let_cor='L';break;
				case 20:
					let_cor='C';break;
				case 21:
					let_cor='K';break;
				case 22:
					let_cor='E';break;
				default:
					System.out.println("ERROR");break;
				}
				if(let_cor==let_int) {
					System.out.println("Formato correcto");
					valido=true;
				}
				else {
					valido=false;
				}
			}
			else {
				System.out.println("Formato erroneo");
			}
		}


	}
}
