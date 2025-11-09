package p1;
//c) What happens outside the package by becoming sub class [BY making Relation]"	
import p2.Teacher1;

public class student2 extends Teacher1
{
	
	//Protected only calling only by making relation b/w parent and child with extends keyword

	public static void main(String[] args) {
		student2 s2=new student2();
		s2.add();
		s2.sub(100);
		

	}

}
