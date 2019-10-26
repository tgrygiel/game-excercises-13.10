package test;

	public class ClothesKCH {
		String type;
		String color;
		int size;
		double price;
		
		public ClothesKCH (String type, String color, int size, double price){
			this.type = type;
			this.color = color;
			this.size = size;
			this.price = price;
		}
		
		public void showDetails() {
			System.out.println("Product:" + type + " Color:"+ color + " Size:" + size + " Price:" + price + "z³");
		}
		
		public String toString() {
			return "Product:" + type + " Color:"+ color + " Size:" + size + " Price:" + price + "z³";
		}
		
}
