public class Zaidan extends Mahasiswa {

    @Override
    protected String kuliah() {
        return super.kuliah();
    }

    @Override
    public void lulus() {
        System.out.println("Persentase kelulusan : 40% UAS, 30% UTS, 20% Tugas & Quiz, dan 10% Kehadiran");
    }
	
	@Override
    public void tidaklulus() {
        System.out.println("Jika persentasenya sangat kurang, maka kemungkinan besar tidak lulus");
    }

    public static void main(String[] args) {
        Zaidan mhs = new Zaidan();
        mhs.kuliah();
		mhs.lulus();
		mhs.tidaklulus();
    }

}