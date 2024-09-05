package edu.mx.uttt.ciclos;

public class Serie {
  //variable de intancia
  private int n;

  //constructor
  public Serie(){
        this.n = 1;
  }
  public Serie(int n){

    this.n =(n<=0)?1:n;
    }
public int getN() {
    return n;
}
public void setN(int n) {
    this.n = (n>0)?n:1;
}
public double calcularfor(){
    double r= 0.0;
    double i=1.0;
    for(int i = 1;i <= n; i++){
        r+= constante/i;
    }
    return r;
}

public double calcularWhile(){
    double r= 0.0;
    double constante =1.0;
    double i=1;

    While(i<=this.n){
        r+= constante/i;
        i++;
    }
    return r;
}


@Override
public String toString() {
    return "Serie [n=" + n + "]";
}
    
    
}
