package section03.decorator._01_before;

/*
 * inheritance를 이용
 */
public class App {

    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new CommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentService();
        }
        if (enabledTrimming) {
            commentService= new TrimmingCommentService();
        }

        if (enabledSpamFilter && enabledTrimming) {
            // 어떻게 구현??? (상속 클래스를 또 만들어야하나)
            //commentService= new SpamFilteringAndTrimmingCommentService();
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재미있을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }
}
