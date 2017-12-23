public class Main {

	public static void main(String[] args) {
		Maba maba = new Maba();
		Akademik akad = new Akademik();
		Keuangan uang = new Keuangan();

 		maba.registrasi();
 		uang.cekKeuangan();
 		akad.cekregistrasi();

 		System.out.println(maba.no_reg);
 		System.out.println("Nama : "+maba.nama);
 		System.out.println("Jurusan yang di pilih : "+maba.jurusan);

 		akad.kirimNIM();
	}
}