
public class IfEx1 {
		public static void main(String[] args) {
			java.util.Scanner sc=new java .util.Scanner(System.in);
			
				System.out.println("Enter your age: ");
				int age=sc.nextInt();
			if(age<0 || age>120) {
				System.out.println("Invalid Age!!");
			}if(age>0 && age<=4) {
				System.out.println("You're Infant");
			}else if(age>=5 && age<=12) {
				System.out.println("You're  Child");
			}else if(age>=13 && age<=19) {
				System.out.println("You're  Teenager");
			}else if(age>=19 && age<=40) {
				System.out.println("You're  Adult");
			}else if(age>=41 && age<=80) {
				System.out.println("You're Old");
			}else if(age>80 && age<120) {
				System.out.println("You're dead");
				}
			    System.out.println("thank you");
			
		}
}
