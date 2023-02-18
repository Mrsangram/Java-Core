class  Room {
	  
	  float lenght;
	   float weight;

	  void getData(float l,float w){
	  	lenght = l;
	  	weight = w;
	  }
}
class RoomArea{
    public float Cal() {
        float area;
        Room rooml = new Room();
        rooml.getData(10,34);
        area = rooml.lenght*rooml.weight;
        return area;
    }
}
class Result{
    public static void main(String[] args) {
        RoomArea roma = new  RoomArea();
        roma.Cal();
    }
}
