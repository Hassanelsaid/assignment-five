package eg.edu.alexu.csd.datastructure.stack;

import java.util.Scanner;
public class UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stk s = new stk();
		s.u=s.m;
		while(true) {
		System.out.println("choose a number : \r\n"+"1: Push\r\n" + 
				"2: Pop\r\n" + 
				"3: Peek\r\n" + 
				"4: Get size\r\n" + 
				"5: Check if empty");

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while((num==2&&s.isEmpty())||(num==3&&s.isEmpty())||(num!=1&&num!=2&&num!=3&&num!=4&&num!=5)) {
			System.out.println("ERROR!\r\n"+"enter another number\r\n");
			num = in.nextInt();
		}
		if(num==1) {
			System.out.println("Enter a number  :\r\n"+"1: int \r\n"+"2: char \r\n"+"3: string \r\n");
			Scanner inn= new Scanner(System.in);
			int nm = inn.nextInt();
			
			if(nm==1) {
				Scanner im= new Scanner(System.in);
				int inm = im.nextInt();
				s.push(inm);
			}
			if(nm==2) {
				Scanner is= new Scanner(System.in);
				char g = is.next().charAt(0);
				s.push(g);
			}
			if(nm==3) {
				Scanner ir= new Scanner(System.in);
				String ge = ir.nextLine();
				s.push(ge);
			}
			
		}
		if(num==2) {
			s.pop();
					}
		if(num==3) {
			System.out.println(s.peek());
		}
		if(num==4) {
			System.out.println(s.size());
		}
		if(num==5) {
			System.out.println(s.isEmpty());
		}
		System.out.println("if you want to do any method again enter 1 else 2 if you wannt to print enter 3  ");
		Scanner imr= new Scanner(System.in);
		int inmr = imr.nextInt();
		if(inmr==2) {
			break;
		}
		if(inmr==3) {
			stk r= new stk();
			if(s.m.value!=null) {
			r.u=s.u;
			}
			else {
				r.u=s.m;
			}
			while(r.u!=null) {
				System.out.println(r.u.value);
				r.u=r.u.next;			}
		}

	}
}
}