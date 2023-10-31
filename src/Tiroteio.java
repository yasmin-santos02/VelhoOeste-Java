public class Tiroteio {
    public static void main(String[] args) {
        CidadeOeste sweatyPost = new CidadeOeste();
        sweatyPost.saloes = 2;
        sweatyPost.xerifes = 1;
        sweatyPost.causadoresdeproblemas = 5;

        Vilao maurice = new Vilao();
        maurice.corChapeu = "preto";
        maurice.corBigode = "vermelho";
        maurice.sexo = "masculino";
        maurice.nomeCavalo = "Beer Gut";
        maurice.preferenciaWhiskey = "Jack Daniels";

        Humanos mary = new Humanos();
        mary.sexo = "feminino";
        mary.nomeCavalo = "Midnight";
        mary.preferenciaWhiskey = "Puro";
        mary.nome = "Mary";

        Xerife calango = new Xerife();
        calango.aparencia = "Bigode grande";
        calango.numeroDeBalas = 10;
        calango.corDistintivo = "Dourado";
        calango.corChapeu = "Preto";

        maurice.beberWhiskey();
        System.out.println(maurice.quaoBebadoEstou());
        maurice.capturarDonzela(mary);

        calango.atirar();
        System.out.println("\nVocê ainda tem " + calango.quantasBalasTem() + " balas.");
    }
}