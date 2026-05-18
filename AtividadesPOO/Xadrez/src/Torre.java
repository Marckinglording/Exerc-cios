public class Torre extends Peca{
    
    public Torre(String cor, int posX, int posY) {
        super(cor, posX, posY);
    }

    @Override
    public void mover(int novoX, int novoY) {
        if(novoY == getPosY() || novoX == getPosX()) {
            setPosX(novoX);
            setPosY(novoY);
        }else {
            throw new IllegalArgumentException("A torre só pode se mover em linha reta!");
        }
    }

}
