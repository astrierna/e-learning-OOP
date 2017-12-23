import java.util.Scanner;

class Mahasiswa {
	String nama;
	String nim;
	String kelas;
	String matkul1, matkul2, matkul3, matkul4;



	void datadiri(){
		Scanner maba = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("================PERWALIAN ==============");
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
	}

	boolean isRegistered(){
		if (statusRegist=true)
			System.out.println("Registrasi berhasil ");
		else
			System.out.println("Registrasi gagal");	
		
		return statusRegist;
	}
}