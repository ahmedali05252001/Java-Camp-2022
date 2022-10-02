public class Main {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        BaseKrediManager teachKrediManager = new TeacherKrediManager();
        krediUI.KrediHesapla(teachKrediManager);
        krediUI.KrediHesapla(new TeacherKrediManager());
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new SoldierKrediManager());
    }
}
