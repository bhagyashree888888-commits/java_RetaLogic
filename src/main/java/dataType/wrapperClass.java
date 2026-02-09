package dataType;

public class wrapperClass {
    public static void main(String[] args) {
        int id=12345;
        Integer idNo=1234;
        System.out.println(id +" "+idNo);
        System.out.println(Integer.valueOf(idNo));
        System.out.println(Integer.valueOf(id));

        Integer a = Integer.valueOf(10);
        Integer b = Integer.valueOf(10);
        System.out.println(a == b);

        Integer aa = new Integer(10);
        Integer bb = new Integer(10);
        System.out.println(aa == bb);

    }
}
