package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class Z extends S{
  public Z(int x, int y, Color color) {
    super(x, y, color);/*TODO: complete this code*/
    //throw new Error();
  }
  //TODO: add more methods if needed
  
  /**
   * x coordinate: obtained by subtracting the center with an offset.
   * */
  public int x(int i) {
	// when horizontal, xOffset should be before the center
    if(horizontal) {return centerX()-xOffset(i);}
    return centerX()+yOffset(i)-1;	// a very simple -1 to the x value. 
    }
}
