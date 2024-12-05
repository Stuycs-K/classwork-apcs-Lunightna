public class ColorDemo{
    public static void main(String[] args){
        for(int r = 0; r < 256; r+=21){
            for(int g = 0; g <= 256; g+=10){
                for(int b = 0; b <= 256; b+=52){
                    System.out.print("\u001b[38;5;"+r+";"+g+";"+b+";7m.");
                    }
                }
            System.out.println();
            }
        sleep(2000); 
        System.out.print(CLEAR_SCREEN);
        System.out.print(MOVE_CURSOR_TOP_LEFT);
        System.out.print("\u001b[49");
    }

    public static void sleep(int milli){
      try{
        Thread.sleep(milli);
        }
        catch(Exception e){}
        }
    public static final String CLEAR_SCREEN =  "\u001b[2J";
    public static final String HIDE_CURSOR =  "\u001b[?25l";
    public static final String SHOW_CURSOR =  "\u001b[?25h";
    public static final String MOVE_CURSOR_TOP_LEFT =  "\u001b[H";
}
