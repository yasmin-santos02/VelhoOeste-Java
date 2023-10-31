public class Vilao extends Humanos {
    String corBigode;
    String corChapeu;
    String aparencia;
    int embriaguez;
    int numeroDeDonzelas;
    Humanos donzela;

    public Vilao() {
        aparencia = "Mau";
        embriaguez = 0;
        numeroDeDonzelas = 0;
    }

    public void beberWhiskey() {
        embriaguez ++;
    }

    public int quaoBebadoEstou() {
        return embriaguez;
    }

    public void capturarDonzela (Humanos donzela) {
        this.donzela = donzela;
        numeroDeDonzelas++;
        System.out.println("O vilão capturou " + donzela.qualOSeuNome());
    }
}