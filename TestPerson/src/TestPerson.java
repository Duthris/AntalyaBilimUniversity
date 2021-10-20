
public class TestPerson {

	public static void main(String[] args) {
		Student eren = new Student("Test Program", 1994, 26676, "Eren", "Test Address"); 
		Staff john = new Staff("Antalya Bilim University", 32262, "John", "Test Address");
		
		Student testStudent = new Student("", 0, 0, "", "");
		testStudent.setYear(2000);
		testStudent.setFee(232323);
		testStudent.setAddress("asdasd");
		testStudent.setName("asdasd");
		testStudent.setProgram("asdasfdas");
		
		Staff testStaff = new Staff("", 0, "", "");
		testStaff.setAddress("gffgf");
		testStaff.setName("asfsaf");
		testStaff.setPay(123123);
		testStaff.setSchool("hgfhfg");
		
		System.out.println("Informations about Student testStudent\nName= " + testStudent.getName() +
				"\nAddress= " + testStudent.getAddress() + 
				"\nYear= " + testStudent.getYear() + 
				"\nProgram= " + testStudent.getProgram() + 
				"\nFee= " + testStudent.getFee());

		System.out.println("\nInformations about Staff testStaff\nName= " + testStaff.getName() + 
			  "\nAddress= " + testStaff.getAddress() + 
			  "\nSchool= " + testStaff.getSchool() + 
			  "\nPay= " + testStaff.getPay());
		
		
		System.out.println("\nInformations about Student Eren\nName= " + eren.getName() +
															"\nAddress= " + eren.getAddress() + 
															"\nYear= " + eren.getYear() + 
															"\nProgram= " + eren.getProgram() + 
															"\nFee= " + eren.getFee());
		
		System.out.println("\nInformations about Staff John\nName= " + john.getName() + 
														  "\nAddress= " + john.getAddress() + 
														  "\nSchool= " + john.getSchool() + 
														  "\nPay= " + john.getPay());
		
	}

}
