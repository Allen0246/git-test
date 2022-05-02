public class first {
    public static void main(String[] args) {
        first lgp= new first();
        int osszeadas = lgp.osszeadas("3","5");
        System.out.println("valami");
    }
    private static int osszeadas(String a, String b){
        int szam1= Integer.parseInt(a);
        int szam2= Integer.parseInt(b);
        return szam1+szam2;
    }
}
