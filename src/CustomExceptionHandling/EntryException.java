package CustomExceptionHandling;

public class EntryException {

    public void checkAge(int age) throws ClubException{
        if (age < 21){
           throw new ClubException("You are not allowed in the club");
        }else
            System.out.println("You are allowed to enter");

    }
}
