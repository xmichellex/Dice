import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	size(570, 570); 
	background(256, 256, 256);
	noLoop();
}
public void draw()
{   

	background(12, 99, 102);
	for(int y = 50; y <= 450; y+=50) { 
		for(int x = 50; x <= 450; x+=50) { 
			Die tom = new Die(x, y);	
			tom.show();	

		}		


	}


}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int myX, myY, dots; 
	Die(int x, int y)  
	{
		myX = x; 
		myY = y; 
	}
	public void roll()
	{
		int dots = (int)(Math.random()*6)+1;
		
		if(dots == 1)
	 { 
	 	fill(0); 
	 	ellipse(myX+25, myY+25, 10, 10); 
	 }    
	 	else if(dots==2) 
	 { 
	 	fill(0);
	 	ellipse(myX+15, myY+15, 10, 10);
	 	ellipse(myX+ 35, myY+35, 10, 10);
	 }  else if(dots == 3) { 
	 	fill(0);
	 	ellipse(myX+25, myY+25, 10, 10); 
	 	ellipse(myX+15, myY+15, 10, 10);
	 	ellipse(myX+ 35, myY+35, 10, 10);
	 } else if(dots == 4) { 
	 	fill(0); 
	 	ellipse(myX+15, myY+17, 10, 10); 
	 	ellipse(myX+15, myY +35, 10, 10);
	 	ellipse(myX+35, myY+17, 10, 10); 
	 	ellipse(myX+35, myY+35, 10, 10);
	 } else if(dots ==5) { 
	 	fill(0); 
	 	ellipse(myX+25, myY+25, 10, 10); 
	 	ellipse(myX+15, myY+17, 10, 10); 
	 	ellipse(myX+15, myY +35, 10, 10);
	 	ellipse(myX+35, myY+17, 10, 10); 
	 	ellipse(myX+35, myY+35, 10, 10);
	 } else if(dots == 6) { 
	 	fill(0); 
	 	ellipse(myX+15, myY+13, 10, 10); 
	 	ellipse(myX+15, myY+25, 10, 10); 
	 	ellipse(myX+15, myY+37, 10, 10); 
	 	ellipse(myX+35, myY+13, 10, 10); 
	 	ellipse(myX+35, myY+25, 10, 10); 
	 	ellipse(myX+35, myY+37, 10, 10); 

	 }
	
	

	 

	}
	public void show()
	{
		//outline of the square 
		fill(255, 133, 247);
		stroke(66, 14, 63);
		strokeWeight(5);
		rect(myX, myY, 50, 50, 50);
		strokeWeight(2);
		roll();
	

	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
