import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex3 {
    public List<Map<String, String>> streamsToUpper(List<String> list) {
        List<Map<String, String>> map = new ArrayList<>();
        Map<String, String> streamMap = list.stream().collect(Collectors.toMap(str -> str, String::toUpperCase));
        map.add(streamMap);
        return map;
    }
}