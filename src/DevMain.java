import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 

public class DevMain {
	
	public static void main(String[] args)
	{
		System.out.println(Evaluate.test(-0.2, 0.1, 100));
		BufferedImage pic = null;
		File f = null;
		
		try
        { 
            f = new File("C:\\Users\\Nathan\\desktop\\tile.png"); 
            pic = ImageIO.read(f); 
        } 
        catch(IOException e) 
        { 
            System.out.println(e); 
        } 
		
		System.out.println(pic.getHeight());
		
		int p = 0;
		
		int a = (p>>24) & 0xff; 
		  
        //int r = (p>>16) & 0xff; 
   
        int g = (p>>8) & 0xff; 
  
        int b = p & 0xff; 
        /**
        a = 25; 
        r = 0; 
        g = 0; 
        b = 0; */
        
        double incx = -1.5;
        double incy = 1;
        
        for (int r = 0; r<810; r++)
        {
        	incx = -1.5;
        	for (int c = 0; c<810; c++)
        	{
        		pic.setRGB(r, c, Pixel.getColor(Evaluate.test(incx, incy, 80)));
        		incx += 2.0/810;
        	}
        	
        	incy -= 2.0/810.0;
        	
        }
       
		try
        { 
            ImageIO.write(pic, "png", f); 
        } 
        catch(IOException e) 
        { 
            System.out.println(e); 
        } 
	}

}
