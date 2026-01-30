package org.example.encapsulationEg;


public class b {

    private int id;
    protected static String pname;
    public static int r;

    public int index(){
        return id;
    }
    public void setId(int id){
        this.id = id;
        System.out.println(id);
    }
    public static void main(String[] args) {
       b b=new b();
       b.setId(14488);
       r=77;
       pname ="keyboard";
        System.out.println(pname);
    }
}
