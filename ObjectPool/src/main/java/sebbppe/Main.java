package sebbppe;

import sebbppe.environment.Position;
import sebbppe.environment.ScoringMatrix;
import sebbppe.objectpool.Ball;
import sebbppe.objectpool.Basket;
import sebbppe.utils.GameOverException;

import java.util.Random;
import java.util.Scanner;

import static sebbppe.environment.TypePosition.DEAD;
import static sebbppe.utils.Color.blue;
import static sebbppe.utils.Color.green;
import static sebbppe.utils.Color.minus;
import static sebbppe.utils.Color.plus;
import static sebbppe.utils.Color.point;
import static sebbppe.utils.Color.purple;
import static sebbppe.utils.Color.red;
import static sebbppe.utils.Color.reset;
import static sebbppe.utils.Color.yellow;


public class Main {
    private static final Random random = new Random();
    private static final Scanner input = new Scanner(System.in);
    static Basket basket = new Basket(20);

    public static void main(String[] args) throws InterruptedException {
        ScoringMatrix matrix = new ScoringMatrix();
        Double score=0.0;
        String q;
        loadTheBasket();
        System.out.println("Te presentaremos una matriz como la siguiente ");
        System.out.println("Los signos " + plus + " y " + minus + " significan que ganarás o perderás [" + point + "] puntos respectivamente");
        System.out.println("y el " + blue + ":(" + reset + " hará que pierdas el juego instantáneamente " + red + "¡Ten mucho cuidado!" + reset + "\n\n");
        System.out.println(matrix);
        System.out.println("\nTendrás una cesta con capacidad de 20 pelotas, " +
                " con estas tendrás que apuntar a la matrix para acumular puntos.");
        System.out.println("Algunas pelotas no son normales, ya que pueden tener " + red + "multiplicadores" + reset + "," +
                " así que tú decides," + yellow + "lanzas la pelota en la cola de la cesta" + purple + " o pides una nueva" + reset);
        System.out.println("El juego terminará cuando te retires o tengas puntos negativos\n");
        while (true) {
            try {
                System.out.println("¿Quieres intentar con otra matriz? S/N");
                q= input.next();
                if ("s".equalsIgnoreCase(q)) {
                    System.out.println(green+"¡Listo! Intentémoslo con la siguiente"+reset);
                    matrix=new ScoringMatrix();
                    System.out.println(matrix);
                }
                System.out.println("Cesta: "+basket);
                System.out.println("¿Deseas lanzar la pelota actual? S/N");
                q= input.next();
                if ("n".equalsIgnoreCase(q)) {
                    generateNewBall();
                    System.out.println(basket);
                }
                Ball ball = basket.acquireObject();
                System.out.println("Pelota a lanzar, " + ball);
                Position position = shootBall(ball, matrix);
                System.out.println("Le diste a: " + position);
                if (DEAD.equals(position.getTypePosition())) {
                    throw new GameOverException("le diste a una posición de muerte");
                }
                score+=position.getValue()*ball.getMultiply();
                if(score<0){
                    throw new GameOverException("Acumulaste un puntaje negativo");
                }
                System.out.println("Tu puntaje actual es: "+score);
                System.out.println("¿Deseas continuar? S/N");
                q= input.next();
                if ("n".equalsIgnoreCase(q)) {
                    System.out.println(green+"Felicitaciones obtuviste "+score+" puntos"+reset);
                    break;
                }

            } catch (GameOverException e) {
                System.out.println("Perdiste el juego, "+e.getMessage());
                break;
            }
        }

    }

    private static void loadTheBasket() {
        Integer numberBalls = random.nextInt(10) + 1;
        for (int i = 0; i < numberBalls; i++) {
            generateNewBall();
        }
    }

    private static void generateNewBall() {
        basket.releaseObject(new Ball());
    }

    public static Position shootBall(Ball ball, ScoringMatrix matrix) {
        int row;
        while (true) {
            row = random.nextInt(3);
            System.out.println("Apuntarás a la fila " + row + ", ¿estás de acuerdo? S/N");
            String q = input.next();
            if ("s".equalsIgnoreCase(q)) {
                System.out.println("Ok");
                break;
            }
        }
        return matrix.getPosition(row, random.nextInt(3));
    }
}