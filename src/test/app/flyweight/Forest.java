package test.app.flyweight;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Forest extends JFrame {

	List<Tree> trees = new ArrayList<>();
	
	public void plantTree ( int x, int y, String name, Color color, String otherTreeData) {
		
		TreeType treetype = TreeFactory.getTreeType(name, color, otherTreeData);
		Tree tree = new Tree(x,y,treetype) ;
		trees.add(tree);
		
	}
	
	@Override
	public void paint ( Graphics g ) {
		for ( Tree t : trees ) {
			t.draw(g);
		}
	}
}
