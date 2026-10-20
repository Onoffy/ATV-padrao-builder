import computador.Builder;
import computador.Computador;
import computador.ComputadorGamer;
import computador.ComputadorNormal;

public class Main {

    public static void main(String[] args) {

        Builder builderNormal = new ComputadorNormal();
        Computador normal = builderNormal.criar();

        Builder builderGamer = new ComputadorGamer();
        Computador gamer = builderGamer.criar();

        System.out.println("Computador Normal");
        normal.exibirInformacoes();

        System.out.println("Computador Gamer");
        gamer.exibirInformacoes();

    }

}
