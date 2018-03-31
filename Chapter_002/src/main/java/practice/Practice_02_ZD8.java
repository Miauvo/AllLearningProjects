package practice;

import java.util.Scanner;

public class Practice_02_ZD8 {
    public static final String ANSI_RESET_BLACK =       "\u001B[30;0m";  //Черный
    public static final String ANSI_RESET_GRAY =        "\u001B[30;1m";  //Серый

    public static final String ANSI_TEXT_LIGHT_RED =    "\u001B[30;91m";  //Светло красный
    public static final String ANSI_TEXT_LIGHT_GREEN =  "\u001B[30;92m";  //Светло зеленый
    public static final String ANSI_TEXT_LIGHT_YELLOW = "\u001B[30;93m";  //Светло желтый
    public static final String ANSI_TEXT_LIGHT_BLUE =   "\u001B[30;94m";  //Светло синий
    public static final String ANSI_TEXT_LIGHT_PINK =   "\u001B[30;95m";  //Розовый
    public static final String ANSI_TEXT_LIGHT_CYAN =   "\u001B[30;96m";  //Голубой
    public static final String ANSI_TEXT_LIGHT_GRAY =   "\u001B[37;99m"; //Светло серый

    public static final String ANSI_TEXT_DARK_RED =     "\u001B[31;107m";  //Бордовый
    public static final String ANSI_TEXT_DARK_GREEN =   "\u001B[32;107m";  //Темно зеленый
    public static final String ANSI_TEXT_DARK_YELLOW =  "\u001B[33;107m";  //Темно желтый
    public static final String ANSI_TEXT_DARK_BLUE =    "\u001B[34;107m";  //Темно синий
    public static final String ANSI_TEXT_DARK_PINK =    "\u001B[35;107m";  //Темно Розовый
    public static final String ANSI_TEXT_DARK_CYAN =    "\u001B[36;107m";  //Темно бирюзовый
    public static final String ANSI_TEXT_DARK_GRAY =    "\u001B[30;90m";  //Темно серый




    public String getColor(int R, int G, int B){
        String color = ANSI_RESET_GRAY;
        if ((R==G && R==B)){
            if (R==0)
                color = ANSI_RESET_BLACK;
            else if (R!=0&&R<127)
                color = ANSI_TEXT_DARK_GRAY;
            else if (R>127)
                color = ANSI_TEXT_LIGHT_GRAY;
        }

        else if ((R==0)&&(G==0)){
            if (B>127)
                color = ANSI_TEXT_LIGHT_BLUE;
            else if (B<10)
                color = ANSI_TEXT_DARK_BLUE;
        }

        else if ((B==0)&&(G==0)){
            if (R>127)
                color = ANSI_TEXT_LIGHT_RED;
            else
                color = ANSI_TEXT_DARK_RED;
        }
        else if ((R==0)&&(B==0)){
            if (G>127)
                color = ANSI_TEXT_LIGHT_GREEN;
            else
                color = ANSI_TEXT_DARK_GREEN;
        }
        else if (B==0){
            if ((R+G)>255)
                color =ANSI_TEXT_LIGHT_YELLOW;
            else
                color =ANSI_TEXT_DARK_YELLOW;
        }
        else if (R==0){
            if ((B+G)>255)
                color =ANSI_TEXT_LIGHT_CYAN;
            else
                color =ANSI_TEXT_DARK_CYAN;
        }
        else if (G==0){
            if ((B+R)>255)
                color =ANSI_TEXT_LIGHT_PINK;
            else
                color =ANSI_TEXT_DARK_PINK;
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


    public Practice_02_ZD8(){
        System.out.println("\n\u001B[34m Задание 7 (Доп.):\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("RRGGBB=");
        String color1= setColor(sc.nextLine());
        System.out.print("RRGGBB=");
        String color2= setColor(sc.nextLine());
        System.out.print("RRGGBB=");
        String color3= setColor(sc.nextLine());

        System.out.println(color1+"          -----");
        System.out.println(color1+"        ---------");
        System.out.println(color2+"      -------------");
        System.out.println(color2+"    -----------------");
        System.out.println(color3+"  -----------------------");
        System.out.println(color3+"---------------------------");

        //System.out.println(color + "ЦВЕТ!");



    }
}
