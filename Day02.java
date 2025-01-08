
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Day02 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        ArrayList<String> motorbike = new ArrayList<>();
        motorbike.add("Kawasaki");
        motorbike.add("Supra Bapak");
        motorbike.add("Vespa senja");

        for(int i = 0; i < motorbike.size(); i++){
            System.out.println(motorbike.get(i));
        }

        motorbike.set(2, "Vixion Jari Jari");

        for(String item : motorbike) {
            System.out.println(item);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);

        Integer totalinteger = 0;


        for(Integer integer : numbers) {
            System.out.println(integer);
        }

        for(Integer integer : numbers) {
            totalinteger += integer;
        }

        System.out.println(totalinteger);

        String nEscapeChar = "Pembekalan\nJava";
        System.out.println(nEscapeChar);

        String  tEscapeString = "Pembekalan\tJava";
        System.out.println(tEscapeString);

        String ewString = "\"Football is simple, but playing simple football is the hard thing to do\" \nJohan Cryiff";
        System.out.println(ewString);

        String name = "Mamat";
        System.out.println(name + "\rMuhammad");

        name = "Ma";
        String names = name.concat("ximum");
        System.out.println("Nama : " + names);
        
        String gigi = "Tooth";
        char[] gigiChar = gigi.toCharArray();
        gigiChar[1] = 'e';
        System.out.println(String.valueOf(gigiChar));

        String xsis = "PT XSIS Mitra Utama 1234567890 ~!@#$%^&*()_+";

        System.out.println(xsis);
        System.out.println(xsis.replaceAll("[A-Za-z]", " "));
        System.out.println(xsis.replaceAll("[^A-Za-z]", " "));
        System.out.println(xsis.replaceAll("[\\d]", " "));
        System.out.println(xsis.replaceAll("[^\\D]", " "));
        System.out.println(xsis.replaceAll("[A-Za-z0-9]", " "));
        System.out.println(xsis.replaceAll("[^A-Za-z0-9]", " "));

        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("status", "200");
        responseMap.put("message", "success");
        responseMap.put("data", "asus");

        System.out.println(String.valueOf(responseMap));





    }

    
}
