class Room{
    float length, breadth;
    void getData(float a, float b){
        length =a;
        breadth=b;
    }
    float calculateArea(){
        return length * breadth;
    }
}

class RoomArea{
    public static void main(String args[]){
        float area;
        Room room1 = new Room();   // Create an object room1
        room1.getData(14,10);      // Assign value to length and breadth
        area = room1.calculateArea();
        System.out.println("Area =" + area);
    }
}