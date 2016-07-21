package ch11_7;
//111
class Rectangle {
    int width;
    int height;
    void setSize(int w, int h) {
        width = w;
        height = h;
    }
    int getArea() {
        return width * height;
    }
    public static String toString(int width, int height){
    	return "Rectangle (" + width +","+ height +")";
    }


    public static void main(String[] args){
    	Rectangle r = new Rectangle();
    	r.setSize(123,45);
    	System.out.println(toString(r.width,r.height));
    }
}
