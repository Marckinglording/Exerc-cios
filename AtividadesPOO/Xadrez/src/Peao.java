public class Peao extends Peca {

    public Peao(String cor, int posX, int posY) {
        super(cor, posX, posY);
    }

    @Override
    public void mover(int novoX, int novoY) {
        if(novoY == (getPosY() + 1) && novoX == getPosX()) {
            setPosY(novoY);
        }else {
            throw new IllegalArgumentException("O peão só pode se mover uma cada para frente por jogada!");
        }
    }

}
