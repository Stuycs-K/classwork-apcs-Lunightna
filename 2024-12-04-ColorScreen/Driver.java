public class Driver{
    public static void main(String[]args){
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);
        border();
        Text.wait(2000);
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
}