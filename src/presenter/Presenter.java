package presenter;
import model.Calculator;
import view.View;
public class Presenter {
    Calculator calculator;
    View view;

    public Presenter() {
        calculator = new Calculator();
        view = new View();
    }
    public void ejecutar(){
        int opcion= 0;
        do {
            opcion =view.readInt(view.menu());
            switch (opcion) {
                case 1:
                	calculator.addition(view.readLong("ingrese  1er numero: "),view.readLong("ingrese el 2ndo numero: "));
                    break;
                case 2:
                	calculator.substract(view.readLong("ingrese  1er numero: "), view.readLong("ingrese el 2ndo numero: "));
                    break;
                case 3:
                	calculator.Multiplicate(view.readLong("ingrese  1er numero: "), view.readLong("ingrese el 2ndo numero: "));

                    break;
                case 4:
                	calculator.dividir(view.readLong("ingrese  1er numero: "), view.readLong("ingrese el 2ndo numero: "));
                    break;
                case 5:	
                	
                    break;
                case 7:

                    break;
                case 8:
                    view.showMessage("programa finalizado");
                    break;
                default:
                    view.showMessage("!error¡");
                    break;
            }
        }while(opcion!=8);
    }

    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        presenter.ejecutar();
    }

}
