package enumPackge;

public class EnumExample {
	
	public enum Direction {
		EAST,
		WEST,
		NORTH,
		SOUTH,
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (Direction d1 : Direction.values()) {
			System.out.println("Direction : " + d1);
			
		
		}
		System.out.println("Element of East is at : " + Direction.valueOf("EAST").ordinal());
		System.out.println("Element of Nourth is at : " + Direction.valueOf("NORTH").ordinal());
		
	}

}
