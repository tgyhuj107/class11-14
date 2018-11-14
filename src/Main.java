import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        //01
//        int n=scn.nextInt();
//        String str ="";
//        while (n>=2){
//            str =Integer.toString(n%2) + str;
//            n/=2;
//        }
//        str="1"+str;
//        for (int i=1;i<=(8-str.length());i++){
//            System.out.print("0");
//        }
//
//        System.out.println(str);

//        int n=scn.nextInt();
//        String str=Integer.toString(n,2);
//        System.out.println(str);
        //02
//        int n=scn.nextInt(),k=n/2;
//        boolean flag=true;
//        for (int i=2;i<=k;i++){
//            if (n%i==0){
//                flag=false;
//            }
//        }
//        if (flag==false){
//            System.out.println("NO");
//        }else {
//            System.out.println("YES");
//        }
        //03
        int n=scn.nextInt();
        for (int i=1;i<=n;i++){
            int li=scn.nextInt();
            int ri=scn.nextInt();
            int mi=scn.nextInt();
            int sumi=li+ri+mi;
            int fcount=0;
            if (li<60){
                fcount=fcount+1;
            }
            if (ri<60){
                fcount=fcount+1;
            }
            if (mi<60){
                fcount=fcount+1;
            }
            if (fcount==0){
                System.out.println("P");
            }else if (fcount==1&&sumi>=220){
                System.out.println("P");
            }else if (fcount==1){
                System.out.println("M");
            }else if (fcount==2&&Math.max(Math.max(li,ri),mi)>=80){
                System.out.println("M");
            }else {
                System.out.println("F");
            }

        }
    }
}
