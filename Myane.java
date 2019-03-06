package tamrinha;

public class Myane {

    public static void main(String[] args) {

        float [] ar={1,2,3,4,5,6,7,8};

        int cunt=0;
        int miid=0;

        for(float i:ar){
            cunt++;
        }

        if(cunt %2==0){
            System.out.println("آرایه زوج");
            float j=0f;

            j=(ar[cunt/2]+ar[(cunt/2)-1])/2;
            System.out.println("میانه= "+j);
        }else {
            System.out.println("آرایه فرد");
            float j=0;

            j = ( ar[(cunt / 2) ]);
            System.out.println("میانه= " + j);
        }






    }


}
