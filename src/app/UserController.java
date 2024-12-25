package app;

public class UserController {

    public static void searchUserById(UserRepository repository, int id) {
        repository.findUserById(id).ifPresentOrElse(
                user -> System.out.println("Find user by ID " + id + ": " + user),
                () -> System.out.println("User with ID " + id + " not found.")
        );
    }

    public static void searchUserByEmail(UserRepository repository, String email) {
        repository.findUserByEmail(email).ifPresentOrElse(
                user -> System.out.println("Found user by email " + email + ": " + user),
                () -> System.out.println("User with email " + email + " not found.")
        );
    }

    public static void searchAllUsers(UserRepository repository) {
        repository.findAllUsers().ifPresentOrElse(
                users -> {
                    System.out.println("Number of users: " + users.size());
                    users.forEach(System.out::println);
                },
                () -> System.out.println("No users found.")
        );
    }
}
