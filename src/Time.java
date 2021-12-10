public class Time {
    public static void main(String[] args) {
        int hour = 22;
        int min = 51;
        int sec = 45;
        int minuta = 60;
        int godzina = 3600;
        int doba = 24;
        int odPolnocy = ((hour * 3600)+(min * 60)+(sec));
        int doPolnocy = ((minuta-sec)+((doba-hour)*godzina)-(godzina-(min*60)));
        double ulamek = ((doba*godzina)/odPolnocy);
        int hour2 =23;
        int min2 = 52;
        int sec2=57;
        int czasNaZadanie = ((hour2 * 3600)+(min2 * 60)+(sec2))-odPolnocy ;
        System.out.println("Od północy minęło sekund: " + odPolnocy);
        System.out.println("Do końca dnia zostało: " + doPolnocy);
        System.out.println("Odsetek dnia który minął: " + ulamek);
        System.out.println("Zadanie zajęło mi: "+czasNaZadanie);
    }
}
