package practice;

import java.util.Scanner;

public class Practice_02_ZD11 {
    public static final String ANSI_RESET_BLACK =       "\u001B[40;98m";  //Черный
    public static final String ANSI_RESET_GRAY =        "\u001B[40;100m";  //Серый

    public static final String ANSI_TEXT_LIGHT_RED =    "\u001B[40;101m";  //Светло красный
    public static final String ANSI_TEXT_LIGHT_GREEN =  "\u001B[40;102m";  //Светло зеленый
    public static final String ANSI_TEXT_LIGHT_YELLOW = "\u001B[40;103m";  //Светло желтый
    public static final String ANSI_TEXT_LIGHT_BLUE =   "\u001B[40;104m";  //Светло синий
    public static final String ANSI_TEXT_LIGHT_PINK =   "\u001B[40;105m";  //Розовый
    public static final String ANSI_TEXT_LIGHT_CYAN =   "\u001B[40;106m";  //Голубой
    public static final String ANSI_TEXT_LIGHT_GRAY =   "\u001B[40;100m"; //Светло серый

    public static final String ANSI_TEXT_DARK_RED =     "\u001B[41;108m";  //Бордовый
    public static final String ANSI_TEXT_DARK_GREEN =   "\u001B[42;108m";  //Темно зеленый
    public static final String ANSI_TEXT_DARK_YELLOW =  "\u001B[43;108m";  //Темно желтый
    public static final String ANSI_TEXT_DARK_BLUE =    "\u001B[44;108m";  //Темно синий
    public static final String ANSI_TEXT_DARK_PINK =    "\u001B[45;108m";  //Темно Розовый
    public static final String ANSI_TEXT_DARK_CYAN =    "\u001B[46;108m";  //Темно бирюзовый
    public static final String ANSI_TEXT_DARK_GRAY =    "\u001B[40;100m";  //Темно серый


    boolean colorDark = false;

    public String getColor(int R, int G, int B){
        String color = ANSI_RESET_GRAY;
        if ((R==G && R==B)){
            if (R==0)
                color = ANSI_RESET_BLACK;
            else if (R!=0&&R<127){
                color = ANSI_TEXT_DARK_GRAY;
                colorDark=true;
            }
            else if (R>127)
                color = ANSI_TEXT_LIGHT_GRAY;
        }

        else if ((R==0)&&(G==0)){
            if (B>127)
                color = ANSI_TEXT_LIGHT_BLUE;
            else if (B<10)
            {    color = ANSI_TEXT_DARK_BLUE;
                colorDark=true;}

        }

        else if ((B==0)&&(G==0)){
            if (R>127)
                color = ANSI_TEXT_LIGHT_RED;
            else
            {color = ANSI_TEXT_DARK_RED;colorDark=true;}
        }
        else if ((R==0)&&(B==0)){
            if (G>127)
                color = ANSI_TEXT_LIGHT_GREEN;
            else{
                color = ANSI_TEXT_DARK_GREEN;colorDark=true;}
        }
        else if (B==0){
            if ((R+G)>255)
                color =ANSI_TEXT_LIGHT_YELLOW;
            else
            {
                color =ANSI_TEXT_DARK_YELLOW;colorDark=true;}
        }
        else if (R==0){
            if ((B+G)>255)
                color =ANSI_TEXT_LIGHT_CYAN;
            else
            {colorDark=true;
                color =ANSI_TEXT_DARK_CYAN;}
        }
        else if (G==0){
            if ((B+R)>255)
                color =ANSI_TEXT_LIGHT_PINK;
            else{colorDark=true;
                color =ANSI_TEXT_DARK_PINK;}
        }
        return color;
    }

    public String setColor(String A){
        int R = new Scanner(A.substring(0,2)).nextInt(16);
        int G = new Scanner(A.substring(2,4)).nextInt(16);
        int B = new Scanner(A.substring(4,6)).nextInt(16);
        System.out.format("RGB: (%d,%d,%d)%n",R,G,B);

        return getColor(R,G,B);
    }


    public Practice_02_ZD11(){
        System.out.println("\n\u001B[34m Задание 7 (Доп.):\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.println("RRGGBB=" + "FF00FF");
        String color="FF00FF";//setColor(sc.nextLine());


        if (colorDark){
            System.out.println(ANSI_TEXT_DARK_GRAY+"          -----");
            System.out.println(ANSI_TEXT_DARK_RED+"        ---------");
            System.out.println(ANSI_TEXT_DARK_GREEN+"      -------------");
            System.out.println(ANSI_TEXT_DARK_YELLOW+"    -----------------");
            System.out.println(ANSI_TEXT_DARK_BLUE+"  -----------------------");
            System.out.println(ANSI_TEXT_DARK_PINK+"---------------------------");
        }
        else {
            System.out.println(ANSI_TEXT_LIGHT_GRAY+"          -----");
            System.out.println(ANSI_TEXT_LIGHT_RED+"        ---------");
            System.out.println(ANSI_TEXT_LIGHT_GREEN+"      -------------");
            System.out.println(ANSI_TEXT_LIGHT_YELLOW+"    -----------------");
            System.out.println(ANSI_TEXT_LIGHT_BLUE+"  -----------------------");
            System.out.println(ANSI_TEXT_LIGHT_PINK+"---------------------------");
        }
        for (int i = 40; i < 50; i++) {
            System.out.println("");
            for (int j = 98; j < 109; j++) {
                System.out.print("\u001b[30;"+j+"m" + i + ";"+j+"\t");
            }

        }
        System.out.println("");
        System.out.println("\u001b[31;47m" + "text");
        //System.out.println(color + "ЦВЕТ!");



    }
}
