public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.passport = "4444 № 4444444444";
        post.patronymic = "Иванович";
        post.phone = "+7(923)7777777";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;


    }
}
