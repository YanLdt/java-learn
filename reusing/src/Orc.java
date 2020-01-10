class Villian{
    private String name;
    protected void set(String nm) {
        name = nm;
    }
    public Villian(String name) {
        this.name = name;
    }
    public String toString(){
        return "I'm a Villian and my name is " + name;
    }
}
public class Orc extends Villian{
    private int OrcNumber;
    public Orc(String name, int orcnumber){
        super(name);
        this.OrcNumber = orcnumber;
    }

    public void change(String name, int orcnumber){
        set(name);
        this.OrcNumber = orcnumber;
    }
    public String toString(){
        return "Orc " + OrcNumber + ": " + super.toString();
    }

    public static void main(String[] args){
        Orc orc = new Orc("ly", 12);
        System.out.println(orc);
        orc.change("zy", 13);
        System.out.println(orc);
    }
}
