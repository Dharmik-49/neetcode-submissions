class Solution {

    public String encode(List<String> strs) {
          StringBuilder sb = new StringBuilder();
          for(String str : strs){
            sb.append(str.length()).append("#").append(str);
          }
          return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decodeString = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int sepindex = str.indexOf("#",i);
            int length = Integer.parseInt(str.substring(i,sepindex));
            i=sepindex+1;
            String decodedString = str.substring(i,i+length);
            decodeString.add(decodedString);
            i=i+length;
        }
        return decodeString;
    }
}