import java.util.*;
import java.util.stream.Collectors;

public class FrequencyWords {
    private Map<String, Integer> resultMap;
    private List<Map.Entry<String, Integer>> listForFrequencyProcessing;
    private String[] source;

    public List<String> FrequencyWords(int quantity) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            result.add(listForFrequencyProcessing.get(i).toString() + " раз(a)");
        }

        return result;
    }

    public String FrequencyWords(String word) {

        String tmpWord = word.toLowerCase(Locale.ROOT);

        for (Map.Entry<String, Integer> map : listForFrequencyProcessing) {
            if (Objects.equals(map.getKey(), tmpWord)) {
                return map.toString() + " раз(а)";
            }
        }

        return null;
    }

    public FrequencyWords(String[] source, boolean isIgnoreCase) {
        this.source = source;
        fillMapOfWords(isIgnoreCase);
        fillListTopNHighFrequencyWords();
    }

    public FrequencyWords(String[] source) {
        this.source = source;
        fillMapOfWords(false);
        fillListTopNHighFrequencyWords();
    }

    private void fillListTopNHighFrequencyWords() {

        listForFrequencyProcessing = new ArrayList<>(resultMap.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .collect(Collectors.toList()));

    }

    private void fillMapOfWords(boolean isIgnoreCase) {
        resultMap = new HashMap<>();
        String tmp;

        for (int i = 0; i < this.source.length; i++) {

            if (isIgnoreCase) {
                tmp = this.source[i].toLowerCase(Locale.ROOT);

            } else {
                tmp = this.source[i];
            }

            if (resultMap.containsKey(tmp)) {
                resultMap.put(tmp, resultMap.get(tmp) + 1);

            } else {
                resultMap.put(tmp, 1);
            }
        }

    }

}