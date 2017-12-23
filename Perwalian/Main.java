public class Main {

	public static void main(String[] args) {
		Maba maba = new Maba();
		Akademik akad = new Akademik();
		Keuangan uang = new Keuangan();

 		maba.registrasi();
 		uang.cekKeuangan();
 		akad.cekregistrasi();
 		akad.kirimNIM();
	}
}