package modelo;

public class Modelo implements InterdeDesenho {
    private int size;
    private int posicaox;
    private int posicaoy;
    
   
   

    public Modelo(int size, int posicaox, int posicaoy) {
        this.size = size;
        this.posicaox = posicaox;
        this.posicaoy = posicaoy;
        
    }



    public int getSize() {
        return size;
    }



    public void setSize(int size) {
        this.size = size;
    }

    public int getPosicaox() {
        return posicaox;
    }



    public void setPosicaox(int posicaox) {
        this.posicaox = posicaox;
    }



    public int getPosicaoy() {
        return posicaoy;
    }


    public void setPosicaoy(int posicaoy) {
        this.posicaoy = posicaoy;
    }



    public void Desenho(){

    }
    
}
