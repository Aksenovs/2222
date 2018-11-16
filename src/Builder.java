public class Builder
{
    String name = "Vova";
    double vozrast = 34.5;
    int stag = 2;

    public Builder(String name, double vozrast, int stag)
    {
        this.name = name;
        this.vozrast = vozrast;
        this.stag = stag;
    }

}

class Krovelhik extends Builder
{
    int krovlia=5;


    public Krovelhik(String name, double vozrast, int stag) {
        super(name, vozrast, stag);
        Krovelhik A = new Krovelhik();
    }
}

class itog {
    public static void main(String[] args) {
        System.out.println();
    }
}