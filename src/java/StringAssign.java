public class StringAssign{



    public static void main(String args[]){

        String s1="hello";
        String s2="world";
        String str= new String("demo");
        System.out.println(s1.concat(s2));
        System.out.println(s1.equals(s2));
        System.out.println(str);
        System.out.println(s1==s2);
        System.out.println(s1.length());
        System.out.println(s2.endsWith("ld"));
        System.out.println(str.endsWith("em"));
        System.out.println(s1.contains("ho"));
        System.out.println(str.contains("mo"));
        System.out.println(s2.charAt(0));
    }

}