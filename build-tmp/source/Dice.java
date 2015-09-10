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

Die tom;
public void setup()
{
	size(600, 600); 
	background(256, 256, 256);
	tom = new Die(30, 40); 
	noLoop();
}
public void draw()
{   
	background(256, 256, 256);
	tom.show(); 
	tom.roll();
	


}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int myX, myY, dots; 
	Die(int x, int y)  //constructor
	{
		myX = x; 
		myY = y; 
	}
	public void roll()
	{
		int dots = (int)(Math.random()) + 4;
		System.out.println(dots);
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
	 }

	 

	}
	public void show()
	{
		//outline of the square 
		fill(255, 0, 0); 
		rect(myX, myY, 50, 50, 30); 
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
