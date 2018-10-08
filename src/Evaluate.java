
public class Evaluate {
	
	
	public static double test(double x, double y, double its)
	{
		
		double zx = x;
		double zi = y;
		double xTemp;
		
		for (int i = 0; i<its; i++)
		{
			xTemp = zx;
			zx = x + (zx*zx - zi*zi);
			zi = y + (2*xTemp*zi);
			
		}
		
		return Math.sqrt(zi*zi + zx*zx);
		
	}
	

}
