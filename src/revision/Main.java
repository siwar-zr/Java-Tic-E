package revision;

public class Main {
    public static void main(String[] args){
        CompteBancaire cb1 = new CompteBancaire("126699",100);
        try{
            cb1.retrait(80);
        }catch(SoldeInsuffisantException e){
            System.out.println(e.getMessage());
        }
    }
}
