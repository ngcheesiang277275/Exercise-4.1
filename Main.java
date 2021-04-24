
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tony a = new Tony();
		
		System.out.println("------DOG INFO------");
		System.out.printf("%-30s: %s%n", "Name", a.getName());
		System.out.printf("%-30s: %d%n", "Age", a.getAge());
		System.out.printf("%-30s: %s%n", "Breed", a.getBreed());
		System.out.printf("%-30s: %s%n", "Gender", a.getGender());
		System.out.printf("%-30s: %skg%n", "Weight", a.getWeight());
		
		System.out.println("-----RECEIPT-----");
		System.out.printf("%-30s: RM%.2f%n", "Subtotal", a.getPrice());
		
		if(a.getMembership().equals("1"))
			System.out.printf("%-30s: %s%n", "Membership", "Yes");
		else
			System.out.printf("%-30s: %s%n", "Membership", "No");

		System.out.printf("%-30s: RM%.2f%n", "Final price", a.getFinalPrice());
		System.out.printf("%-30s: RM%.2f%n", "Price paid", a.getPricePaid());
		System.out.printf("%-30s: RM%.2f%n-----THANK YOU FOR VISITING US-----%n%n", "Change", a.getChange());
		
		
		Baby b = new Baby();
		
		System.out.println("------DOG INFO------");
		System.out.printf("%-30s: %s%n", "Name", b.getName());
		System.out.printf("%-30s: %d%n", "Age", b.getAge());
		System.out.printf("%-30s: %s%n", "Breed", b.getBreed());
		System.out.printf("%-30s: %s%n", "Gender", b.getGender());
		System.out.printf("%-30s: %skg%n", "Weight", b.getWeight());
		
		System.out.println("-----RECEIPT-----");
		System.out.printf("%-30s: RM%.2f%n", "Subtotal", b.getPrice());
		
		if(b.getMembership().equals("1"))
			System.out.printf("%-30s: %s%n", "Membership", "Yes");
		else
			System.out.printf("%-30s: %s%n", "Membership", "No");

		System.out.printf("%-30s: RM%.2f%n", "Final price", b.getFinalPrice());
		System.out.printf("%-30s: RM%.2f%n", "Price paid", b.getPricePaid());
		System.out.printf("%-30s: RM%.2f%n-----THANK YOU FOR VISITING US-----", "Change", b.getChange());
		
	}

}
