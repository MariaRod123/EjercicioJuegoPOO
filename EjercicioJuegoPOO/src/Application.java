
public class Application {
    public static void main(String[] args) {


        System.out.println("Partida inicial");
        Juego juego_inicial = new Juego( 5); //crea una instancia de la clase Juego
        juego_inicial.MuestraVidasRestantes();// llama al metodo MuestraVidasRestantes() que muestra las vidas que tiene al momento
        System.out.println("Perdiste una vida");
        juego_inicial.QuitarVida(); //Resta una vida a las vidas anteriores
        System.out.println("Vidas restantes actuales");
        juego_inicial.MuestraVidasRestantes();// llama al metodo para mostrar las vidas que le van quedando ahora
        System.out.println("Reinicio del juego");
        juego_inicial.ReiniciarPartida();



        System.out.println("Nueva partida");
        Juego juego_nuevo = new Juego(5);
        System.out.println("Vidas restantes actuales");
        juego_nuevo.MuestraVidasRestantes();
        System.out.println("Vidas en juego inicial");
        juego_inicial.MuestraVidasRestantes();
        System.out.println("record obtenido en juego inicial");
        juego_inicial.ActualizaRecord();
        System.out.println("record ontenido en partida nueva");
        juego_nuevo.ActualizaRecord();





    }
}
