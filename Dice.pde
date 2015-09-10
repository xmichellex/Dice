Die tom;
void setup()
{
	size(600, 600); 
	background(256, 256, 256);
	tom = new Die(30, 40); 
	noLoop();
}
void draw()
{   
	background(256, 256, 256);
	tom.show(); 
	tom.roll();
	


}
void mousePressed()
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
	void roll()
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
	void show()
	{
		//outline of the square 
		fill(255, 0, 0); 
		rect(myX, myY, 50, 50, 30); 
		roll();
	

	}
}
