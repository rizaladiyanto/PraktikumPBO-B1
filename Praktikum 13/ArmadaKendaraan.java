import java.util.ArrayList;
import java.util.List;

public class ArmadaKendaraan<T extends Vehicle> {
    private List<T> armada = new ArrayList<>();

    public void tambahArmada(List<? extends T> newArmada) {
        armada.addAll(newArmada);
    }

    public List<T> getAllArmada() {
        return armada;
    }
}
