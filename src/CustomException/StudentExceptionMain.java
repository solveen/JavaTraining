package CustomException;

public class StudentExceptionMain {
    public static void main(String[] args) {
        StudentException studentException = new StudentException();
        try{
            studentException.checkAge(2);

        }catch (AgeException e){
            e.printStackTrace();
            //e.getMessage() le exception print garne kam garxa
          //  System.out.println("Exception Occurs: " + e.getMessage());

        }
    }


}
