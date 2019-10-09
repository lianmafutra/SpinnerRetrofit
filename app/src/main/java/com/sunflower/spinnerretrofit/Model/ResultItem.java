package com.sunflower.spinnerretrofit.Model;

import com.google.gson.annotations.SerializedName;


public class ResultItem{

	@SerializedName("SUM(laporan.rating)")
	private String sUMLaporanRating;

	@SerializedName("kontak")
	private String kontak;

	@SerializedName("Foto")
	private String foto;

	@SerializedName("id_masalah")
	private String idMasalah;

	@SerializedName("rating_dinas")
	private String ratingDinas;

	@SerializedName("id_laporan")
	private Object idLaporan;

	@SerializedName("kantor_dinas")
	private String kantorDinas;

	@SerializedName("id_kantor_dinas")
	private String idKantorDinas;

	@SerializedName("alamat")
	private String alamat;

	public void setSUMLaporanRating(String sUMLaporanRating){
		this.sUMLaporanRating = sUMLaporanRating;
	}

	public String getSUMLaporanRating(){
		return sUMLaporanRating;
	}

	public void setKontak(String kontak){
		this.kontak = kontak;
	}

	public String getKontak(){
		return kontak;
	}

	public void setFoto(String foto){
		this.foto = foto;
	}

	public String getFoto(){
		return foto;
	}

	public void setIdMasalah(String idMasalah){
		this.idMasalah = idMasalah;
	}

	public String getIdMasalah(){
		return idMasalah;
	}

	public void setRatingDinas(String ratingDinas){
		this.ratingDinas = ratingDinas;
	}

	public String getRatingDinas(){
		return ratingDinas;
	}

	public void setIdLaporan(Object idLaporan){
		this.idLaporan = idLaporan;
	}

	public Object getIdLaporan(){
		return idLaporan;
	}

	public void setKantorDinas(String kantorDinas){
		this.kantorDinas = kantorDinas;
	}

	public String getKantorDinas(){
		return kantorDinas;
	}

	public void setIdKantorDinas(String idKantorDinas){
		this.idKantorDinas = idKantorDinas;
	}

	public String getIdKantorDinas(){
		return idKantorDinas;
	}

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}

	public String getAlamat(){
		return alamat;
	}

	@Override
 	public String toString(){
		return 
			"ResultItem{" + 
			"sUM(laporan.rating) = '" + sUMLaporanRating + '\'' + 
			",kontak = '" + kontak + '\'' + 
			",foto = '" + foto + '\'' + 
			",id_masalah = '" + idMasalah + '\'' + 
			",rating_dinas = '" + ratingDinas + '\'' + 
			",id_laporan = '" + idLaporan + '\'' + 
			",kantor_dinas = '" + kantorDinas + '\'' + 
			",id_kantor_dinas = '" + idKantorDinas + '\'' + 
			",alamat = '" + alamat + '\'' + 
			"}";
		}
}