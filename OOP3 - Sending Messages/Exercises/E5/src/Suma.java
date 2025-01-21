public class Suma {
    public  int Suma(int a, int b){
        return a+b;
    }

    public  int Suma(int a, int b, int c){
        return this.Suma(a,b) + c;
    }


    public  int Suma(int a, int b, int c, int d){
        return this.Suma(a,b,c) + d;
    }
}
