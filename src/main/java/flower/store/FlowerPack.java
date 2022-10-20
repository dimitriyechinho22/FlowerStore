package flower.store;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;




@Getter @Setter @ToString
public class FlowerPack {
    private Flower flower;
    private int quantity;

    
    public double getPrice(){
        return this.quantity * this.flower.getPrice();
    }


}
