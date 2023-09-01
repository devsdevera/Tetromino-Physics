package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class L extends J{
	
  public L(int x, int y, Color color) {
    super(x, y,color);
    //throw new Error();
    
    this.orientation = 2;
	this.offset = -1;
	
	// cell 0 x+1 y-1 	before	cell 0 x-1 y-1	after
    // cell 1 x+1 y		before	cell 1 x-1 y	after
    // cell 2 x   y		before	cell 2 x   y	after
    // cell 3 x-1 y		before	cell 3 x+1 y	after
  }
 
  @Override
  public int y(int i) {
	    //throw new Error();
		  
	  if(orientation%2==0) {	// as simple of an expression as I can think of
		  if(i<1) return centerY()+1-orientation;
		  return centerY();
	  }
	  if(i<2) return centerY()+2-orientation;
	  else if(i>2) return centerY()-2+orientation;
	  return centerY();
  }
}



//FOR ANYONE READING MY CODE AND TRYING TO UNDERSTAND ABOVE

//Y Coordinate (unsimplified) =

//if(orientation  == 0) {
//	  if(i<1) return centerY()-1;
//	  return centerY();
//}else if(orientation  == 3) {
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