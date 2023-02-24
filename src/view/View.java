package view;

import java.util.Scanner;

public class View {
    Scanner console;
    public View(){
        console = new Scanner(System.in);
    }
    public int readInt(String message) {
        System.out.println(message);
        return console.nextInt();
    }
    public String menu(){
        String str= "1) Suma \n"
                +"2)Restar \n"
                +"3)Multiplicar \n"
                +"4)Dividir\n"
                +"5)Historial Operaciones\n"
                +"6)Ordena  oper resultad0\n"
                +"7)Mostrar Operacion \n"
                +"8)Salir";

        return str;
    }
    public  void showMessageInt(int x){
        System.out.println(x);
    }
    public void showMessage(String str){
        System.out.println(str);
    }
    public long readLong(String message) {
    	System.out.println(message);
    	return console.nextLong();
    }
}
