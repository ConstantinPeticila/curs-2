package exceptii;

public class Main {

    public static void main(String[] args) {
        User user = null;
//        System.out.println(user.getNume());

        try {
            double rezultat = calculImpartire(2, 1);
            System.out.println("Rezultatul este: " + rezultat);
        }catch (ImpartireIlegalaException  e){
            System.out.println("s-a incercat impartirea la 0 ");
//            throw new RuntimeException("nu mai imparti la 0 !!!");
        } finally {
            System.out.println("se executa mereu");
        }

   /*     Integer[] arr = {1,2,3,4};
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }*/
    }

    private static double calculImpartire(int nr1, int nr2) throws ImpartireIlegalaException {
        if(nr2==0){
            throw new ImpartireIlegalaException("S-a incercat impartirea la 0");
        }
        return (nr1/nr2);
    }
}
