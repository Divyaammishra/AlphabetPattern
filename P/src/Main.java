public class Main {
    public static void main(String[] args) {

        for (int i=1; i<=3; i++){
            for(int j=1; j<=4; j++){
                if(i==1 || j==1 || i==3 || j==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for (int i=1; i<=2; i++){
            for(int j=1; j<=3; j++){
                if(j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}