class Solution {
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" ")).map(str->new StringBuilder(str).reverse().toString()).collect(Collectors.joining(" "));
    }
}
