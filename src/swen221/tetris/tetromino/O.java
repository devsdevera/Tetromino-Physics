package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class O extends Tetromino{
  public O(int x, int y, Color color) {
    super(x, y, color);/*TODO: complete this code*/
    //throw new Error();
    
  }

  /**
   * x coordinate: obtained by determining if cell is even
   * */
  @Override
  public int x(int i) {/*TODO: complete this code*/
    //throw new Error();
  //HINT you may want to use some paper and
  //make diagrams like those for all the tetrominos
   /* x y
    0 0 0
    1 1 0
    2 0 1
    3 1 1*/    
    
	// if 0 or 2 even, keep it at center, otherwise offset by 1 to the right
	
    if (i%2 == 0)return centerX();
    return centerX()+1;
  }

  /**
   * x coordinate: obtained by marking all cells greater than half (simple 2x2)
   * */
  @Override
  public int y(int i) {/*TODO: complete this code*/
    //throw new Error();
	  
	  // if 2 or 3 (greater than 1), keep it at center, otherwise offset by 1 upwards
	  
	  if (i>1)return centerY();
	  return centerY()+1;
  }

  /**
   * Rotate right is identical to rotate left and unrotated.
   * */
  @Override
  public void rotateRight() {/*TODO: complete this code*/
    //throw new Error();
	  // deliberately left empty as nothing should happen anyway. :)
  }
  //TODO: add more methods if needed
}
