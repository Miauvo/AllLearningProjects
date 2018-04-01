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
    public static final String ANSI_TEXT_LIGHT_GRAY =   "\u001B[37;7m"; //Светло серый

    public static final String ANSI_TEXT_DARK_RED =     "\u001B[41;108m";  //Бордовый
    public static final String ANSI_TEXT_DARK_GREEN =   "\u001B[42;108m";  //Темно зеленый
    public static final String ANSI_TEXT_DARK_YELLOW =  "\u001B[43;108m";  //Темно желтый
    public static final String ANSI_TEXT_DARK_BLUE =    "\u001B[44;108m";  //Темно синий
    public static final String ANSI_TEXT_DARK_PINK =    "\u001B[45;108m";  //Темно Розовый
    public static final String ANSI_TEXT_DARK_CYAN =    "\u001B[46;108m";  //Темно бирюзовый
    public static final String ANSI_TEXT_DARK_GRAY =    "\u001B[100;48m";  //Темно серый



    String color1 = ANSI_RESET_GRAY;
    String color2 = ANSI_RESET_GRAY;
    String color3 = ANSI_RESET_GRAY;
    String color4 = ANSI_RESET_GRAY;

    public String getColor(int R, int G, int B){
        String color = ANSI_RESET_GRAY;
        if ((R==G && R==B)){
            if (R==0)
                color = ANSI_RESET_BLACK;
            else if (R!=0&&R<127){
                color = ANSI_TEXT_DARK_GRAY;

            }
            else if (R>127)
                color = ANSI_TEXT_LIGHT_GRAY;
        }
        else if ((R==0)&&(G==0)){
            if (B>127)
                color = ANSI_TEXT_LIGHT_BLUE;
            else if (B<10)
            {    color = ANSI_TEXT_DARK_BLUE;}


        }

        else if ((B==0)&&(G==0)){
            if (R>127)
                color = ANSI_TEXT_LIGHT_RED;
            else
            {color = ANSI_TEXT_DARK_RED;}
        }
        else if ((R==0)&&(B==0)){
            if (G>127)
                color = ANSI_TEXT_LIGHT_GREEN;
            else{
                color = ANSI_TEXT_DARK_GREEN;}
        }
        else if (B==0){
            if ((R+G)>255)
                color =ANSI_TEXT_LIGHT_YELLOW;
            else
            {
                color =ANSI_TEXT_DARK_YELLOW;}
        }
        else if (R==0){
            if ((B+G)>255)
                color =ANSI_TEXT_LIGHT_CYAN;
            else
            {
                color =ANSI_TEXT_DARK_CYAN;}
        }
        else if (G==0){
            if ((B+R)>255)
                color =ANSI_TEXT_LIGHT_PINK;
            else{
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
        System.out.println("\n\u001B[34m Задание 11 (Доп.):\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("RRGGBB (Например: ff00ff)=" );
        String color=setColor(sc.nextLine());

        switch (color){
            case ANSI_RESET_BLACK:
            case ANSI_RESET_GRAY:
            case ANSI_TEXT_DARK_GRAY:
            case ANSI_TEXT_LIGHT_GRAY:
                color1 = "\u001b[100;7m";
                color2= "\u001b[100;6m";
                color3= "\u001b[40;6m";
                color4= "\u001b[40;7m";
                break;
            case ANSI_TEXT_DARK_BLUE:
            case ANSI_TEXT_LIGHT_BLUE:
                color1 = "\u001b[94;7m";
                color2= "\u001b[104;6m";
                color3= "\u001b[44;6m";
                color4= "\u001b[44;7m";
                break;
            case ANSI_TEXT_DARK_RED:
            case ANSI_TEXT_LIGHT_RED:
                color1 = "\u001b[91;7m";
                color2= "\u001b[101;6m";
                color3= "\u001b[41;6m";
                color4= "\u001b[41;7m";
                break;
            case ANSI_TEXT_DARK_GREEN:
            case ANSI_TEXT_LIGHT_GREEN:
                color1 = "\u001b[92;7m";
                color2= "\u001b[102;6m";
                color3= "\u001b[42;6m";
                color4= "\u001b[42;7m";
                break;
            case ANSI_TEXT_DARK_PINK:
            case ANSI_TEXT_LIGHT_PINK:
                color1 = "\u001b[95;7m";
                color2= "\u001b[105;6m";
                color3= "\u001b[45;6m";
                color4= "\u001b[45;7m";
                break;
            case ANSI_TEXT_DARK_CYAN:
            case ANSI_TEXT_LIGHT_CYAN:
                color1 = "\u001b[96;7m";
                color2= "\u001b[106;6m";
                color3= "\u001b[46;6m";
                color4= "\u001b[46;7m";
                break;
            case ANSI_TEXT_DARK_YELLOW:
            case ANSI_TEXT_LIGHT_YELLOW:
                color1 = "\u001b[93;7m";
                color2= "\u001b[103;6m";
                color3= "\u001b[43;6m";
                color4= "\u001b[43;7m";
                break;
        }


            System.out.println("░░░░"+color1+  "░"+"\u001b[40;107m"+   "░░░░");
            System.out.println("░░░"+color2+ "░░░"+"\u001b[40;107m"+   "░░░");
            System.out.println("░░"+color3+   "░░░░░"+"\u001b[40;107m"+   "░░");
            System.out.println("░"+color4+   "░░░░░░░"+"\u001b[40;107m"+   "░");


        System.out.println("");

        //System.out.println(color + "ЦВЕТ!");

//        for (int i = 30; i < 150; i++) {
//            System.out.println("");
//            for (int j = 0; j < 150; j++) {
//                System.out.print("\u001b["+i+";"+j+"m" + i + ";"+j+"\t");
//            }}

    }
}
