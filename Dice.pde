void setup()
{
	size(570, 570); 
	background(231, 255, 150);
	noLoop();
}
void draw()
{   
	int everything = 0; 
	background(231, 255, 150);
	for(int y = 50; y <= 450; y+=50) { 
		for(int x = 50; x <= 450; x+=50) { 
			Die tom = new Die(x, y);	
			tom.show();	
			everything = everything + tom.dots; 

		}		
	}
	textSize(25);
	stroke(0); 
	text("Sum: " + everything, 0, 570);

}
void mousePressed()
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
	void roll()
	{
		dots = (int)(Math.random()*6)+1;
		
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
	void show()
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
