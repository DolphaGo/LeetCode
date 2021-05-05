class Solution {
    public String restoreString(String s, int[] indices) {
        char[] answer = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            answer[idx] = s.charAt(i);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            sb.append(answer[i]);
        }
        
        return sb.toString();
    }
}