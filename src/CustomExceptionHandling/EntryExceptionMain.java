package CustomExceptionHandling;

public class EntryExceptionMain {
    public static void main(String[] args) {
        EntryException entryException = new EntryException();
        try {
            entryException.checkAge(20);
        }catch (ClubException e){
            e.printStackTrace();
        }
    }
}
