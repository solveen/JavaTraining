package ArrayString;

public class StrArray {

    public void strArr(){

        //Declare
        String[] st = {"Hello", "world", "How", "are" , "you"};
        //initialize
        String[] str = new String[7];
        int[] b = {0,1,2,34};

        //assign the value by index numbers
        str[0] = "y";
        str[1] = "e";
        str[2] = "s";
        str[3] = "s";
        str[4] = "!";
        str[5] = "!";
        str[6] = "!";
        System.out.println(st[0] + " " + st[1] + " " + st[2] + " " + st[3]);
        System.out.println(str[0] + str[1] + str[2] + str[3] + str[4] + str[5] + str[6]);

        // array ko sabai value lina ko lagi loop use garne
        for (int i = 0 ; i < st.length; i++){
            String s = st[i];
//            System.out.println(s);
            System.out.println("This is array" + " " + i + " " + s);
        }

        for(int i : b)
        {
//            System.out.println(b[i]);
            System.out.println("This is array" + " " + i );
        }

        // String ko ali different hunxa string ko variable print hane hunxa
        for(String a : st){
            System.out.println(a);
        }

        for(String c : str){
            System.out.println(c);
         System.out.println("This is array" + " " + c);
        }


    }
}
