/*
  	ISYS 320
  	Name(s): Rona Davis
  	Date: March 17, 2018
*/

// 4. Your pseudocode algorithm for how to break down the figure


public class StarFigures {
			public static void main (String [] args)  {
				Draw2Horiz();
				drawX();
				System.out.println();
				System.out.println();
				Draw2Horiz();
				drawX();
				Draw2Horiz();
				System.out.println();
				System.out.println();
				drawVert();
				drawX();
				Draw2Horiz();
			}

			private static void Draw2Horiz() {
				// TODO Auto-generated method stub
				System.out.println("*********");
				System.out.println("*********");
			}

			private static void drawVert() {
				// TODO Auto-generated method stub
				System.out.println("    *");
				System.out.println("    *");
				System.out.println("    *");
				
			}

			private static void drawX() {
				// TODO Auto-generated method stub
				System.out.println("\\      /");
				System.out.println(" \\    /");
				System.out.println("  \\  /");
				System.out.println("   \\/");
				System.out.println("   /\\");
				System.out.println("  /  \\");
				System.out.println(" /    \\");
			}

		}
	


