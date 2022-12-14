
public class Juego {
    //Atributos

    private  Integer num_vidas; //número de vidas que le quedan
    private final Integer vidas_iniciales; //total de vidas con la que empieza el juego
    private static Integer record = 0; //atributo que guarda el récord

    //Constructor
    public  Juego (Integer num_vidas) {
        this.num_vidas=num_vidas;
        this.vidas_iniciales= num_vidas;

    }
    //metodos

    public void MuestraVidasRestantes() {
        System.out.println("Número de vidas restantes : " + num_vidas); //cantidad de vidas que le van quedando
    }


    public boolean QuitarVida() {
        num_vidas= num_vidas - 1 ;

        if (num_vidas <= 0) {
            System.out.println("Juego terminado");
            return false;
        }
        return true;
    }

    public void ReiniciarPartida() {

        num_vidas = vidas_iniciales;
    }


    public void ActualizaRecord() {
        if (num_vidas == record) {
            System.out.println("Se ha alcanzado el récord");
        }else if (num_vidas > record) {
            record=num_vidas;
            System.out.println("Se ha batido el récord. El nuevo récord es: " + record);
        }
    }

}
