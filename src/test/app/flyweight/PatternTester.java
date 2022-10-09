package test.app.flyweight;

import java.awt.Color;

public class PatternTester {

	public static void main(String[] args) {
		/*
		 * The FlyWight design pattern addresses problems like :
		 * How can a system support large number of fine-grained heavy objects efficiently ?
		 * 
		 * Suppose we have a Book Object with following structure :
		 * class Book {
		 * 	String name;
		 * 	String isbn;
		 * 
		 * 	String type;
		 * 	String distributor;
		 * 	String info;
		 * 
		 * }
		 * 
		 * let's assume the size of book is 50B
		 * Suppose we are creating 10,000,000 objects of book class.( 10,000,000*50/1024*1024 = 477 MB )
		 * 
		 * Now how can we handle creation of object efficiently , FyWeight design pattern suggests that we 
		 * should this object into two parts :
		 * 1 . That is unique across all the objects ( call it extrinsic state )
		 * 2 . That won't change across all the objects( call it intrinsic state ) 
		 * 
		 * The extrinsic state is called as context and the intrinsic state is called as flyweight.
		 * 
		 * These flyweight objects are created separately and are combined with contexts to form a object
		 * These Flyweights are usually immutable.
		 * 
		 * Now, let's apply the flyweight to above book class.
		 * We can segregate the type , distributor and info and treat them as flyweights.
		 * Suppose if there are only 2 possible flyweight ( 0f size 30B ) that is shared across all the 10 million objects.
		 * 
		 * Total size would be ( 10,000,000*20/1024*1024 + 30*2/1024*1024= 190 MB )
		 * 
		 * As we can there is significant if we follow this approach.
		 * 
		 * Also known as CACHE.
		 * 
		 */
		 
		 int TREES_TO_DRAW = 1000000;
		 int TREE_TYPE = 2;
		 int CANVAS_SIZE = 500;
		
		 Forest forest = new Forest();
		 for ( int i=0;i< Math.floor( TREES_TO_DRAW/TREE_TYPE );i++) {
			 forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer Oak", Color.GREEN, "Oak texture stub");
			 forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
		 }
		 
		 forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
		 forest.setVisible(true);
		 
		   System.out.println(TREES_TO_DRAW + " trees drawn");
	        System.out.println("---------------------");
	        System.out.println("Memory usage:");
	        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
	        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPE + "");
	        System.out.println("---------------------");
	        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPE * 30) / 1024 / 1024) +
	                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
		
	}
	
	private static int random ( int min, int max ) {
		return min + (int)(Math.random()*(max-min)+1);
	}

}
