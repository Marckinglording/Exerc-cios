public abstract class Peca {
    
    private String cor;
    private int posX;
    private int posY;

    public Peca(String cor, int posX, int posY) {

        this.cor = cor;
        this.posX = posX;
        this.posY = posY;

    }

    public abstract void mover(int novoX, int novoY);

    public String getCor() {
        return cor;
    }
    
    public int getPosX() {
        return posX;
    }

    public void setPosX(int novaPosX) {
        if (novaPosX >= 0) {
            this.posX = novaPosX;
        }
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int novaPosY) {
        if (novaPosY >= 0) {
            this.posY = novaPosY;
        }
    }

}
