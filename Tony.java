
public class Tony extends Dog{
	private String name;
	private String membership;
	private double price;
	private double pricePaid;
	private double finalPrice;
	private double change;
	
	//no-args constructor
	Tony(){
		super();
		super.patDog();
		System.out.printf("%-30s: ", "Enter dog name");
		s.nextLine();
		this.name = s.nextLine();
		System.out.println("\n\n");
		
		purchasePackage();
		
		checkout();
		
	}
	
	
	//method
	public void purchasePackage() {
		System.out.println("--------DOG GROOMING PACKAGES--------");
		System.out.println("1. Starter Grooming Package \t\tRM50.00");
		System.out.println("2. Economic Grooming Package \t\tRM80.00");
		System.out.println("3. Premium Grooming Package \t\tRM120.00");
		System.out.print("Enter package to purchase: ");
		String option = s.next();
		
		switch(option) {
		case "1":
			this.price = 50.0;
			break;
		case "2":
			this.price = 80.0;
			break;
		case "3":
			this.price = 120.0;
			break;
		default:
			System.out.println("Invalid input.");
			this.price = 0;
		}
	}
	
	public void checkout() {
		System.out.printf("%n%-30s: RM%.2f", "Price of grooming service", this.price);
		
		System.out.println("\n*****20% MEMBERSHIP DISCOUNT IS AVAILABLE*****");
		System.out.printf("%-30s: ", "Membership(1-Yes, OTHERWISE-No)");
		this.membership = s.next();
		

		if(this.membership.equals("1")) {
			System.out.printf("%-30s: %s%n", "Membership", "Yes");
			this.finalPrice = this.price * 0.80;	
		}else{
			System.out.printf("%-30s: %s%n", "Membership", "No");
			this.finalPrice = this.price;
		}
		
		
		System.out.println("\n\n\n-----CHECKOUT-----");
		System.out.printf("%-30s: RM%.2f%n", "Total price", this.finalPrice);
		System.out.printf("%-30s: RM", "Price paid");
		this.pricePaid = s.nextDouble();
		this.change = this.pricePaid - this.finalPrice;
		System.out.printf("%-30s: RM%.2f%n", "Change", change);
	}
	
	
	//accessor method
	public String getName() {
		return this.name;
	}
	
	public String getMembership() {
		return this.membership;
	}
	
	
	public double getFinalPrice() {
		return this.finalPrice;
	}
	
	public double getChange() {
		return this.change;
	}
	
	
	public double getPrice() {
		return this.price;
	}
	
	public double getPricePaid() {
		return this.pricePaid;
	}

}
