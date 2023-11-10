
public class Names2 {
    public int location;
    public String name;
    public static void insert(String name, int location){
        String names[] = new String[4];
        names[0] = "Ariana";
        names[1] = "Juliet";
        names[2] = "Kayigwa";
         
        int space;
        for(space = 3; space > location; space--){
            names[space] = names[space -1];  
        }
        if (space == location){
            names[location] = name;
            System.out.println(names[1]);
            for(int i = 0; i< 4; i++){
                System.out.print(names[i]+ ",");
            }
        }
    }
    public static void main(String args[]){
         insert("Malaika", 1);
         
    }

}
