package test.app.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class TreeType {

	private String name;
	private Color color;
	private String otherTreeData;
	
	TreeType( String name, Color color, String otherTreeData ){
		this.name = name;
		this.color = color;
		this.otherTreeData = otherTreeData;
	}
	
	public void draw ( Graphics g , int x , int y ) {
		g.setColor(color);
		g.fillRect(x-1, y, 3, 5);
		g.fillOval(x-5, y-10, 10, 10);
	}
}
