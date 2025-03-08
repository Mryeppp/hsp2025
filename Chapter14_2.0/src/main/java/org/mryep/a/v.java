package org.mryep.a;

import java.util.Vector;

@SuppressWarnings({"all"})
public class v {

  public static void main(String[] args) {
    Vector<Integer> vec = new Vector<Integer>(10);
	  Vector<Integer> vec2 = new Vector<Integer>();

	for (int i = 0; i < 10; i++) {
        vec.add(i);
    }
    System.out.println(vec);
    
  }
}
 
