package studenti;

public class Glavna {

	public static void main(String[] args) {
		Student Marko=new Student();
		Marko.setId(1);
		Marko.setIme("Marko");
		Marko.setGodine(18);
System.out.println("Reden broj" + Marko.getId() + "e studentot" +Marko.getIme()+"star" +Marko.getGodine()+ "godini");
	}

}
