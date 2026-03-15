package figuras;
import java.awt.Color;
public class Rectángulo extends Figura{
private double b;
private double a;
public Rectángulo (double x, double y, Color color, double b, double a){
super (x, y, color);this.b = base;this.a = altura;
}
public double getBase(){return b;}
public double getAltura(){return a;}
public void setBase(double base){this.b = base;}
public void setAltura(double altura){this.a = altura;}
public double perímetro (){return 2 * b + 2 * a;}
public double área (){return b * a;}
}
