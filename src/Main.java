import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        GeometricForm geometricForm;   // interface
        int option = 0;
        while (option !=4) {
            System.out.println("==*********************==");
            System.out.println("Escolha a forma geométrica para calcular");
            System.out.println("1 - Quadrado\n" +
                    "2 - Retangulo\n" +
                    "3 - Círculo\n" +
                    "4 - Sair do programa");

            System.out.println("Opção: ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    geometricForm = createSquare() ;
                System.out.println("Area do quadrado: " + geometricForm.getArea());
                }
                case 2 -> {
                    geometricForm = createRectangle() ;
                    System.out.println("Area do Retângulo: " + geometricForm.getArea());
                }
                case 3 -> {
                    geometricForm = createCircle() ;
                    System.out.println("Area do circulo: " + geometricForm.getArea());
                }
                default -> System.out.println("Opção inválida");

            }
        }


    }

    // criar função que chama os métodos de cada área
    private static GeometricForm createSquare() {
        System.out.println("Informa o lado");
        var side = sc.nextDouble();
        return new Square(side);

    }
    private static GeometricForm createRectangle() {
        System.out.println("Informa o altura");
        var height = sc.nextDouble();
        System.out.println("Informa o base");
        var base = sc.nextDouble();
        return new Rectangle(height,base);

    }
    private static GeometricForm createCircle() {
        System.out.println("Informa o raio");
        var raio = sc.nextDouble();
        return new Circle(raio);

    }
}