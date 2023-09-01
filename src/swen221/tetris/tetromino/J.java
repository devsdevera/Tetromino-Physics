package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class J extends Tetromino{
	
	public int orientation =0;
	public int offset = 1;
	
  public J(int x, int y, Color color) {
    super(x, y, color);
    //throw new Error();
    
    // cell 0 x+1 y-1
    // cell 1 x+1 y
    // cell 2 x   y
    // cell 3 x-1 y
  }

  /**
   * x coordinate: obtained by simplifying a 4 way orientation expression
   * */
  public int x(int i) {
    //throw new Error();
    
	  if(orientation%2==0) {	// simplified expression using orientation and i
		  if(i<2) return centerX()+1-orientation;
		  else if(i>2) return centerX()-1+orientation;
		  return centerX();
	  }
	  if(i<1) return centerX()-2+orientation;
	  return centerX();
  }

  /**
   * y coordinate: obtained by modifying the x coordinate expression in reverse
   * */
  public int y(int i) {
    //throw new Error();
	  
	  if(orientation%2==0) {	// very similar expression but reversed for y
		  if(i<1) return centerY()-1+orientation;
		  return centerY();
	  }
	  if(i<2) return centerY()-2+orientation;
	  else if(i>2) return centerY()+2-orientation;
	  return centerY();
	  
  }

  /**iterate between the four possibilities, never negative*/
  public void rotateRight() {
    //throw new Error();
	  orientation =(orientation + (offset) + 4) %4;
	  // inspiration taken from T block, 4 rotations. 
  }
}


// FOR ANYONE READING MY CODE AND TRYING TO UNDERSTAND ABOVE

// X Coordinate (unsimplified) = 

//if(orientation  == 0) {
//	  if(i<2) return centerX()+1;                  
//	  else if(i>2) return centerX()-1;
//	  return centerX();
//}else if(orientation  == 1) {
//	  if(i<1) return centerX()-1;              
//	  return centerX();
//}else if(orientation  == 2) {
//	  if(i<2) return centerX()-1;             
//	  else if(i>2) return centerX()+1;
//	  return centerX();
//}else {
//	  if(i<1) return centerX()+1;              
//	  return centerX();
//}


// Y Coordinate (unsimplified) =

//if(orientation  == 0) {
//	  if(i<1) return centerY()-1;          
//	  return centerY();
//}else if(orientation  == 1) {
//	  if(i<2) return centerY()-1;
//	  else if(i>2) return centerY()+1;     
//	  return centerY();
//}else if(orientation  == 2) {
//	  if(i<1) return centerY()+1;        
//	  return centerY();
//}else {
//	  if(i<2) return centerY()+1;
//	  else if(i>2) return centerY()-1;     
//	  return centerY();
//}