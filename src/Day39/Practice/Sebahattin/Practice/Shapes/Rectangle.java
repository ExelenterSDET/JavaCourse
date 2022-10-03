package Day39.Practice.Sebahattin.Practice.Shapes;

public class Rectangle {

        double length ;
        double width;
        double perimeter;
        double area;

        public void setRectangleSides (double length, double width){

            this.length = length;
            this.width = width;

        }
        public void setPerimeter(){
            this.perimeter = 2*(this.length+this.width);
        }
        public void setArea(){
            this.area = this.length*this.width;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "length=" + length +
                    ", width=" + width +
                    ", perimeter=" + perimeter +
                    ", area=" + area +
                    '}';
        }

}
