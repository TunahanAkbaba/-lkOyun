/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oyun1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MSi
 */
public class Heroes{
    Scanner take = new Scanner(System.in);
    Scanner choose= new Scanner(System.in);
    Random lucky=new Random();
    int orders;
    int health;
    int attack;
    int defence;
    int hero;
    
    
    public int heroPick(int hero){
        this.hero=hero;
        switch(hero){
            case 1:
                  System.out.println("You pick kngiht!!");
                  System.out.println("  |\n" +
"  |\n" +
"  + \\\n" +
"  \\\\.G_.*=.\n" +
"   `(#'/.\\|\n" +
"    .>' (_--.\n" +
" _=/d   ,^\\\n" +
"~~ \\)-'   '\n" +
"   / |   \n" +
"  '  '");
                  break;
            case 2:   
                System.out.println("You pick archer!!");
                System.out.println("    /\\   \n" +
"  _c_(_\n" +
"   |\\/\n"+
"   |   \n" +
"   L");
                  break;
            case 3:
                System.out.println("You pick mage!!");
                System.out.println("            ,    _\n" +
"           /|   | |\n" +
"         _/_\\_  >_<\n" +
"        .-\\-/.   |\n" +
"       /  | | \\_ |\n" +
"       \\ \\| |\\__(/\n" +
"       /(`---')  |\n" +
"      / /     \\  |\n" +
"   _.'  \\'-'  /  |\n" +
"   `----'`=-='   '");
                    break;
    
    }
        return hero;
}
    public void stat(){
        
        switch(this.hero){
            case 1:
                System.out.println("Knight Health:1000");
                System.out.println("Knight Atack:200");
                System.out.println("Knight Defence:700");
                break;
                case 2:
                System.out.println("Archer Health:500");
                System.out.println("Archer Atack:600");
                System.out.println("Archer Defence:500");
                break;
                case 3:
                System.out.println("Mage Health:600");
                System.out.println("Mage Atack:800");
                System.out.println("Mage Defence:300");
                break;
        }
        
        
    
    }
    public void ıtem(){
        
        switch(this.hero){
            case 1:
                System.out.println("Knight Item!!");
                System.out.println("Knight Helmet");
                System.out.println("Knight Armor");
                System.out.println("Knight Spear");
                System.out.println("Knight Horse");
                break;
                case 2:
                System.out.println("Archer Glove");
                System.out.println("Archer Bow");
                System.out.println("Archer Boot");
                break;
                case 3:
                System.out.println("Mage Magical Stick");
                System.out.println("Mage Cloak");
                System.out.println("Mage Aura");
                break;
        }
        
}
    
            

 public void order(){
     
     if (this.hero==1) {
         
            System.out.println("ORDERS!!!\n1-ATTACK\n2-DEFENCE\n3-ESCAPE");
            orders=choose.nextInt();
        switch(orders){
            case 1:
                System.out.println("Attack!!");
                System.out.println("    \\\n" +
"    .G_.*=.        \n" +
"   /(#'/.\\| ☰ ☰ ☰ ▷\n" +
"   \\_.>' (_--.     \n" +
" _=/d   ,^\\\n" +
"~~ \\)-'   '\n" +
"   / |   \n" +
"  '  '");
                System.out.println();
                break;
                case 2:
                                      System.out.print("  |\n" +
"  |\n" +
"  + \\        "          +"  |`-._/\\_.-`|\n"+
"  \\\\.G_.*=.  " + "  |    ||    |\n"+
"   `(#'/.\\|  " +  "  |___o()o___|\n"+
"    .>' (_--." + "  |__((<>))__|\n"+
" _=/d   ,^\\  " +  "  \\   o\\/o   /\n"+
"~~ \\)-'   '  " +  "   \\   ||   /\n"+
"   / |       " +     "    \\  ||  /\n"+
"  '  '          "+       "  '.||.'");

                
                break;
                case 3:
                    System.out.println(
           "  |\n" +
"  |\n" +
"  + \\\n" +
"  \\\\.G_.*=." +"--_-_-_-_---\n"+
"   `(#'/.\\|" +"    -_-_-\n"+
"    .>' (_--." +"     -__-\n"+
" _=/d   ,^\\" + "    _-_\n"+
"~~ \\)-'   '" + "   _-\n"+
"   / |   " +     "   -_\n" +
 "  '  '"          +    "    _-_"   
   );
                           

                break;
        }
      }
        if (this.hero==2) {
         
            System.out.println("ORDERS!!!\n1-ATTACK\n2-DEFENCE\n3-ESCAPE");
            orders=choose.nextInt();
        switch(orders){
            case 1:
                System.out.println("Attack!!");
                System.out.println("                                                        |\n" +
"                                                         \\.\n" +
"                                                         /|.\n" +
"                                                       /  `|.\n" +
"                                                     /     |.\n" +
"                                                   /       |.\n" +
"                                                 /         `|.\n" +
"                                               /            |.\n" +
"                                             /              |.\n" +
"                                           /                |.\n" +
"      __                                 /                  `|.\n" +
"       -\\                              /                     |.\n" +
"         \\\\                          /                       |.\n" +
"           \\\\                      /                         |.\n" +
"            \\|                   /                           |\\\n" +
"              \\#####\\          /                             ||\n" +
"          ==###########>     /                               ||\n" +
"           \\##==      \\    /                                 ||\n" +
"      ______ =       =|__/___                                ||\n" +
"  ,--' ,----`-,__ ___/'  --,-`-==============================##==========>\n" +
" \\               '        ##_______ ______   ______,--,____,=##,__\n" +
"  `,    __==    ___,-,__,--'#'  ==='      `-'              | ##,-/\n" +
"    `-,____,---'       \\####\\              |        ____,--\\_##,/\n" +
"        #_              |##   \\  _____,---==,__,---'         ##\n" +
"         #              ]===--==\\                            ||\n" +
"         #,             ]         \\                          ||\n" +
"          #_            |           \\                        ||\n" +
"           ##_       __/'             \\                      ||\n" +
"            ####='     |                \\                    |/\n" +
"             ###       |                  \\                  |.\n" +
"             ##       _'                    \\                |.\n" +
"            ###=======]                       \\              |.\n" +
"           ///        |                         \\           ,|.\n" +
"           //         |                           \\         |.\n" +
"                                                    \\      ,|.\n" +
"                                                      \\    |.\n" +
"                                                        \\  |.\n" +
"                                                          \\|.\n" +
"                                                          /.\n" +
"                                                         |");
                System.out.println();
                break;
                case 2:
                                      System.out.print(
"                                                                                         /¯¯\\        \n"+
"                                                         /|." +"                             \\__/          \n"+
"                                                       /  `|." +"                             ||        \n"+
"                                                     /     |." +"                             ||          \n"+
"                                                   /       |." +"                            |  |           \n"+
"                                                 /         `|." +"                           |  |      \n"+
"                                               /            |." +"                           |  |         \n"+
"                                             /              |." +"                           |  |             \n"+
"                                           /                |." +"                           |  |           \n"+
"      __                                 /                  `|." +"                      .--.----.--.\n"+
"       -\\                              /                     |." +"                    .-----\\__/-----.\n"+
"         \\\\                          /                       |." +"           ___---¯¯////¯¯|\\/|¯¯\\\\\\\\¯¯---___\n"+
"           \\\\                      /                         |." +"          /¯¯ __O_--////   |  |   \\\\\\\\--_O__ ¯¯\\\n"+
"            \\|                   /                           |\\" +"         | O?¯      ¯¯¯    |  |    ¯¯¯      ¯?O |\n"+
"              \\#####\\          /                             ||" +"         |  '    _.-.      |  |      .-._    '  |\n"+
"          ==###########>     /                               ||" + "          |O|    ?..?      ./  \\.      ?..?    |O|\n"+
"           \\##==      \\    /                                 ||" +"         | |     '?. .-.  | /\\ |  .-. .?'     | |\n"+
"      ______ =       =|__/___                                ||" +"           | ---__  ¯?__?  /|\\¯¯/|\\  ?__?¯  __--- |\n"+
"  ,--' ,----`-,__ ___/'  --,-`-==============================##==========>" +"|O     \\         ||\\/ |         /     O|\n"+
" \\               '        ##_______ ______   ______,--,____,=##,__" +"       |       \\  /¯?_  ||   |  _?¯\\  /       |\n"+
"  `,    __==    ___,-,__,--'#'  ==='      `-'              | ##,-/" +"        |       / /    - ||   | -    \\ \\       |\n"+
"    `-,____,---'       \\####\\              |        ____,--\\_##,/" +"      |O   __/  | __   ||   |   __ |  \\__   O|\n"+
"        #_              |##   \\  _____,---==,__,---'         ##" +"          | ---     |/  -_/||   |\\_-  \\|     --- | \n"+
"         #              ]===--==\\                            ||" +"          |O|            \\ ||   | /            |O|\n"+
"         #,             ]         \\                          ||" +"           \\ '              ||   |        ^~DLF ' /\n"+
"          #_            |           \\                        ||" +"            \\O\\    _-¯?.    ||   |    .?¯-_    /O/\n"+
"           ##_       __/'             \\                      ||" +"             \\ \\  /  /¯¯¯?  ||   |  ?¯¯¯\\  \\  / /\n"+
"            ####='     |                \\                    |/" +"              \\O\\/   |      ||   |      |   \\/O/\n"+
"             ###       |                  \\                  |." +"               \\     |      ||   |      |     /    \n"+
"             ##       _'                    \\                |." +"                 '.O  |_     ||   |     _|  O.'    \n"+
"            ###=======]                       \\              |." +"                    '._O'.__/||   |\\__.'O_.'     \n"+
"           ///        |                         \\           ,|." +"                       '._ O ||   | O _.'     \n"+
"           //         |                           \\         |." +"                           '._||   |_.'       \n"+
"                                                    \\      ,|." +"                              ||   |         \n"+
"                                                      \\    |." +"                               ||   |         \n"+
"                                                        \\  |." +"                              | \\/ |          \n"+
"                                                          \\|." +"                              |  | |        \n"+
"                                                          /." +"                                 \\ |/         \n"+
"                                                         |            "+"                         \\/         \n");                  
                       
                break;
                case 3:
                    System.out.println(

"  /\\" +"--_-_-_-_---\n"+
" /__\\_{)" +"    -_-_-\n"+
"|--<<)__\\" +"     -__-\n"+
" \\  /  (" + "    _-_\n"+
"   \\/ __)" + "   _-\n"+
"    \\ |__" +     "   -_\n" +
 "    ~    ~"          +    "    _-_"   

   );
                           

                break;
                }
         
            }
        if (this.hero==3) {
         
            System.out.println("ORDERS!!!\n1-ATTACK\n2-DEFENCE\n3-ESCAPE");
            orders=choose.nextInt();
        switch(orders){
            case 1:
                System.out.println("Attack!!");
                System.out.println("               . '@(@@@@@@@)@. (@@) `  .   '\n" +
"     .  @@'((@@@@@@@@@@@)@@@@@)@@@@@@@)@ \n" +
"     @@(@@@@@@@@@@))@@@@@@@@@@@@@@@@)@@` .\n" +
"  @.((@@@@@@@)(@@@@@@@@@@@@@@))@\\@@@@@@@@@)@@@  .\n" +
" (@@@@@@@@@@@@@@@@@@)@@@@@@@@@@@\\\\@@)@@@@@@@@)\n" +
"(@@@@@@@@)@@@@@@@@@@@@@(@@@@@@@@//@@@@@@@@@) ` \n" +
" .@(@@@@)##&&&&&(@@@@@@@@)::_=(@\\\\@@@@)@@ .   .'\n" +
"   @@`(@@)###&&&&&!!;;;;;;::-_=@@\\\\@)@`@.\n" +
"   `   @@(@###&&&&!!;;;;;::-=_=@.@\\\\@@     '\n" +
"      `  @.#####&&&!!;;;::=-_= .@  \\\\\n" +
"            ####&&&!!;;::=_-        `\n" +
"             ###&&!!;;:-_=\n" +
"              ##&&!;::_=\n" +
"             ##&&!;:=\n" +
"            ##&&!:-\n" +
"           #&!;:-\n" +
"          #&!;=\n" +
"          #&!-\n" +
"           #&=\n" +
"            #&-\n" +
"            \\\\#/'\n" +
" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println();
                break;
                case 2:
                                      System.out.print(
                                              
                                              
                                              
 "                  "    +     "                       _ -  / -  _\n"        +                            
 "                  "   +     "                     -      /       -\n"        +                             
 "                  "  +"                -        /         -   \n"          +               
"                  "   +  "                -          /           -\n"+     
"                   "  +"              _           /            _\n"        +                          
"                  "  +    "                _           /             _\n"+                                        
"                  "   +    "              ( / / / / / / 0/ / / / / / / )\n"   +                                  
"                  "    +    "              0 _           /            _ 0\n"   +                                   
"                  "  +     "              #  _          /           _  #\n"    +                                   
"                  "+"              #   _         /          _   #\n"+
"                  "+"              #     _       /        _     #\n"+
"            ,    _" +"              0        -  _ / _   -        0\n"+
"           /|   | |" +"           /I\\            0             /I\\\n"+
"         _/_\\_  >_<" +"         //I\\\\           #            //I\\\\\n"+
"        .-\\-/.   |" +"          //I\\\\           #            //I\\\\\n"+
"       /  | | \\_ |" +"          //I\\\\           0            //I\\\\\n"+
"       \\ \\| |\\__(/" +"           /I\\           /I\\            /I\\\n"+
"       /(`---')  |" +"                         //I\\\\            \n"+
"      / /     \\  |" +"                         //I\\\\\n"+
"   _.'  \\'-'  /  |" +"                        //I\\\\\n"+
"   `----'`=-='   '"+"                          /I\\\n");         
                                                              
                break;
                case 3:
                    System.out.println(
"            ,    _"+"--_-_-_--_-_-_-_-_-_-_-_-_-_-\n"+
"           /|   | |"+"--_-_-_--_-_-_-_-_-_-_-_-_--\n"+
"         _/_\\_  >_<"+"--_-_-_-_-_-_-_-_--\n"+
"        .-\\-/.   |" +"--_-_-_-_-_-_-_--_--\n"+
"       /  | | \\_ " +"    -_-_-\n"+
"       \\ \\| |\\__(/" +"  -__-\n"+
"       /(`---')  |" + "    _-_\n"+
"      / /     \\  |" + "   _-\n"+
"   _.'  \\'-'  /  |" +  "   -_\n" +
 "   `----'`=-='   '" +  "    _-_"   

   );
                break;
                }
         
     }
        }
    }



