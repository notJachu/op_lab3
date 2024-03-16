package point;

public class ZlozenieTransformacji implements Transformacja{
    private final Transformacja[] tablicaTransformacji;
    public ZlozenieTransformacji(Transformacja... tablicaTransformacji) {
        this.tablicaTransformacji = tablicaTransformacji;
    }

    public ZlozenieTransformacji(int num){
        this.tablicaTransformacji = new Transformacja[num];
    }

    public void setTransformacja(int index, Transformacja transformacja){
        tablicaTransformacji[index] = transformacja;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {
        Transformacja[] tablicaTransformacjiOdwrotnych = new Transformacja[tablicaTransformacji.length];
        for (int i = 0; i < tablicaTransformacji.length; i++) {
            tablicaTransformacjiOdwrotnych[i] = tablicaTransformacji[tablicaTransformacji.length - 1 - i].getTransformacjaOdwrotna();
        }
        return new ZlozenieTransformacji(tablicaTransformacjiOdwrotnych);
    }

    @Override
    public Punkt transformuj(Punkt p) {
        Punkt wynik = p;
        for (Transformacja transformacja : tablicaTransformacji) {
            wynik = transformacja.transformuj(wynik);
        }
        return wynik;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zlozenie transformacji: ");
        for (int i = 0; i < tablicaTransformacji.length; i++) {
            sb.append(tablicaTransformacji[i]);
            if (i < tablicaTransformacji.length - 1) {
                sb.append(" -> ");
            }
        }
        return sb.toString();
    }
}
