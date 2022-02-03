package techproed.jdbcOrnekler;

import java.sql.*;

public class Jdbc1Query02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root",
				"2244");
		;

		Statement st = con.createStatement();

		/*
		 * ======================================================================= //
		 * ORNEK1: Bolumler tablosundaki tum kayitlari listeleyen bir sorgu yaziniz. //
		 * ========================================================================
		 */

		ResultSet tablo = st.executeQuery("SELECT * from bolumler");

		while (tablo.next()) {
			System.out.println(tablo.getInt(1) + " " + tablo.getString("bolum_isim") + " " + tablo.getString(3));
		}

		System.out.println("========================================");

//		/*=======================================================================
//		 ORNEK2: SATIS ve MUHASEBE bolumlerinde calisan personelin isimlerini ve 
//		 maaslarini, maas ters sirali olarak listeleyiniz
//		========================================================================*/ 

		ResultSet tablo2 = st.executeQuery(
				"SELECT isim, maas " + " FROM personel " + " WHERE bolum_id in(10,30)" + " ORDER BY maas DESC");

		while (tablo2.next()) {

			System.out.println(tablo2.getString(1) + "\t" + tablo2.getInt(2));
		}
		System.out.println("========================================");

//		/*=======================================================================
//		  ORNEK3: Tüm bolumlerde calisan personelin isimlerini, bolum isimlerini 
//		  ve maaslarini, bolum ve maas sirali listeleyiniz. NOT: calisani olmasa 
//		  bile bolum ismi gosterilmelidir.
//		========================================================================*/ 
//	

		ResultSet tablo3 = st.executeQuery("select b.bolum_isim, p.isim, p.maas from bolumler b left join personel p "
				+ " on p.bolum_id=b.bolum_id " + " ORDER BY b.bolum_isim, p.maas");

		while (tablo3.next()) {
			System.out.println(tablo3.getString(1) + "\t " + tablo3.getString(2) + "\t " + tablo3.getInt(3));

		}
		System.out.println("==========TABLO 4=============");

		/*
		 * ======================================================================= //
		 * ORNEK4: Maasi en yuksek 10 kisinin bolumunu,adini ve maasini listeyiniz //
		 * ========================================================================
		 */
		ResultSet veri4 = st.executeQuery("select b.bolum_isim, p.isim, p.maas from personel p "
				+ "left join bolumler b on p.bolum_id=b.bolum_id order by maas desc limit 10");
		
		while (veri4.next()) {
			System.out.println(
					  veri4.getString("b.bolum_isim") + "\nPersonel isim : "
							+ veri4.getString("p.isim") + "\nPersonel maas :  " + veri4.getInt("p.maas"));
		
			System.out.println("=====================================");

		}

		con.close();
		st.close();
		

	}
}