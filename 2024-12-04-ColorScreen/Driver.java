import java.util.Random;

public class Driver{
    public static void main(String[]args){
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);
        border();
        ints();
        extra();
        System.out.print(Text.HIDE_CURSOR);
        Text.wait(500);
        Text.go(31,0);
        System.out.println(Text.RESET);
        
    }
    public static void border(){
        for(int i = 0; i<80; i++){
            Text.go(0,i);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.RED));
            System.out.print(" ");
        }
        for (int i = 0; i<80; i++){
            Text.go(29, i);
            Text.color(Text.BRIGHT, Text.GREEN, Text.background(Text.CYAN));
            System.out.print(" ");
        }
        for (int i = 0; i < 30; i++) {
            Text.go(i, 0);
            Text.color(Text.BRIGHT, Text.MAGENTA, Text.background(Text.YELLOW));
            System.out.print(" ");
            Text.go(i, 79);
            Text.color(Text.BRIGHT, Text.MAGENTA, Text.background(Text.GREEN));
            System.out.print(" ");
        }
    }

    public static void ints(){
        Random nums = new Random();
        int[] arr = new int[3];
        for(int i = 0; i<3; i++){
            arr[i] = nums.nextInt(100);
        }

        int[] row1 = {20,40,60};
        Text.go(2,0);
        System.out.print(Text.RESET);
        for(int i = 0; i < 3; i++){
            Text.go(2,row1[i]);
            if(arr[i]<25){
                Text.color(Text.BRIGHT, Text.RED);
            }
            else if(arr[i]>75){
                Text.color(Text.BRIGHT, Text.GREEN);
            }
            else{
                Text.color(Text.WHITE);
            }
            System.out.print(arr[i]);
        }
        Text.go(3,1);
        Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.YELLOW));
        for(int i = 2; i<79; i++){
            Text.go(3,i);
            System.out.print(".");
        }
    }

    public static void extra(){
        int x4 = 15;
        int y4 = 10;
        System.out.print(Text.RESET);
        // A
        for(int i = 0; i<10; i++){
            Text.go(y4+4, x4+i);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.CYAN));
            System.out.print(" ");
        }
        for(int i = 0; i<10; i++){
            Text.go(y4+i, x4+9);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.BLUE));
            System.out.print(" ");
        }
        for(int i = 0; i<10; i++){
            Text.go(y4, x4+i);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.RED));
            System.out.print(" ");
        }
        for(int i = 0; i<10; i++){
            Text.go(y4+i, x4);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.WHITE));
            System.out.print(" ");
        }
        
        // P
        int x3 = 30;
        int y3 = 15;
        for(int i = 0; i<10; i++){
            Text.go(y3+4, x3+i);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.CYAN));
            System.out.print(" ");
        }
        for(int i = 0; i<5; i++){
            Text.go(y3+i, x3+9);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.BLUE));
            System.out.print(" ");
        }
        for(int i = 0; i<10; i++){
            Text.go(y3, x3+i);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.MAGENTA));
            System.out.print(" ");
        }
        for(int i = 0; i<10; i++){
            Text.go(y3+i, x3);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.WHITE));
            System.out.print(" ");
        }
        // C
        int x = 45;
        int y = 10;
        for(int i = 0; i<10; i++){
            Text.go(y, x+i);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.RED));
            System.out.print(" ");
        }
        for(int i = 0; i<10; i++){
            Text.go(y+9, x+i);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.CYAN));
            System.out.print(" ");
        }
        for(int i = 0; i<10; i++){
            Text.go(y+i, x);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.WHITE));
            System.out.print(" ");
        }
        for(int i = 0; i<10; i++){
            Text.go(y+i, x+9);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.BLACK));
            System.out.print(" ");
        }
        // S
        int x2 = 60;
        int y2 = 15;
        for(int i = 0; i<10; i++){
            Text.go(y2, x2+i);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.MAGENTA));
            System.out.print(" ");
        }
        for(int i = 0; i<10; i++){
            Text.go(y2+9, x2+i);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.BLACK));
            System.out.print(" ");
        }
        for(int i = 0; i<10; i++){
            Text.go((y2+9)-5, (x2+i));
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.CYAN));
            System.out.print(" ");
        }
        for(int i = 0; i<10; i++){
            Text.go((y2+9), (x2+i));
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.CYAN));
            System.out.print(" ");
        }
        for(int i = 0; i<5; i++){
            Text.go(y2+i, x2);
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.WHITE));
            System.out.print(" ");
        }
        for(int i = 0; i<5; i++){
            Text.go(y2+i+5, (x2+9));
            Text.color(Text.BRIGHT, Text.BLUE, Text.background(Text.BLUE));
            System.out.print(" ");
        }
    }
}