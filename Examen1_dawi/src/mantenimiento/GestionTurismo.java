package mantenimiento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import interfaces.TurismoInterface;
import models.Categoria;
import models.Paquete;
import util.MySQLConexion;

public class GestionTurismo implements TurismoInterface {

	@Override
	public ArrayList<Categoria> listaCategorias() {
		// TODO Auto-generated method stub
		ArrayList<Categoria> lista = new ArrayList<Categoria>();
		Categoria categoria = null;
		PreparedStatement pst = null;
		Connection con = null;
		ResultSet rs = null;

		try {
			String cadena = "select * from tb_categoria";
			con = MySQLConexion.getConexion();
			pst = con.prepareStatement(cadena);
			rs = pst.executeQuery();
			while (rs.next()) {
				categoria = new Categoria();
				categoria.setIdcategoria(rs.getInt(1));
				categoria.setDescripcion(rs.getString(2));
				lista.add(categoria);
			}

		} catch (SQLException sql) {
			System.out.println("ERROR SQL:" + sql);

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lista;
	}

	@Override
	public int registrarPaquete(Paquete p) {
		// TODO Auto-generated method stub
		int i = 0;
		PreparedStatement pst = null;
		Connection con = null;
		try {
			con = MySQLConexion.getConexion();
			//insert into tb_paquetes(descripcion,dias,precio,idcategoria) values("Paquete para Casados s/niños",4,230,1);

			String sql ="insert into tb_paquetes(descripcion,dias,precio,idcategoria) values(?,?,?,?)";
			
			pst= con.prepareStatement(sql);
			
			pst.setString(1, p.getDescripcion());
			pst.setInt(2, p.getDias());
			pst.setDouble(3, p.getPrecio());
			pst.setInt(4, p.getIdcategoria());
			
			i = pst.executeUpdate();
			
		} catch (SQLException sql) {
			System.out.println("ERROR SQL:" + sql);

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}

}
