package CustomException;

public class StudentException {

    public void checkAge(int age) throws AgeException{
        if ( age < 18){
            throw new AgeException("Cannot Vote");
        }else {
            System.out.println("Can vote");
        }
    }

}
