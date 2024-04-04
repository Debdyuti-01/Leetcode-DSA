public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {

        StringBuilder encodedString = new StringBuilder();
        for(String i:strs)
        {
            encodedString.append(i.length()).append("#").append(i);
        }

        return encodedString.toString();
        
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {

        List<String> outputString = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {

            // Finding the delimiter (first is the character I want to find, index from which search should start from)
            int delimiter = s.indexOf("#", i);

            // Finding the digit before delimiter i.e the length of the first 'element' in the entire list
            int length = Integer.parseInt(s.substring(i, delimiter));

            // Retrieve the string which is after delimiter
            String str = s.substring((delimiter + 1), (delimiter + 1 + length));

            // Add the string to the new output list
            outputString.add(str);
            // Moving the index to the start of the next length.
            i = delimiter + 1 + length;
        }
        return outputString;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));