public class Solution {
    public String reverseVowels(String s) {
        List<String> vowels = new ArrayList<String>();
        Stack valueStack = new Stack();
        List<String> keys = new ArrayList<String>();
        HashMap<String, String> keyvalues = new HashMap<String, String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        
        StringBuffer sb = new StringBuffer();
        
        int stringSize = s.length();
        for (int i = 0; i < stringSize; i++) {
            char c = s.charAt(i);
            if (vowels.contains(String.valueOf(c))) {
                sb.append(i + "");
                keys.add(i + "");
                valueStack.push(String.valueOf(c));
            } else
                sb.append(c);
        }
        
        int index=0;
        while (!valueStack.empty()) {
            String key = keys.get(index);
            String value = valueStack.pop().toString();
            keyvalues.put(key,value);
            index++;
        }
        
        String resultString = sb.toString();
        Iterator<Map.Entry<String, String>> i = keyvalues.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry<String, String> entry = i.next();
            String k = entry.getKey();
            String v = entry.getValue();
            resultString = resultString.replace(k,v);
        }
        return resultString;
    }
}