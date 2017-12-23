import java.util.Scanner;

class Maba {
	String no_reg;
	String nama;
	String alamat;
	String telp;
	String jurusan;
	boolean statusPaid = false;


	void registrasi(){
		Scanner maba = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("=======PENERIMAAN MAHASISWA BARU =======");
		System.out.println("========================================");
		System.out.print("Masukkan nomor regitrasi = ");
		no_reg = maba.nextLine();
		System.out.print("Masukkan nama lengkap = ");
		nama = maba.nextLine();
		System.out.print("Masukkan alamat lengkap = ");
		alamat = maba.nextLine();
		System.out.print("Masukkan jurusan yang di pilih (TIF/TI/DKV) = ");
		jurusan = maba.nextLine();
		System.out.print("Masukkan nomor telp = "); 
		telp = maba.nextLine();
		System.out.println("========================================");

		statusPaid= true; 
	}

	boolean isPaid(){
		
		return statusPaid;
	}
}