package Iterator_Pattern;

import java.time.LocalDate;

class Post {
    String title; // 게시글 제목
    LocalDate date; // 게시글 발행일

    public Post(String title, LocalDate date) {
        this.title = title;
        this.date = date;
    }
}

