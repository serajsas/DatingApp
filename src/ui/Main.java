package ui;

import model.*;

public class Main {
    public static void main(String[] args) {
        Binder binder = new Binder();
        for (int i=0;i<1000;i++){
            User userTypes = new User(new UserInformation(Integer.toString(i),
                    Integer.toString(i)),binder);
            binder.addUser(userTypes);
        }

//



    }
}
