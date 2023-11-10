

public class Names{

    public static void main(String args[]){
        String names[] = new String[4];
        names[0] = "Ariana";
        names[1] = "Juliet";
        names[2] = "Kayigwa";
        
        int space = 3;
        int position = 1;
        while(space > position){
            names[space] = names[space -1];
            space = space -1;
        }
        if (space == position){
            names[position]= "Malaika";
            System.out.print("[");
            for(int i = 0; i< 4; i++){
                System.out.print(names[i]+ " ");
            }
            System.out.print("]");
          
        }
        else{
            System.out.println("It didnt work");
        }
    }
    
}