public class Main {
    public static void main(String[] args) {

        Elevador elevador = new Elevador(5);

        elevador.mostrarAndarAtual();
        elevador.mostrarEstadoPorta();
        elevador.abrirPorta();
        elevador.fecharPorta();
        elevador.descer();

        elevador.subir();
        elevador.subir();

        elevador.abrirPorta();
        elevador.subir();

        elevador.fecharPorta();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.abrirPorta();

        elevador.descer();
        elevador.fecharPorta();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();

        elevador.mostrarEstadoPorta();
        elevador.abrirPorta();
    }
}