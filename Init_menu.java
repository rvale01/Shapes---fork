import java.util.*;
class Init_menu{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
     //stating the initial menu
    // Scanner scn = new Scanner(System.in);
    // System.out.println("Choose an option between this shapes:");
    // System.out.println("1-For Square");
    // System.out.println("2-For Rectangle ");
    // System.out.println("3-For Triangle ");
    // System.out.println("4-For Trapezium");
    // System.out.println("5-For Parallelogram");
    // System.out.println("6-For Rhombus");
    // System.out.println("7-For Kite");
    
    
    
   
    
     //initialization constructors
        
    Square s = new Square();
    Rectangle r = new Rectangle();
    Triangle t = new Triangle();
    Parallelogram p = new Parallelogram();
    Trapezium tr = new Trapezium();
    Rhombus rh = new Rhombus();
    Kite k = new Kite();
    
    //nested if-else method {to be improved}
    
    // if(im == '1'){ 
      // s.Square();  
    // } else if (im == '2'){
      // r.Rectangle();
    // } else if (im == '3'){
      // t.Triangle();
    // } else if (im == '4'){
      // p.Parallelogram();
    // } else if (im == '5'){
      // tr.Trapezium();
    // } else if (im == '6'){
      // rh.Rhombus();
    // } else if (im == '7'){
      // k.Kite();
    // } else {
      // System.out.print("Sorry not valid, re-run the program");
    // }
    boolean b = true;
    do{
         
        //stating the initial menu    
    System.out.println("Choose an option between this shapes:");
    System.out.println("1-For Square");
    System.out.println("2-For Rectangle ");
    System.out.println("3-For Triangle ");
    System.out.println("4-For Trapezium");
    System.out.println("5-For Parallelogram");
    System.out.println("6-For Rhombus");
    System.out.println("7-For Kite\n8-Exit");
    
    int option = scan.nextInt();
    
    switch(option){
        case 1: s.Square();
        break;
        case 2: r.Rectangle();
        break;
        case 3: t.Triangle();break;
        case 4: p.Parallelogram();break;
        case 5: tr.Trapezium();break;
        case 6: rh.Rhombus();break;
        case 7: k.Kite();break;
        case 8: b = false; break;
        
        default:{
        System.out.print("Sorry not valid");}
        break;
        }
    }while(b!=false);
  }
}