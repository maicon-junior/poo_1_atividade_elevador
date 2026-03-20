public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private boolean portaAberta;

    // Construtor
    public Elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = 0; // térreo do prédio
        this.portaAberta = false;
    }

    // Abrir a porta
    public void abrirPorta() {
        portaAberta = true;
        System.out.println("Porta aberta.");
    }

    // Fechar a porta
    public void fecharPorta() {
        portaAberta = false;
        System.out.println("Porta fechada.");
    }

    // Verificação de porta e último andar
    public void subir() {
        if (portaAberta) {
            System.out.println("Não pode subir com a porta do elevador aberta.");
        } else if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subindo para o andar: " + andarAtual);
        } else {
            System.out.println("Já está no último andar do prédio.");
        }
    }

    // Verificação de porta fechada e térreo
    public void descer() {
        if (portaAberta) {
            System.out.println("Não pode descer com a porta do elevador aberta.");
        } else if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Descendo para o andar: " + andarAtual);
        } else {
            System.out.println("Elevador no térreo.");
        }
    }

    // Andar atual do elevador
    public void mostrarAndarAtual() {
        System.out.println("Andar: " + andarAtual);
    }

    // Situação da porta (Aberta ou Fechada)
    public void mostrarEstadoPorta() {
        if (portaAberta) {
            System.out.println("A porta está aberta.");
        } else {
            System.out.println("A porta está fechada.");
        }
    }
}
