import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o Segundo parâmetro:");
        int parametroDois = scanner.nextInt();

        try{
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception){

            System.out.println(exception.getMessage());

        }finally {
            scanner.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i=1; i<= contagem; i++ ){
            System.out.println("Imprimir o número " + i);
        }
    }

}