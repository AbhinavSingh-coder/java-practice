

public class accessmodifier {
    public static void main(String[] args) {
        Bankaccount myAccount = new Bankaccount();
        myAccount.username = "Abhinav Singh";
        myAccount.setpwd("abjkbk");
        
    }

}

    class Bankaccount{
        public String username;
       private String password;
       public void setpwd(String pwd){
       password = pwd;
       }
    }
    
    

