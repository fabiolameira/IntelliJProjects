package Teste_03;
import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idcurso = 0;
        String tipocurso;
        boolean valida = false;

        do {
            try {
                System.out.println("Indique o ID do Curso: ");
                idcurso = teclado.nextInt();
                valida = idcurso == 0 || idcurso == 1 || idcurso == 2;
                if (!valida)
                    throw new Exception();
            }

            catch (Exception e) {
                System.out.println("ERRO! => O ID do Curso Varia ente 0 e 2");
                System.out.println("Tente de novo.");
            }
        } while (!valida);

        tipocurso = TipoCurso(idcurso);
        System.out.println("O Tipo de Curso é: " +tipocurso);


        teclado.close();
    }


    public static String TipoCurso(int idcurso) {
        String tipocurso = "";

        switch(idcurso) {
            case 0: tipocurso = "CTeSP";break;
            case 1: tipocurso = "Licenciatura";break;
            case 2: tipocurso = "Mestrado";break;
        }

        return tipocurso;

    }

}
