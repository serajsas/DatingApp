package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Binder implements Observer {
    private List<User> users;

    public Binder() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
        }
    }

    private void notifyUser(User user, User liker) {
        System.out.println(user.getUserInformation().getUserName() + " has matched with: "
                + liker.getUserInformation().getUserName());
    }

    private void pushNotification(User liker, User likedUser) {
        if (isMatched(liker, likedUser)) {
            notifyUser(liker, likedUser);
            notifyUser(likedUser, liker);
        }
    }

    //EFFECTS: Check when a liker likes likedUser and returns true in case it's a match
    //         Otherwise return false
    private boolean isMatched(User liker, User likedUser) {
        if (likedUser.isLiked(liker)) {
            liker.match(likedUser);
            likedUser.match(liker);
            return true;
        }
        return false;
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof User) {
            User liker = (User) o;
            User likedUser = (User) arg;
            pushNotification(liker, likedUser);

        }
    }


}
