public class BouncingBall
{
    public static void main(String[] args)
    {
	//starting location of the ball
	double rx = .480, ry = .860;
	// speed of the ball
	double vx = .0015, vy = .0023;
	// size of the balls
	double radius = .05;
	// statrting location of ball 2
	double rx1 = .180, ry1 = .560;
	// speed of the ball
	double vx1 = .0015, vy1 =.0023;	

	// set the drawing area to be [-1, 1]
	StdDraw.setXscale(-1.0, +1.0);
	StdDraw.setYscale(-1.0, +1.0);
	
	while(true)
	    {
		// new location is outside the ara
		// bounce back 
		if (Math.abs(rx + vx) > 1.0) vx = -vx;
		if (Math.abs(ry + vy) > 1.0) vy = -vy;
		if (Math.abs(rx1 + vx1) > 1.0) vx1 = -vx1;
		if (Math.abs(ry1 + ry1) > 1.0) vy1 = -vy1;//
		// calculate new location of the ball
		rx = rx + vx;
		ry = ry + vy;
		rx1 = rx1 + vx1;
		ry1 = ry1 + vy1;
		// set background color
		StdDraw.clear(StdDraw.GRAY);
		// set ball color
		StdDraw.setPenColor(StdDraw.RED);
		// draw the ball
		StdDraw.filledCircle(rx, ry, radius);
		// set ball 2 color
		StdDraw.setPenColor(StdDraw.BLUE);
		// draw ball 2 
		StdDraw.filledCircle(rx1, ry1, radius);
		// pause animation for 5 millisecond
		StdDraw.show(5);
	    }
    }
}