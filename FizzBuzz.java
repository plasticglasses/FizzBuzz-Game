import java.util.Scanner;

public class FizzBuzz {
	public static void main(String args[]){
		Scanner ET = new Scanner(System.in);
		System.out.println("Welcome to the game Fizz Buzz");
		int change=10, flag=5;
			while ((change==10)&&(flag==5)){
				int fizz, buzz, num, modulus;
				System.out.println("please input a value for a fizz...");
				fizz=ET.nextInt();
				System.out.println("please input a value of buzz...");
				buzz=ET.nextInt();
					
					while (flag == 5){
										
						System.out.println("please input a number...");
						num=ET.nextInt();
					
						modulus = num%fizz;
					
						if (modulus==0){
							System.out.println("Fizz");
						}
					
						modulus=num%buzz;
					
						if (modulus==0){
							System.out.println("Buzz");
						}
						int yes, loop=80;
						
						while (loop==80){
						
							System.out.print(("do you want to play again press ") + ("0 for no,") +(" 1 for yes, ")+("or 2 to change FizzBuzz values"));
							yes = ET.nextInt();
						
							switch (yes){
							case 0:
								change=10;
								flag=0;
								System.out.println("thanks for playing");
								loop=40;
								break;
							case 1:
								flag=5;
								change=10;
								loop=40;
								break;
							case 2:
								flag=5;
								change=1;
								loop=40;
								break;
							default:
								System.out.println("please enter 0 or 1 or 2");		
								
								break;
							}
						}
					}
			}
	}
}
						
						
						
					///	if (yes==1){
							flag=5;
							change=10;
						}
						if (yes==2){
							flag=5;
							change=1;
						}
						if (yes==0){
							change=10;
							flag=0;
							System.out.println("thanks for playing");
							}else{
						}
						
							
						}
					}
		}	
	}

///

}
*/