public class Cavalo extends Peca{
    
    public Cavalo(String cor, int posX, int posY) {
        super(cor, posX, posY);
    }

    @Override
    public void mover(int novoX, int novoY) {
        
        if((Math.abs(novoY - getPosY()) == 2 && Math.abs(novoX - getPosX()) == 1) 
        || (Math.abs(novoY - getPosY()) == 1 && Math.abs(novoX - getPosX()) == 2)) {
            
            setPosX(novoX);
            setPosY(novoY);

        }else {
            throw new IllegalArgumentException("O Cavalo só pode se mover em L!");
        }
    }

}
