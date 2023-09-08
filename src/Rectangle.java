public class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calcArea() {
        return this.width * this.height;
    }

    public int calcPerimeter() {
        return (this.width + this.height) * 2;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(7, 4);
        System.out.println("Hình chữ nhật có chiều dài là: " + rect.getWidth() + ", chiều rộng là: " + rect.getHeight());
        rect.setWidth(2);
        rect.setHeight(5);
        System.out.println("Chu vi: " + rect.calcPerimeter() + ", diện tích: " + rect.calcArea());
    }
}
