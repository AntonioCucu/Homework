package ro.siithw3;

public class Books {

    private String name;
    private int pages;

    Books(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
