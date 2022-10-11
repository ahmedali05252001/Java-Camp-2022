package AbstractClasses;

import javax.swing.plaf.metal.MetalBorders.PopupMenuBorder;

//override edilmesini zorunlu kilmisim
public abstract class GameCalculator {
    public abstract void calculate();

    // override edilmesini engellemis oluyorum
    public final void gameOver() {
        System.out.println("Game is over.");
    }
}
