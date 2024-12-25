package app;

public class Main {

    public static void main(String[] args) {

        UserRepository repository = new UserRepository();

        repository.addUser(new User(1, "First", "first@gmail.com"));
        repository.addUser(new User(2, "Second", "second@gmail.com"));
        repository.addUser(new User(3, "Third", "third@gmail.com"));
        repository.addUser(new User(4, "Fourth", "fourth@gmail.com"));


        UserController.searchUserById(repository,3);
        UserController.searchUserById(repository,6);
        UserController.searchUserByEmail(repository, "Second@gmail.com");
        UserController.searchUserByEmail(repository, "Zero@gmail.com");
        UserController.searchAllUsers(repository);
    }
}
