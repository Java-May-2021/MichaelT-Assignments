public class StringManipulator{
    public String trimAndConcat(String string1, String string2){
        return string1.trim().concat(string2.trim());
    }

    public Integer getIndexOrNull(String string1, char char1){
        if(string1.indexOf(char1) < 0){
            return null;
        }
        return string1.indexOf(char1);
    }

    public Integer getIndexOrNull(String string1, String string2){
        if(string1.indexOf(string2) < 0){
            return null;
        }
        return string1.indexOf(string2);
    }

    public String concatSubstring(String string1, int int1, int int2, String string2){
        String sub = string1.substring(int1, int2);
        return sub.concat(string2);
    }
}