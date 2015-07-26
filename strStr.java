class Solution {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
		if(source == null || target == null || target.length() > source.length()){
			return -1;
		}
        if(target == ""){
            return 0;
        }
		if(target.length == 1){
			for(int i = 0 ; i < source.length() ; i++){
				if(source.charAt(i) == target.charAt(0)){
					return i;
				}
			}
			return -1;
		}
		int pos = 0;
		while(pos <= source.length() - target.length()){
			if(source.charAt(pos) != target.charAt(0)){
				pos++;
				continue;
			}
			int i = pos + 1;
			int j = 1;
			while(j < target.length()){
				if(source.charAt(i) != target.charAt(j)){
					break;
				}
				i++;
				j++;
			}
			if(j == target.length()){
				return pos;
			}
		}//write your code here
        return -1;
    }
}