package Iterator_Pattern;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        // 1. 게시판 생성
        Board board = new Board();

        // 2. 게시판에 게시글을 포스팅
        board.addPost("디자인 패턴 강의 리뷰", LocalDate.of(2020, 8, 30));
        board.addPost("게임 하실분", LocalDate.of(2020, 2, 6));
        board.addPost("이거 어떻게 하나요?", LocalDate.of(2020, 6, 1));
        board.addPost("이거 어떻게 하나요?", LocalDate.of(2021, 12, 22));

        List<Post> posts = board.getPosts();

        // 3. 게시글 발행 순서대로 조회하기
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.title + " / " + post.date);
        }

        // 4. 게시글 날짜별로 조회하기
        Collections.sort(posts, (p1, p2) -> p1.date.compareTo(p2.date)); // 집합체를 날짜별로 정렬
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.title + " / " + post.date);
        }
    }
}
