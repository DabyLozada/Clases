
public class tiposdejuegos {
    private String lucha;
    private String laberinto;
    private String futbol;
    private boolean juegos;
    
    //Metodos
    public void Ganar(){
        System.out.println("Ingresar....");
    }
    public void Perder(){
        System.out.println("Desperdiciar....");
    }
    public boolean consultarjuegos(){
        System.out.println("escoger....");
        return this.juegos;
    }
}