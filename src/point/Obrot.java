package point;

public class Obrot implements Transformacja{
    private final double kat;
    public Obrot(double kat) {
        this.kat = kat;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() {
        return new Obrot(-kat);
    }
    @Override
    public Punkt transformuj(Punkt p) {
        double x = p.getX();
        double y = p.getY();
        double xPrim = x * Math.cos(kat) - y * Math.sin(kat);
        double yPrim = x * Math.sin(kat) + y * Math.cos(kat);
        return new Punkt(xPrim, yPrim);
    }
    public double getKat() {
        return kat;
    }
    @Override
    public String toString() {
        return "Obrot o kat "+kat;
    }
}
