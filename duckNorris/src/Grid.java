import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {


    public static final int CELLSIZE = 50;
    private final int cols = 30;
    private final int rows = 18;
    public static final int PADDING = 10;
    public final int MAX_WIDTH = cols * CELLSIZE;
    public final int MAX_HEIGHT = rows * CELLSIZE;

    private Cell[][] coordinates;
    private Rectangle background;

    public Grid(){
        background = new Rectangle(PADDING, PADDING, MAX_WIDTH, MAX_HEIGHT);

        coordinates = new Cell[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                coordinates[i][j] = new Cell(i, j);
                coordinates[i][j].setRectangle( new Rectangle(i * CELLSIZE + PADDING, j * CELLSIZE + PADDING, CELLSIZE, CELLSIZE));
            }
        }

    }

    public void init(){
        background.setColor(Color.BLACK);
        background.fill();
        createObstacles(2,1);
        createObstacles(2,2);
        createObstacles(2,3);
        createObstacles(2,4);
        createObstacles(2,5);
        createObstacles(2,6);
        createObstacles(2,7);
        createObstacles(3,1);
        createObstacles(3,7);
        createObstacles(4,1);
        createObstacles(4,7);
        createObstacles(5,0);
        createObstacles(5,1);
        createObstacles(5,2);
        createObstacles(5,3);
        createObstacles(5,4);
        createObstacles(5,5);
        createObstacles(5,7);
        createObstacles(6,5);
        createObstacles(7,4);
        createObstacles(7,5);
        createObstacles(7,6);
        createObstacles(7,7);
        createObstacles(8,1);
        createObstacles(8,4);
        createObstacles(8,7);
        createObstacles(9,1);
        createObstacles(9,4);
        createObstacles(9,7);
        createObstacles(10,1);
        createObstacles(10,2);
        createObstacles(10,3);
        createObstacles(10,4);
        createObstacles(10,5);
        createObstacles(10,7);
        createObstacles(13,1);
        createObstacles(13,2);
        createObstacles(13,3);
        createObstacles(13,4);
        createObstacles(13,5);
        createObstacles(13,6);
        createObstacles(13,7);
        createObstacles(14,1);
        createObstacles(14,7);
        createObstacles(15,1);
        createObstacles(15,7);
        createObstacles(16,1);
        createObstacles(16,2);
        createObstacles(16,3);
        createObstacles(16,7);
        createObstacles(18,1);
        createObstacles(18,2);
        createObstacles(18,3);
        createObstacles(18,4);
        createObstacles(18,5);
        createObstacles(18,6);
        createObstacles(18,7);
        createObstacles(19,4);
        createObstacles(20,4);
        createObstacles(21,1);
        createObstacles(21,2);
        createObstacles(21,3);
        createObstacles(21,4);
        createObstacles(21,5);
        createObstacles(21,6);
        createObstacles(21,7);
        createObstacles(24,1);
        createObstacles(24,2);
        createObstacles(24,3);
        createObstacles(24,4);
        createObstacles(24,5);
        createObstacles(24,6);
        createObstacles(24,7);
        createObstacles(25,1);
        createObstacles(25,4);
        createObstacles(25,7);
        createObstacles(26,1);
        createObstacles(26,4);
        createObstacles(26,7);
        createObstacles(27,1);
        createObstacles(27,7);
        createObstacles(15,4);
        createObstacles(15,5);
        createObstacles(15,6);
        createObstacles(27,0);
        createObstacles(28,0);
        createObstacles(29,0);
        createObstacles(27,5);
        createObstacles(28,5);
        createObstacles(29,5);
        createObstacles(5,8);
        createObstacles(6,8);
        createObstacles(7,8);
        createObstacles(3,15);
        createObstacles(4,15);
        createObstacles(5,15);
        createObstacles(11,13);
        createObstacles(11,14);
        createObstacles(11,15);
        createObstacles(17,16);
        createObstacles(18,16);
        createObstacles(19,16);
        createObstacles(27,10);
        createObstacles(28,10);
        createObstacles(29,10);
        createObstacles(1,13);

        createObstacles(1,14);
        createObstacles(1,15);
        createObstacles(1,16);
        createObstacles(2,13);
        createObstacles(2,16);
        createObstacles(3,10);
        createObstacles(3,11);
        createObstacles(3,12);
        createObstacles(3,13);
        createObstacles(3,16);
        createObstacles(4,10);
        createObstacles(4,16);
        createObstacles(5,10);
        createObstacles(6,10);
        createObstacles(6,11);
        createObstacles(6,12);
        createObstacles(6,13);
        createObstacles(6,14);
        createObstacles(6,15);
        createObstacles(6,16);
        createObstacles(6,17);
        createObstacles(8,8);
        createObstacles(8,9);
        createObstacles(8,10);
        createObstacles(8,11);
        createObstacles(8,12);
        createObstacles(8,13);
        createObstacles(8,15);
        createObstacles(8,16);
        createObstacles(9,11);
        createObstacles(10,11);
        createObstacles(10,16);
        createObstacles(11,16);
        createObstacles(12,9);
        createObstacles(12,10);
        createObstacles(12,11);
        createObstacles(12,12);
        createObstacles(12,13);
        createObstacles(13,9);
        createObstacles(13,14);
        createObstacles(14,9);
        createObstacles(14,14);
        createObstacles(15,8);
        createObstacles(15,9);
        createObstacles(15,14);
        createObstacles(15,15);
        createObstacles(15,16);
        createObstacles(15,17);


        //createObstacles(16,18);

        createObstacles(17,9);
        createObstacles(17,10);
        createObstacles(17,11);
        createObstacles(17,12);
        createObstacles(17,13);
        createObstacles(17,14);
        createObstacles(17,15);
        createObstacles(18,9);
        createObstacles(19,9);
        createObstacles(20,8);
        createObstacles(20,9);
        createObstacles(20,8);
        createObstacles(20,9);
        createObstacles(20,8);
        createObstacles(20,9);
        createObstacles(20,8);
        createObstacles(20,9);
        createObstacles(21,11);
        createObstacles(22,11);
        createObstacles(23,11);
        createObstacles(24,11);
        createObstacles(24,17);
        createObstacles(25,17);
        createObstacles(26,12);
        createObstacles(26,13);
        createObstacles(26,14);
        createObstacles(26,17);
        createObstacles(27,12);
        createObstacles(27,14);
        createObstacles(27,17);
        createObstacles(28,12);
        createObstacles(28,14);
        createObstacles(28,15);
        createObstacles(28,16);
        createObstacles(28,17);


    }





    private void createObstacles(int col, int row){
        coordinates[col][row].setObstacle(true);
        coordinates[col][row].getRectangle().setColor(Color.YELLOW);
        coordinates[col][row].getRectangle().fill();
    }



    public Cell[][] getCoordinates() {
        return coordinates;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }
}
