package ClaseDeBaza;

public class ExempleString {

    public static void main(String[] args) {
        String text = "   Un text reprezentand o propozitie  ";

//        text = "text";
        System.out.println(text);
        System.out.println(text.contains("text"));
        System.out.println(text.toUpperCase().toString());
        System.out.println(text.replace("propozitie", "altceva"));
        char[] chars = text.toCharArray();
        for(char caracter: chars){
            System.out.println(caracter);
        }
        String textFinal = text.trim();
        System.out.println(textFinal);
    }
}
