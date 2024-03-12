package sebbppe.environment;

import java.util.Random;

import static sebbppe.environment.TypePosition.MINUSPOINTS;
import static sebbppe.environment.TypePosition.PLUSPOINTS;

public class ScoringMatrix {
    private Position matrix[][]=new Position[4][4];
    private final Random random=new Random();

    public ScoringMatrix(int row, int col){

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                TypePosition type=TypePosition.values()[random.nextInt(3)];
                Integer value=0;
                if(PLUSPOINTS.equals(type) || MINUSPOINTS.equals(type)){
                    value=random.nextInt(99)+1;
                }
                matrix[i][j]=new Position(type,value);
            }
        }
    }

    public Position getPosition(Integer row, Integer col) {
        return matrix[row][col];
    }

    @Override
    public String toString() {
        String matrixS="";
        for (Position[] positions : matrix) {
            matrixS += "                      |";
            for (int y = 0; y < positions.length; y++) {
                matrixS += positions[y].toString();
            }
            matrixS += "|\n";
        }
        return matrixS;
    }
}
