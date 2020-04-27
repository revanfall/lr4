import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        //зад.1
        User user = new User();
        user.setName("Illia");
        String street1 = Utils.$get(user.getAddress(), Address::getStreet);
        System.out.println(street1);
        Address addr = new Address();
        addr.setStreet("Pupkina ul.");
        user.setAddress(addr);
        String street2 = Utils.$get(user.getAddress(), Address::getStreet);
        System.out.println(street2);

        double payment= Files.lines(Paths.get("C:\\Users\\Ilya\\Desktop\\paym.txt")).filter(line->line.startsWith("#")).map(line->line.split("#")
                [2].trim()).map(sal->Double.parseDouble(sal)).reduce(0.0,(total,s)->total+s);
        System.out.println(payment);

        //зад.2 вар 14
        String text="AILaLAiA";
        List<String> toRemove = Arrays.asList("a", "A");


        text = Pattern.compile("").splitAsStream(text)
                .filter(s -> !toRemove.contains(s))
                .collect(Collectors.joining());
        System.out.println(text);

        //зад. 3
        //Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>
        List<String> list=new ArrayList<>();
        list.add("qwerty");
        list.add("illia");
        list.add("liza");
        Ex3 e=new Ex3();
        System.out.println(e.streamsToUpper(list));

    }
}
