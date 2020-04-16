package Compiler;

public enum KeyWords {
    isChair("isChair"),
    isWall("isWall"),
    TurnLeft("Turn Left"),
    TurnRight("Turn Right"),
    Walk("Walk"),
    If("If"),
    Else("Else"),
    END("END"),
    For("For");

    public CharSequence tag;
    private KeyWords(String tag)
    {
        this.tag=tag;
    }

    public static KeyWords ifContains(String line){
        for(KeyWords enumValue:values()){
            if(line.contains(enumValue.toString())){
                return enumValue;
            }
        }
        return null;
    }

}
