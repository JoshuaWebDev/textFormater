import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "formatted_text.txt";
        String inputedText = "";
        String namePerson = "";
        String formattedText = "";
        TextFormater tf = new TextFormater();

        while(!inputedText.contentEquals("exit")) {
            System.out.println("Informe o CPF a ser formatado: (digite 'exit' para sair)");
            inputedText = scanner.nextLine();

            if (inputedText.equals("exit")) {
                System.out.println("Saindo do programa");
                System.exit(0);
            }

            System.out.println("Informe o nome da pessoa portadora do CPF: ");
            namePerson = scanner.nextLine();

            formattedText = tf.hideCPF(inputedText) + " | " + namePerson;

            System.out.println("Texto inserido: " + inputedText);
            System.out.println("Texto formatado: " + formattedText);
            
            tf.createFile(filename, formattedText);
        }

        System.out.println("Saindo do programa");
    }
}
