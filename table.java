public class table{
    public static void main(String[] args){
        // int n=5;
        // for (int i=1;i<=50;i++){
        //     System.out.println(n+"x"+i+"="+(n*i));
        // }

        String s1="Hello";
        String s2="Hello";
        System.out.println(s1==s2);

        String s3=new String("Hello");
        System.out.println(s1.equals(s3));

        String s4="Hello";
        s4=s4+"World";
        System.out.println(s4);
    }
}