abstract class Shape{
    int r, l, b;    
    abstract double calculateArea();
}

class Circle extends Shape{
    Circle(int r){
        this.r=r;
    }

    double calculateArea() {
        return (2*3.14*r);
    }
}

class Rectangle extends Shape{
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    double calculateArea(){
        return (l*b);
    }
}


class ShapeAbs {
    public static void main(String[] args) {
        /*Shape a;               // reference
        a= new Circle(1);
        System.out.println(a.calculateArea());
        a= new Rectangle(4, 3); 
        System.out.println(a.calculateArea());  */
        Circle a = new Circle(1);
        Rectangle rec = new Rectangle(1, 2);
        System.out.println(a.calculateArea());
        System.out.println(rec.calculateArea());
    }
}
