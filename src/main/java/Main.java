public class Main {
    public static  void main(String[] args) {

        FormDate date = new FormDate();
        date.day = 11;
        date.month = 2;
        date.year = 1994;

        Post post = new Post();
        post.surname = "Gashkov";
        post.name = "Din";
        post.patronymic ="Alekseevich";
        post.birthday = date;
        post.subscription = true;
        post.passport = "1512 965789";
        post.phone = "7-918-569-88-55";

    }
}
