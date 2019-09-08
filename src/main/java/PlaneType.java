public enum PlaneType {
    AIRBUSA380(560000, 555 ),
    BOEING747(333400, 416),
    AIRBUSA320(73500, 180),
    BOEING787(227930, 300);

    private final int totalWeight;

    private final int capacity;

    PlaneType(int totalWeight, int capacity){
        this.totalWeight = totalWeight;
        this.capacity = capacity;
        }

       public int getTotalWeight(){
        return this.totalWeight;
       }

       public int getCapacity(){
        return this.capacity;
       }


    }








