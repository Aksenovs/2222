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
double Postroit (){return vozrast;}
int razrychit (){return stag;}

}

class Krovelhik extends Builder
{
    int krovlia;

    public Krovelhik(String name, double vozrast, int stag, int krovlia) {
        super(name, vozrast, stag);
        this.krovlia = krovlia;
    }

    public static void main(String[] args) {
        Krovelhik A;
        A = new Krovelhik("a");
    }

}
