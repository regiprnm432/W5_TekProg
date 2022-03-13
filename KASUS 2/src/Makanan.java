public class Makanan {//Encapsulation
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	
	public Makanan() {//initialize data
		this.nama_makanan = "";
		this.harga_makanan = 0;
		this.stok = 0;
	}
	
	/*Membuat Accesor dan Mutator*/
	
	public String getNama_Makanan() {
		return nama_makanan;
	}
	
	public void setNama_Makanan(String nama_makanan) {
		this.nama_makanan = nama_makanan;
	}
	
	public double getHarga_Makanan() {
		return harga_makanan;
	}
	
	public void setHarga_Makanan(double harga_makanan) {
		this.harga_makanan = harga_makanan;
	}
	
	public int getStok() {
		return stok;
	}
	
	public void setStok(int stok) {
		this.stok = stok;
	}
}
