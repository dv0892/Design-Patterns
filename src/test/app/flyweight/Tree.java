package test.app.flyweight;

import java.awt.Graphics;

public class Tree {

	int x,y;
	TreeType type;
	
	public Tree( int x , int y , TreeType type ) {
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public void draw ( Graphics g) {
		type.draw(g, x, y);
	}
}
