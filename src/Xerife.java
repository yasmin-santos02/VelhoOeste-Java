public class Xerife extends Humanos{
    String corDistintivo;
    String corChapeu;
    String aparencia;
    int numeroDePistolas;
    int numeroDeBalas;

    public Xerife(){
        aparencia = "bigodudo";
        numeroDePistolas = 3;
        numeroDeBalas = 15;
    }

    public void atirar() {
        if (numeroDeBalas > 0){
            numeroDeBalas--;
        }
        else
        {
         System.out.println("Você não tem balas suficientes para atirar!");
        }
    }

    public int quantasBalasTem() {
        return numeroDeBalas;
    }
}
