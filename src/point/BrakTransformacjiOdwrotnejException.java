package point;

public class BrakTransformacjiOdwrotnejException extends Exception{
    public BrakTransformacjiOdwrotnejException()
    {
        //Niejawne wywołanie konstruktora klasy nadrzędnej
        //super();
    }
    /*
     * Konstruktor przyjmujący jako parametr tekst opisujący błąd
     */
    public BrakTransformacjiOdwrotnejException(String message) {
        super(message);
    }
    /*
     * Konstruktor przyjmujący jako parametr referencje do innego
     * wyjątku, który spowodował błąd
     */
    public BrakTransformacjiOdwrotnejException(Throwable cause) {
        super(cause);
    }
    public BrakTransformacjiOdwrotnejException(String message, Throwable cause) {
        super(message, cause);
    }
}
