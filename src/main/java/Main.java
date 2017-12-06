public class Main {

    public static Converter convert = new Converter();
    public static Skaiciavimai skaiciavimai = new Skaiciavimai();

    public static void main(String[] args) {
        System.out.println("Septintas projektas");
        System.out.println("Skaiciavimai");
        System.out.println(skaiciavimai.dalyba(4,5));
        System.out.println(skaiciavimai.daugyba(7,3));
        System.out.println(skaiciavimai.factorialas(7));
        System.out.println(skaiciavimai.perimetras(7,12,5));
        System.out.println(skaiciavimai.zmogus("Lukas","Gaidys"));
        System.out.println(skaiciavimai.sudetis(184,12));
        System.out.println(skaiciavimai.plotas(5));
        System.out.println(skaiciavimai.sunkesnisVeiksmas(14,0.2,45,0.2));
        System.out.println("*******************");
        // System.out.println(Converter);
    }

}
