package services;

import java.util.ArrayList;
import java.util.List;
import models.User;

public class DatabaseService {

    private static List<User> users = new ArrayList<>();
    private static User currentUser;

    public static void addUser(User user) {
        users.add(user);
    }

    public static List<User> getAllUsers() {
        return users;
    }
    
    public static void setCurrentUser(User user) {
        currentUser = user;
    }

    public static User getCurrentUser() {
        return currentUser;
    }
}
