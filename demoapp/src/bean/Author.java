package bean;

public class Author {
    private int authorId;
    private String authorName;
    private String email;
    public int getAuthorId() {
        return authorId;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getEmail() {
        return email;
    }
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setEmail(String email) {
        this.email = email;
    }       
}
