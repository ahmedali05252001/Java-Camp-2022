import overriding.BaseKrediManager;
import overriding.OgrenciKrediManager;
import overriding.OgretmenKrediManager;
import overriding.TarimKrediManager;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] KrediManagers = new BaseKrediManager[] { new TarimKrediManager(),
                new OgretmenKrediManager(), new OgrenciKrediManager() };
        for (BaseKrediManager KrediManager : KrediManagers) {
            System.out.println(KrediManager.hesapla(20000));
        }
    }
}
