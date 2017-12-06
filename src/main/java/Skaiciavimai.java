public class Skaiciavimai {

    public int plotas(int x){
        return x*x;
    }
    public int perimetras(int b,int a,int c)
    {
        return a+b+c;
    }
    public int daugyba(int a, int b){
        return a*b;

    }
    public int sudetis(int a, int b){
        return a+b;
    }
    public double dalyba(int a, int b)
    {
        return a/b;
    }
    public double sunkesnisVeiksmas(int a, double b, int c, double d)
    {
        return a*b/(c*d);
    }
    public long factorialas(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }
    public String zmogus(String vardas, String pavarde)
    {
        return vardas + " " + pavarde;
    }


}
