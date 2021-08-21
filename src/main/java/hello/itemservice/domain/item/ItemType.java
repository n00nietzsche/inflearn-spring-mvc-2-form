package hello.itemservice.domain.item;

public enum ItemType {
    // enum에 필드를 하나 줄 것을 추측할 수 있음
    Book("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    ItemType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
