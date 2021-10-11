package TechQuestions;

public class RestrictObjectCreation {
	
	public static RestrictObjectCreation object;
	private static int count=0;
	
	private RestrictObjectCreation() {
		count++;
		System.out.println("object Count is :"+count);
	}
	
	public static RestrictObjectCreation getObject() {
		if(count<6) {
			object=new RestrictObjectCreation();
		}
		return object;
	}
	
	public static void main(String[] args) {
		
		RestrictObjectCreation obj1 = RestrictObjectCreation.getObject();
		System.out.println("1st object created \t "+obj1.hashCode());
		
		RestrictObjectCreation obj2 = RestrictObjectCreation.getObject();
		System.out.println("2nd object created \t "+obj2.hashCode());
		
		RestrictObjectCreation obj3 = RestrictObjectCreation.getObject();
		System.out.println("3rd object created \t "+obj3.hashCode());
		
		RestrictObjectCreation obj4 = RestrictObjectCreation.getObject();
		System.out.println("4th object created \t "+obj4.hashCode());
		
		RestrictObjectCreation obj5 = RestrictObjectCreation.getObject();
		System.out.println("5th object created \t "+obj5.hashCode());
		
		RestrictObjectCreation obj6 = RestrictObjectCreation.getObject();
		System.out.println("6th object created \t "+obj6.hashCode());
		
		RestrictObjectCreation obj7 = RestrictObjectCreation.getObject();
		System.out.println("6th object created \t "+obj7.hashCode());
		
	}
}
