public class Curriculum {
    private String code;
    private String subject;
    private String unit;

    public Curriculum(){
        code = "";
        subject = "";
        unit = "";
    }
    public Curriculum(String c, String s, String u){
        code = c;
        subject = s;
        unit = u;
    }

    public String getCode() {
        return code;
    }

    public String getSubject() {
        return subject;
    }

    public String getUnit(){
        return unit;
    }
    public void setCode(String c){
        code = c;
    }
    public void setSubject(String s){
        subject = s;
    }
    public void setUnit(String u){
        unit = u;
    }
    public String toString(){
        return code + ", " + subject + ", " + unit;
    }
}

