public class approxPi {
	public static void main(String[] args) {
		int nThreads = 1;
		int n = 0;
		switch (args.length) {
		case 2:
			nThreads = Integer.parseInt(args[1]);
		case 1:
			for(int i = 0; i < Integer.parseInt(args[0]); i++)
				if(Math.pow(Math.random() * 2 - 1, 2) + Math.pow(Math.random() * 2 - 1, 2) <= 1)
					n++;
			System.out.println("Total Number of points: " + Integer.parseInt(args[0]));
			System.out.println("Points within circle: " + n);
			System.out.println("Pi estimation: " + n * 4f / Integer.parseInt(args[0]));
			break;
		default:
			System.out.println("bad parameters");
		}
	}

}
