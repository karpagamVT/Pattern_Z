package PatPro;

public class Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j =0; j <n; j++) {
				if (i==0||i==4||j==4-i)
				{
					System.out.print("*"+" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

}

}
